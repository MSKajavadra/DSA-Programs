public class Test {
    public static void main(String[] args) {
       ListNode head = removeZeroSumSublists(ListNode.arrayToLinkedList(new int[]{1,2,3,-3,4}));
       ListNode.print(head);
    }
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode curr=head,temp=head;
        while(curr!=null){
            int sum=curr.val;
            ListNode curr2=curr.next;
            while(curr2!=null){
                sum+=curr2.val;
                if(sum==0){
                    if(curr==head){
                        return curr2.next;
                    }else{
                        temp.next=curr2.next;
                        return head;
                    }
                }
                curr2=curr2.next;
            }
            temp=curr;
            curr=curr.next;
        }
        return head;
    }
}