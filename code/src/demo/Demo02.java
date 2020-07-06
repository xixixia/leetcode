package demo;

/**
 * 链表遍历
 * 采用next保存是否有进位
 *  若两个链表遍历结束还有进位，则result链表添加值为1的节点
 */
public class Demo02 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-1);
        ListNode head1 = l1;
        int[] nums1 = new int[]{3, 4, 2};
        for (int i = 0; i < nums1.length; i++) {
            l1.next = new ListNode(nums1[i]);
            l1 = l1.next;
        }


        ListNode l2 = new ListNode(-1);
        ListNode head2 = l2;
        int[] nums2 = new int[]{4, 6, 5};
        for (int i = 0; i < nums1.length; i++) {
            l2.next = new ListNode(nums2[i]);
            l2 = l2.next;
        }
        ListNode result = addTwoNumbers(head1.next, head2.next);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode head = result;
        int next = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + next;
            if (val / 10 == 1) {
                val = val % 10;
                next = 1;
            } else {
                next = 0;
            }
            result.next = new ListNode(val);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int val = l1.val + next;
            if (val / 10 == 1) {
                val = val % 10;
                next = 1;
            } else {
                next = 0;
            }
            result.next = new ListNode(val);
            result = result.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int val = l2.val + next;
            if (val / 10 == 1) {
                val = val % 10;
                next = 1;
            } else {
                next = 0;
            }
            result.next = new ListNode(val);
            result = result.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 == null && next == 1) {
            result.next = new ListNode(next);
            result = result.next;
        }
        return head.next;
    }

}
