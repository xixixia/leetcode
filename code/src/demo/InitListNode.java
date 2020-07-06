package demo;

public class InitListNode {

    public static ListNode init(int[] nums){
        ListNode head=null;
        int index=nums.length-1;
        while (index>=0){
            ListNode node=new ListNode(nums[index]);
            node.next=head;
            head=node;

            index--;
        }
        return head;
    }

    public static void print(ListNode listNode){
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}
