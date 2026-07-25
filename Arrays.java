//Arrays
// Pattern: Two Pointers-Reverse array
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2={};
        int[] arr3={10};
        int start=0;
        int end=arr.length-1;


        // Reverse the array here
        while(start<end){
            
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;

            
        }
        start=0;
         end=arr2.length-1;
        while(start<end){
            int temp=arr2[start];
                arr2[start]=arr2[end];
                arr2[end]=temp;
                start++;
                end--;

            
        }
        start=0;
         end=arr3.length-1;
        while(start<end){
            
                int temp=arr3[start];
                arr3[start]=arr3[end];
                arr3[end]=temp;
                start++;
                end--;

            
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+"\t");
            
        }
        System.out.println();
        for (int idx = 0; idx < arr2.length; idx++) {
            System.out.println("\n"+arr2[idx]+"\t");
            
        }
        for (int idx = 0; idx < arr3.length; idx++) {
            System.out.println(arr3[idx]+"\n\t");
            
        }

    }
}
//Pattern Linear search -search for target
//Count how many times a number appears
//O(n)-Time complexity

public class m {
    public static void main(String[] args) {
        int[] arr1={5 ,10, 5, 20 ,5, 15};
        int target=5;
        int count=0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==target){
                System.out.println("Target found at index "+i);
                break;
            
            }
        }
             for (int i = 0; i < arr1.length; i++){
            if(arr1[i]==target){
                count++;
                
            }
        }
        System.out.println(target+" appears "+count+" times");
    }
    
}
//Write a Java program to print only the even numbers from the array
//print maximum element

public class code{
    public static void main(String[] args) {
        int[] arr={12, 15 ,18 ,21, 30 ,41};
        int[] arr2={7, 12, 4 ,25 ,18 ,9};

        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0) 
                System.out.print(arr[i]+"\t");
        }

        int max=arr2[0];
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>max)
                max=arr2[i];
        }
        System.out.println("\n"+max+" is the maximum element");
    }
}

/*
------------------------------------------
Problem: Second & Third Largest Element
Pattern: Traversal + Comparison
Time Complexity: O(n)
Space Complexity: O(1)

Concept:
Maintain the top 3 largest distinct elements
while traversing the array only once.

Interview Level: Easy
------------------------------------------
*/
import java.util.Scanner;
public class code{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        int largest=Integer.MIN_VALUE;
        
        int secondLargest=Integer.MIN_VALUE;
        int thirdlargest=Integer.MIN_VALUE;

        System.out.println("Enter elemnets of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        secondLargestfind(arr,largest,secondLargest,thirdlargest);     
    }
    static void secondLargestfind(int[]arr,int largest ,int secondLargest,int thirdlargest){
        for(int current=0;current<arr.length;current++){
            if(arr[current]>largest){
                thirdlargest=secondLargest;
                secondLargest=largest;
                largest=arr[current];
                
            }
        else if(arr[current]>secondLargest && largest!=arr[current])
        {
            thirdlargest=secondLargest;
            secondLargest=arr[current];
        }
        else if(arr[current]>thirdlargest&&secondLargest!=arr[current]&&largest!=arr[current]){
            thirdlargest=arr[current];
        }

        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No distinct second/third largest value");
        }else
        System.out.println("second largest is "+secondLargest);
        System.out.println("third largest is "+thirdlargest);
    }
}

