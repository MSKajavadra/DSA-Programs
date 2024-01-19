public class CircularLoops {
    public static void main(String[] args) {
        Node head=new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(15);
        head.next.next.next=new Node(20);
        head.next.next.next.next=head.next;
        System.out.println(isCircular(head));  //Detect loop in linked list
        System.out.println(lengthOfLoop(head));
    }

    private static int lengthOfLoop(Node head) {
        Node slow=head,fast=head;
        while (fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                slow=slow.next;
                int count=1;
                while (slow != fast){
                    slow=slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    private static boolean isCircular(Node head) {
        Node slow=head,fast=head;
        while (fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
