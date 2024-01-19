public class Merge_Nodes_in_Between_Zeros {
    public static void main(String[] args) {
        ListNode head=new ListNode(0);
        head.next=new ListNode(1);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(0);
        head.next.next.next.next.next=new ListNode(2);
        head.next.next.next.next.next.next=new ListNode(2);
        head.next.next.next.next.next.next.next=new ListNode(0);

        ListNode.print(head);
        ListNode ans=mergeNodes(head);
        ListNode.print(ans);
    }
    public static ListNode mergeNodes(ListNode head) {
        ListNode ansHead=null,ansTail=null;
        int count=0;
        head=head.next;
        while(head != null){
            if(head.val == 0){
                if(ansHead==null){
                    ansHead=ansTail=new ListNode(count);
                }else{
                    ansTail.next=new ListNode(count);
                    ansTail=ansTail.next;
                }
                count=0;
            }else{
                count+=head.val;
            }
            head=head.next;
        }
        return ansHead;
    }
}
