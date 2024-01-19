public class Bubble_Sort {
    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(3);

        ListNode ans=sortList(head);
        print(ans);
    }
    public static void print(ListNode head) {
        ListNode current=head;
        System.out.println();
        while (current != null){
            System.out.print(current.val + " ");
            current=current.next;
        }
    }
    public static ListNode sortList(ListNode head) {
        ListNode curr=head;
        while(curr != null){
            ListNode temp=curr.next;
            while(temp != null){
                if(curr.val > temp.val){
                    int t=curr.val;
                    curr.val=temp.val;
                    temp.val=t;
                }
                temp=temp.next;
            }
            curr=curr.next;
        }
        return head;
    }
}
