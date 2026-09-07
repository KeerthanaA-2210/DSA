 //Array to Doubly Linked List
 //Delete head and return new head-DLL
import java.util.*;
class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
 }
public class linkedlist{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4};
        Node head=ArraytoDLL(arr);
        Node t=head;
        while(t!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
        if(t==null){
            System.out.print("null");
        }
       System.out.println();

        // new head
         head=Deletehead(head);
        System.out.println("the new head after deleting is "+head.data);

    }  
    
    static Node ArraytoDLL(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    static Node Deletehead(Node head){
        Node del=head;
        head=head.next;
        del.next=null;
        head.prev=null;
        return head;
    }
}

 //Reverse Doubly Linked List-DLL
import java.util.*;
class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
 }
public class linkedlist{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4};
        Node head=ArraytoDLL(arr);
        Node t=head;
        while(t!=null){
            System.out.print(t.data+"->");
            t=t.next;
        }
        if(t==null){
            System.out.print("null");
        }
       System.out.println();

        // new tail
         head=Deletetail(head);
        System.out.println("the deleted tail is "+head.data);

    }  
    
    static Node ArraytoDLL(int[] arr){
        Node head=new Node(arr[0]);
        Node current=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            current.next=temp;
            temp.prev=current;
            current=temp;
        }
        return head;
    }

    /* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        
        Node current=head;
        Node prevNode=null;
        
        while(current!=null){
            prevNode=current.prev;
            current.prev=current.next;
            current.next=prevNode;
            
            current=current.prev;
        }
        head=prevNode.prev;
        return head;
    }
}
}




