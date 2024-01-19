public class Delete_Middle_Node {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head=deleteMiddle(head);
        ListNode.print(head);
    }
    public static ListNode deleteMiddle(ListNode head) {
        int count=0;
        ListNode curr=head;
        while(curr != null){
            count++;
            curr=curr.next;
        }
        if(count==1){
            return null;
        }
        curr=head;
        for(int i=0;i<(count/2)-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
