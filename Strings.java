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
//Count frequency of characters
import java.util.*;
public class Main{
     public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String inpuString=sc.next();
        StringBuilder s=new StringBuilder(inpuString);
        
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.print(map);
}
}

//Remove spaces hi world -> hiworld
import java.util.*;
public class Main{
     public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String inpuString=sc.nextLine();
        StringBuilder s=new StringBuilder(inpuString);

         StringBuilder h=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                h.append(s.charAt(i));
            }
            
        }
        for(int i=0;i<h.length();i++)
        System.out.print(h.charAt(i));
}
}
//Toggle Case 
//Input - HeLLo  O/p= hEllO
import java.util.*;
public class Main{
     public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String inpuString=sc.nextLine();
        StringBuilder s=new StringBuilder(inpuString);

         StringBuilder h=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char chh=s.charAt(i);
            if(Character.isUpperCase(chh)){
                h.append(Character.toLowerCase(chh));
            }
            else{
                h.append(Character.toUpperCase(chh));
            }
            
        }
        
        System.out.print(h);
}
}
//Count words 
import java.util.*;
public class Main{
     public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String inpuString=sc.nextLine();
       
        StringBuilder s=new StringBuilder(inpuString);

        int count=0;
        if(s.length()==0){ 
            System.out.println(0);
            return;
        }
        else{
        
        for(int i=0;i<s.length();i++){
            char chh=s.charAt(i);
            if(chh!=' '&&(i==0||s.charAt(i-1)==' ')){
               count++;
            }       
        }
    }
        System.out.print(count);
}
}
import java.util.*;
//Reverse Each Word  Hi all --> iH lla
public class Main{
     public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String words[]=s.split(" ");
        
        for(int i=0;i<words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--)
            System.out.print(words[i].charAt(j));
        System.out.print(" ");
        }
}
}
import java.util.*;
//count letters aabb--> a2b2
//String Compression
public class Main{
     public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int count=1;

        for(int i=0;i<s.length();i++){
            if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                System.out.print(s.charAt(i)+""+count+" ");
                count=1;    
            }
            else{
                count++;
            }
        }
     }
}
