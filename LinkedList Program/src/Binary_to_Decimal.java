public class Binary_to_Decimal {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(0,new ListNode(1)));
        System.out.println(getDecimalValue(head));
        
        head=new ListNode(1,new ListNode(0,new ListNode(1,new ListNode(0))));
        System.out.println(getDecimalValue2(head));
    }
    public static int getDecimalValue(ListNode head) {
        int decimal=0;
        int positionValue=1;
        int length=ListNode.length(head);

        for(int i=0;i<length;i++) {
            ListNode last = head, prev = head;
            while (last != null && last.next != null) {
                prev = last;
                last = last.next;
            }
            prev.next = null;
            if (last.val == 1) {
                decimal += positionValue;
            }
            positionValue = positionValue * 2;
        }
        return decimal;
    }
    public static int getDecimalValue2(ListNode head){
        int decimal=0;
        int length=ListNode.length(head);

        ListNode curr=head;
        while (curr!=null){
            decimal+=curr.val*Math.pow(2,length-1);
            curr=curr.next;
            length--;
        }
        return decimal;
    }
}
