package demo;

public class Demo206 {


    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        ListNode node = new ListNode(-1);
        ListNode head = node;
        for (int i : list) {
            node.next = new ListNode(i);
            node = node.next;
        }
        ListNode listNode = reverseList1(head.next);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = result;
            result = head;

            head = temp;
        }
        return result;
    }

    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}
