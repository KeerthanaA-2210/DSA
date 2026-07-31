//Reverse String
public class small {
    public static void main(String[] args) {
        String s="Hello";
       
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }     
    }  
}
//Check if String is palindrome
import java.util.*;
public class small {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.next();
       int i=0,j=s.length()-1;
         while(i<j)  {
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else{
                System.out.println("Not palindrome");
                break;
            }
         }
         if(i>j){
            System.out.println("Palindrome");
         }
    }  
}
