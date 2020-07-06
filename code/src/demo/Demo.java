package demo;

public class Demo {

    public static void main(String[] args) {
        int n = 100;
        ListNode node = new ListNode(-1);
        ListNode head = node;
        for (int i = 1; i <= n; i++) {
            ListNode p = new ListNode(i);
            node.next = p;
            node = node.next;
        }
        node.next = head.next;
        head = head.next;
        int num = 1;
        while (head.next != null && head != head.next) {
            num++;
            if (num % 3 == 0) {
                num = 1;
                head.next = head.next.next;
            }
            head = head.next;
        }
        System.out.println(head.val);

    }
}
