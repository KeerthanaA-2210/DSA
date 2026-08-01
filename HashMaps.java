//Pattern=Hashmap-contains duplicate : return true if duplicate found
//Time Complexity=O(n)

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,4,1,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean status=false;

        for(int num:nums){
            if(map.containsKey(num)){
                status= true;
                break;
            }
            else{
                map.put(num, 1);
            }
}
System.out.println(status);
        }
        

}
//Pattern- Hashmap
//frequency of numbers
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,2,4,1,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
    }
}
//Anagram Checking
//O(n)-T(n)
import java.util.*;
public class Main{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
boolean ana=anagram(str1, str2);

if(ana==true){
    System.out.println("It is anagram");
}
else
    System.out.println("Not anagram");
        
    }
    static boolean anagram(String str1,String str2) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }else
            map.put(str1.charAt(i),1);
        }
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
            }
            else
           return false;
        }
        for(int i=0;i<str1.length();i++){
        if(map.get(str1.charAt(i))!=0){
        return false;
        }
          
    }
      return true;
    }
}
//First Unique character in string
import java.util.HashMap;
public class m {
    public static void main(String[] args) {
        String s = "leetcode";
        char single='0';
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }

        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                single=s.charAt(i);
                break;
            }
        }
       
        if(single=='0'){
            System.out.println("No single letter/character");
        }
        else  System.out.println(single);
    }
    
}
//Major element 
//O(n)-T(n)
import java.util.*;
public class Main{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elemnets");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int major=majorElement(arr, n);
        if(major==-1){
            System.out.println("no distinct major element");
        }
        else{
            System.out.println(major+" is the major element");
        }
        
    }
    static int majorElement(int arr[],int n) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
            if(map.get(arr[i])>n/2){
                return arr[i];
            }
        }
        return -1;
    }
    
}
