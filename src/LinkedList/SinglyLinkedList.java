package LinkedList;

public class SinglyLinkedList {

    static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor
    public SinglyLinkedList(){
        this.head= null;
        this.tail = null;
        this.size = 0;
    }


    //.................INSERTION.........

    //INSERT AT HEAD
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        //if linked list is empty
        if (head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        //increase the size by one
        size++;
    }


    //INSERT AT TAIL
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        //if LL is empty
        if (head == null && tail == null){
            head = newNode;
            tail = newNode;

        }
        else{
             tail.next = newNode;
             tail = newNode;
        }
        size++;
    }

    //INSERT AT POSITION
    public void  insertAtPosition(int position,int data){
        if (position <1 || position > size+1){
         //not possible
            System.out.println("Insertion is not possiblle at this position");
            return;
        }
        if (position == 1){
            insertAtHead(data);
            return;
        }
        if (position == size+1){
            insertAtTail(data);
            return;
        }
//        middle m kahin pr place krna ho to
        Node prevNode = head;
        //move prevNode by (position-2( steps tp reach the destined node
        for (int i =1; i <= position-2; i++){
            prevNode = prevNode.next;
        }

        Node newNode = new Node(data);

        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }


    //.........TRAVERSAL..........

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println();
    }


    //.........Utility functions..........

    public  int getSize(){
        return  size;
    }

    public boolean isEmpty(){
        return head== null;
    }

    public int getHead(){
        if (head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }

    public int getTail(){
        if (tail == null){
            return -1;
        }
        else{
            return tail.data;
        }
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }



    //.........SEARCHING.........
//    public int findPosition(int target){
//
//    }




    static void main() {
SinglyLinkedList  mylist = new SinglyLinkedList();
if (mylist.isEmpty()){
    System.out.println("List is empty");
}

        System.out.println("Size of list : " + mylist.getSize());
   mylist.insertAtHead(10);
   mylist.printList();

        mylist.insertAtHead(20);
        mylist.printList();

        mylist.insertAtHead(30);
        mylist.printList();

        mylist.insertAtTail(100);
        mylist.printList();

        mylist.insertAtTail(110);
        mylist.printList();

        mylist.insertAtTail(120);
        mylist.printList();


        mylist.insertAtPosition(1,22);
        mylist.printList();

        mylist.insertAtPosition(5,220);
        mylist.printList();

        System.out.println(mylist.getHead());
        System.out.println(mylist.getTail());
        System.out.println(mylist.getSize());
    }
}
