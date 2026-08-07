//Linked List Traversal + Length of LL + Print LL + Searching
import java.util.*;
 class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
 }
public class linkedlist{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter target ");
        int target=sc.nextInt();
        Node head=null;
        Node tail=null;
        boolean found=false;

        System.out.println("Enter values : ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            Node newnode =new Node(value);

            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        Node temp=head;int count=0;
        while(temp!=null){
            count++;
            System.out.println(temp.data+" " );
            if(temp.data==target){
                found=true;
            }   
            temp=temp.next;
            
        }
        System.out.println("Length of LL "+count);
        if(found==true){
            System.out.println("target found");
        }
        else{
            System.out.println("not found");
        }
       
    }
    }

//Linked List - Reverse LL
import java.util.*;
 class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
 }
public class linkedlist{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n=sc.nextInt();
       
        Node head=null;
        Node tail=null;
        System.out.println("Enter values : ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            Node newnode =new Node(value);

            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }

        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println("");
        //Reverse the LL
    Node prev = null;
    Node curr = head;
    Node next = null;

    while (curr != null) {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}

head = prev;
temp=head;
while (temp!=null) {
            System.out.print(" "+temp.data+" ");
            temp=temp.next;
        }
    }
    
}

