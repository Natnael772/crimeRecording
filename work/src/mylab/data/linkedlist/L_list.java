package mylab.data.linkedlist;

class Node{
    int data;
    Node next;
    Node(int  data){
        this.data=data;
     //   next=null; // this is unneccessary because ny dafualt it will point to null
    }
}
class DoubleNode{
    int data;
    DoubleNode next;
    DoubleNode prev;
    DoubleNode(int data){
        this.data=data;
    }
}
class LinkedList {
    public  Node head;
    public void add(int value){
        Node temp=new Node(value);
        if(head==null) {
            head = temp;
            // temp.next = null;
        }
        else{
            Node temp2=head;
            while(temp2.next!=null)
                temp2=temp2.next;
            temp2.next=temp;
            temp.next=null;// not mandatory in java

        }
    }
    void addAtOne(int value){
        Node temp=new Node(value);
        if(head==null)
            head=temp;
        else{
        temp.next=head;
        head=temp;
        }
    }
    public void displaylist(){
        if(head==null)
            System.out.println("empty list");
        else{
            Node temp=head;

            do{
                System.out.println(temp.data);
                temp=temp.next;
            }
            while(temp!=null);
        }
    }
    void addAtN(int pos,int data){
        Node temp=new Node(data);
       //System.out.println(head.data);
       if(head!=null){
       //    System.out.println(head.data);
           Node current=head, prev=null;
           int i=1;
//           while(i<pos){
//
//               i++;
//           }
//           prev.next=temp;
//           temp.next=current;
       // or
           current=head;
       i=1;
           while(i<pos-1){
               current=current.next;
               i++;
           }
           temp.next=current.next;
           current.next=temp;

       }
       }
       void deleteFirst(){
        if(head==null)
            System.out.println("list is empty");
        else{
            Node temp=head;
            head=head.next;
            temp=null;
        }
       }

}
class DoubleList {
    public Double current;

    void addNode(int value) {
        DoubleNode temp = new DoubleNode(value);
//        if(current==null)

    }
}

    public class L_list {
        public static void main(String[] args) {
            LinkedList l = new LinkedList();
            l.add(1);
            l.add(2);
            l.add(3);
            l.add(4);
            l.addAtOne(5);
            l.addAtN(3, 10);
            l.deleteFirst();
            l.displaylist();
        }

    }

