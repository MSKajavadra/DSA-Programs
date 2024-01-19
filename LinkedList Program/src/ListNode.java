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
        System.out.print("null");
    }
    public static ListNode arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;

        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummyHead.next;
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
