public class Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode head1=new ListNode(9);
        head1.next=new ListNode(9);
        head1.next.next=new ListNode(9);
        head1.next.next.next=new ListNode(9);
        head1.next.next.next.next=new ListNode(9);
        head1.next.next.next.next.next=new ListNode(9);
        head1.next.next.next.next.next.next=new ListNode(9);

        ListNode head2=new ListNode(9);
        head2.next=new ListNode(9);
        head2.next.next=new ListNode(9);
        head2.next.next.next=new ListNode(9);

        ListNode head=addTwoNumbers(head1,head2);
        print(head);
    }
    public static void print(ListNode head) {
        ListNode current=head;
        System.out.println();
        while (current != null){
            System.out.print(current.val + " ");
            current=current.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null,tail=null;
        ListNode curr1=l1,curr2=l2;
        int carry=0;
        while (curr1 != null && curr2 != null){
            int total= curr1.val+ curr2.val+carry;
            carry=0;
            if (head==null){
                head=tail=new ListNode(total%10);
            }else{
                tail.next=new ListNode(total%10);
                tail=tail.next;
            }
            total/=10;
            if(total!=0){
                carry=total;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        while (curr1 != null){
            int total= curr1.val+carry;
            carry=0;
            if (head==null){
                head=tail=new ListNode(total%10);
            }else{
                tail.next=new ListNode(total%10);
                tail=tail.next;
            }
            total/=10;
            if(total!=0){
                carry=total;
            }
            curr1=curr1.next;
        }
        while (curr2 != null){
            int total= curr2.val+carry;
            carry=0;
            if (head==null){
                head=tail=new ListNode(total%10);
            }else{
                tail.next=new ListNode(total%10);
                tail=tail.next;
            }
            total/=10;
            if(total!=0){
                carry=total;
            }
            curr2=curr2.next;
        }
        if (carry != 0){
            if (head==null){
                head=tail=new ListNode(carry);
            }else{
                tail.next=new ListNode(carry);
                tail=tail.next;
            }
        }
        return head;
    }
}
