class Main1{
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList=new CircularLinkedList();

        circularLinkedList.insert(10);
        circularLinkedList.insert(20);
        circularLinkedList.insert(30);
        circularLinkedList.insert(40);
        circularLinkedList.insert(50);
        circularLinkedList.print();

        circularLinkedList.exchangeFirstLastNode();
        circularLinkedList.print();
    }
}
public class CircularLinkedList {
    Node head=null;

    public void insert(int data) {
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            head.next=newNode;

        }else {
            Node curr=head;
            do {
                curr=curr.next;
            }while (curr.next != head);
            newNode.next=head;
            curr.next=newNode;
        }
    }

    public void print() {
        System.out.println();
        Node curr=head;
        do {
            System.out.print(curr.data + " ");
            curr=curr.next;
        }while (curr != head);
    }

    public void exchangeFirstLastNode() {
        if(head.next==head){
            return;
        }
        if(head.next.next==head){
            head=head.next;
            return;
        }
        Node curr=head;
        while (curr.next.next != head){
            curr=curr.next;
        }
        Node first=head;
        head=head.next;
        first.next=curr.next;
        curr.next=first;
        curr.next.next.next=head;
        head=curr.next.next;
    }
}