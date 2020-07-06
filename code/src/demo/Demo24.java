package demo;

public class Demo24 {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        ListNode node = InitListNode.init(nums);
        ListNode listNode = swapPairs(node);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        while (head!=null&&head.next!=null){
            dummy.next=head.next;
            head.next=head.next.next;
            head.next.next=head;
        }
        return dummy.next;
    }
}
