package demo;

public class Demo19 {

    public static void main(String[] args) {
        int[] nums = {1,2};
        ListNode listNode = InitListNode.init(nums);
//        ListNode dummy = new ListNode(-1);
//        dummy.next = listNode;
//        listNode = dummy;
//        int k = 0;
//        while (k > 0) {
//            listNode = listNode.next;
//            k--;
//        }
//        listNode.next = listNode.next.next;
//        InitListNode.print(dummy);
        InitListNode.print(removeNthFromEnd(listNode, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        int k = len - n;
        head = dummy;
        while (k > 0) {
            head = head.next;
            k--;
        }
        head.next = head.next.next;
        return dummy.next;


    }

}
