public class Remove_Nth_Node_from_Last {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2));
        head=removeNthFromEnd(head,1);
        ListNode.print(head);

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int count=0;
        while(curr != null){
            curr=curr.next;
            count++;
        }
        Boolean flag=false;
        curr=null;
        for(int i=1;i<=count-n;i++){
            if(i==1){
                curr=head;
                continue;
            }
            curr= curr.next;
            flag=true;
        }
        if(!flag && curr==null){
            return head.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
