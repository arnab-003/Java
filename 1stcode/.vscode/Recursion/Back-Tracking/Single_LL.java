import java.util.*;
public class Single_LL {
    Node head;
    private int size;

    Single_LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add-first

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next =  head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next != null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    //print-list

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode= head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }

        System.out.println("NULL");
    }

    //delete-First
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
    }
   //delete-last
   public void deleteLast(){
    size--;
    if(head==null){
        System.out.println("The list is empty");
        return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }

    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next !=null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }
    secondLast.next=null;
   }
   public int getSize(){
    return size;
   }

   public void reverseIterate(){

    if(head==null || head.next==null){
        return;
    }

    Node prevNode = head;
    Node currNode= head.next;
    while(currNode !=null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        //update
        prevNode= currNode;
        currNode= nextNode;

    }
    head.next=null;
    head=prevNode;
   }
   public Node reverseRecursive(Node head){

    if(head==null || head.next==null){
        return head;

    }
    Node newHead= reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;

    return newHead;

   }

    public static void main(String[] args) {
        Single_LL list = new Single_LL();
        
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.printList();

       list.head= list.reverseRecursive(list.head);
        list.printList();



        // System.out.println(list.getSize());
        // list.addFirst("This");
        // System.out.println(list.getSize());
    }
}
//     public static void main(String[] args) {
// // using java Class Frames
//         LinkedList<String> list = new LinkedList<String>();

//         list.addFirst("a");
//         list.addFirst("is");
//         System.out.println(list);

//         list.addLast("list");
//         list.addFirst("This");
//         System.out.println(list);

//         System.out.println(list.size());

//         list.removeFirst();
//         System.out.println(list);
//         list.removeLast();
//         System.out.println(list);

//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+"->");
//         }
//         System.out.println("NULL");
//     }
// }
