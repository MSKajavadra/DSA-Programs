public class LinkedList_is_Palindrome {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));
        System.out.println(isPalindrome(head));
    }
    static ListNode left;
    public static boolean isPalindrome(ListNode head) {
        left=head;
        return isPal(head);
    }
    public static boolean isPal(ListNode right){
        if(right==null){
            return true;
        }

        if(isPal(right.next) && left.val==right.val){
            left=left.next;
            return true;
        }
        return false;
    }
}
