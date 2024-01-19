public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(20);

        linkedList.middleNode();


        linkedList.update(10,50);
        System.out.print("\nAfter Update: ");
        linkedList.print();

        linkedList.delete(40);
        linkedList.print();

        linkedList.search(20);

        linkedList.length();

        linkedList.printReverse();

        linkedList.getNode(2);
        linkedList.getNodeFromEnd(1);

        linkedList.print();
        deleteSpecificNode(linkedList.head.next.next);

        linkedList.print();
        linkedList.deleteDuplicates();
        linkedList.print();
    }

    private static void deleteSpecificNode(Node pointer) {
        if(pointer.next == null){
            System.out.println("\nIt is a Last Node of LinkedList, It can not be deleted without head..!!");
            return;
        }
//        while (pointer.next != null){
//            pointer.data=pointer.next.data;
//            if (pointer.next.next == null){
//                pointer.next=null;
//                return;
//            }
//            pointer=pointer.next;
//        }
        pointer.data=pointer.next.data;
        pointer.next=pointer.next.next;
    }
}
class LinkedList {
    int totalNode=0;
    Node head,tail;
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head == null){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
        totalNode++;
    }

    public void print() {
        Node current=head;
        System.out.println();
        while (current != null){
            System.out.print(current.data + " ");
            current=current.next;
        }
    }

    public void update(int old, int newVal) {
        Node current=head;
        while (current != null){
            if(current.data==old){
                current.data=newVal;
            }
            current=current.next;
        }
    }

    public void delete(int data) {
        if (head.data == data) {
            head = head.next;
            totalNode--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                if (current.next == tail) {
                    current.next = null;
                    tail = current;
                    totalNode--;
                    return;
                } else {
                    current.next = current.next.next;
                    totalNode--;
                    return;
                }
            }
            current = current.next;
        }
        System.out.println("\n" + data + " Not Found In LinkedList..!!");
    }

    public void search(int data) {
        int count=1;
        Node current=head;
        while (current != null){
            if(current.data == data){
                System.out.println("\n"+data + " Found at Position:" + count);
                return;
            }
            count++;
            current=current.next;
        }
        System.out.println("\n" + data + " Not Found In LinkedList");
    }

    public void length() {
        System.out.println("\nTotal Nodes In LinkedList is: " + totalNode);
    }

    public void printReverse() {
        System.out.println();
        Node current=tail;
        do {
            System.out.print(current.data + " ");
            Node temp=head;
            while (temp.next != current){
                temp=temp.next;
            }
            current=temp;
        }while (current != head);
        System.out.print(head.data);
    }

    public void getNode(int position) {
        int count=1;
        Node curr=head;
        while (curr != null){
            if(position == count){
                System.out.println("\nNo-" + position + " node in LinkedList is: " + curr.data);
                return;
            }
            count++;
            curr=curr.next;
        }
        System.out.println("Enter Correct Position..!!");
    }

    public void getNodeFromEnd(int posFromEnd) {
        if(posFromEnd > totalNode){
            System.out.println("Enter Correct Position..!!");
            return;
        }
        Node curr=head;
        for (int i=0;i<totalNode-posFromEnd;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    public void deleteDuplicates() {
        Node curr=head;
        while(curr != null){
            Node temp=curr.next;
            while(temp != null && curr.data == temp.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
    }
    public void middleNode(){
        Node slow=head,fast=head;
        while (fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("\nMiddle Node: " +slow.data);
    }
}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next=null;
    }
}