package demo;

public class Demo21 {

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1, 3, 4, 6, 8, 9};
        ListNode l1 = InitListNode.init(nums1);
        ListNode l2 = InitListNode.init(nums2);
        ListNode listNode = mergeTwoLists(l1, l2);
        InitListNode.print(listNode);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode result = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        while (l1 != null) {
            head.next = l1;
            l1 = l1.next;
            head = head.next;
        }
        while (l2 != null) {
            head.next = l2;
            l2 = l2.next;
            head = head.next;
        }
        return result.next;
    }
}
