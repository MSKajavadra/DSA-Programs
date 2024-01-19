public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public static void print(ListNode head) {
        ListNode current=head;
        System.out.println();
        while (current != null){
            System.out.print(current.val + "=>");
            current=current.next;
        }
        System.out.println("null");
    }
    public static int length(ListNode head){
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        return length;
    }
}
