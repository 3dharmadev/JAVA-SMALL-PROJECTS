package DSA301;

public class Implementation_Of_LinkedList {

    public static void main(String[] args) {
//        Node node=new Node(5);
        // node.printNode();
        LinkedList linkedList= new LinkedList();
        System.out.println(linkedList.isEmpty());
        for (int i=1;i<=5;i++){
            linkedList.insertAtTail(i);
            System.out.println("head ->"+linkedList.getHead()+" tail-> "+linkedList.getTail());
        }
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.getSize());
        linkedList.insertAtHead(6);
        System.out.println(linkedList.getSize());
        System.out.println("head ->"+linkedList.getHead()+" tail-> "+linkedList.getTail());
        linkedList.deleteNode(3);
        System.out.println(linkedList.getSize());
        linkedList.printLinkedList();
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public void printNode(){
        System.out.println(this.data+"->"+this.next);
    }
}

class LinkedList{
    Node head;
    Node tail;
    int size;


    public LinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public int getHead(){
        return  head.data;
    }

    public int getTail(){
        return tail.data;
    }

    public int getSize(){
        return  size;
    }

    public boolean isEmpty(){
        return size==0 ? true : false;

    }
    public void insertAtHead(int data){
        if(head==null){
            head=new Node(data);
            size++;
            return;
        }
        Node new_head =  new Node(data);
        new_head.next=head;
        head = new_head;
        size++;
        return;
    }
    public void insertAtTail(int data){
        if(head==null){
            head = new Node(data);
            tail=head;
            size++;
            return;
        }

        tail.next=new Node(data);
        size++;
        tail=tail.next;
       return;
    }

    public void  deleteNode(int data){
        Node current=head;
        while (current.next.data != data){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
        return;

    }
    public  void printLinkedList(){
        if(head==null) return;
        Node current=head;
        while (current!= null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        return;
    }
}