public class Reverse_LinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        ListNode.print(head);

        head=reverseLL(head);
        ListNode.print(head);
    }

    public static ListNode reverseLL(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode newHead=reverseLL(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
}
