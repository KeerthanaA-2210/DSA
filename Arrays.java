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

// Pattern: Traversal + Insert Index (In-place Modification) remove duplicates
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int insertindex=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                insertindex++;
                arr[insertindex]=arr[i];
                
            }
        }
        for (int i=0; i < insertindex+1; i++) {
            System.out.println(arr[i]);
        }
    }
}

// Pattern: Traversal + Insert Index (In-place Modification) move zeroes to end
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 3, 4, 4};
        int insertindex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertindex]=arr[i];
                insertindex++;
            }
        }
        for (int i=insertindex; i < arr.length; i++) {
            arr[i]=0;
        }
         for(int i=0;i<arr.length;i++)
             System.out.println(arr[i]);
        
    }
}
//rotate array-Pattern:Reversal Pattern
//T(n)=O(n)

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int start=0;
        int end=arr.length-1;
        int k=2;k=k%arr.length;
        reverse(arr, start, end);
        reverse(arr, 0, k-1);
        reverse(arr, k,arr.length-1);
        for (int i = 0; i < arr.length;i++)     
        System.out.println(arr[i]);
      
    }
    static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
// Pattern: Mathematical Sum Pattern-find missing number in array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Main {
    public static void main(String[] args) {
        int arr[]={0,1,3};
        int num=0;
        int n=arr.length;
        int sum=0;
        int actualsum=n*(n+1)/2;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum==actualsum){
            System.out.println("No missing number");
        }
        else{
            num=actualsum-sum;
        }
        System.out.println("The missing number is "+num);
    }
}

// Pattern: traversal+count-Bruteforce
//Find the majority element (appears more than n/2 times)
// Time Complexity: O(n2)
// Space Complexity: O(1)

public class Main {
    public static void main(String[] args) {
        int arr[]={2,5,5,5,2,5};
        int n=arr.length/2;
        

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;          
            }
            if(count>n) {  
            System.out.println(arr[i]+" is the major number");
        break;
    }
        }
        
    }
}
// Pattern: Running Minimum
// Best Time to Buy and Sell Stock
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Main {
    public static void main(String[] args) {
    int[] arr={7, 1, 5 ,3 ,6, 4};
    int minimumprice=arr[0];
    int maxprofit=0;
    int profit=0;
    for(int i=1;i<arr.length;i++){
        if(arr[i]<minimumprice){
            minimumprice=arr[i];
        }
            profit=arr[i]-minimumprice;
        
        if(profit>maxprofit){
            maxprofit=profit;
        }
    }
    System.out.println(maxprofit);
    }
}
// Pattern: Two Pointers
// Merge Two Sorted Arrays
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
public class Main {
    public static void main(String[] args) {
    int[] arr1={0, 1, 5 ,6};
    int[] arr2={2,4,8};
    int[] merged=new int[arr1.length+arr2.length];
    int i=0,j=0,k=0;

    while(i<arr1.length&&j<arr2.length){
        if(arr1[i]<arr2[j]){
            merged[k]=arr1[i];
            k++;
            i++;
        }
        else   {
            merged[k]=arr2[j];
            k++;
            j++;
        }
    }
    while(i<arr1.length){
        merged[k]=arr1[i];
        i++;k++;
    }
     while(j<arr2.length){
        merged[k]=arr2[j];
        j++;k++;
    }
    for (int x=0;x<merged.length;x++){
        System.out.print(merged[x]+" ");
    }

    }
}
// Pattern: Two Pointers
// Intersection of Two Sorted Arrays
// Time Complexity: O(n + m)
// Space Complexity: O(1)
public class Main {
    public static void main(String[] args) {
    int[] arr1={0, 1, 5 ,6};
    int[] arr2={2,5,8};
    
    int i=0,j=0;

    while(i<arr1.length&&j<arr2.length){
        if(arr1[i]<arr2[j]){
           i++;
        }
        else if(arr1[i]>arr2[j]) {
            j++;
        }
        else{
            System.out.println(arr1[i]);
            i++;j++;
        }
    }


    }
}
// Pattern: Two Pointers
// Union of Two Sorted Arrays
// Time Complexity: O(n + m)
// Space Complexity: O(1)
public class Main {
    public static void main(String[] args) {
    int[] arr1={0, 1, 5 ,6};
    int[] arr2={2,5,8};
    int[] union=new int[arr1.length+arr2.length];
    
    int i=0,j=0,k=0;

    while(i<arr1.length&&j<arr2.length){
        if(arr1[i]<arr2[j]){
            union[k]=arr1[i];
            k++;
            i++;
        }
        else if(arr1[i]>arr2[j]){
            union[k]=arr2[j];
            k++;
            j++;
        }
        else{
            union[k]=arr1[i];
            i++;j++;k++;
        }
    }
    while(i<arr1.length){
        union[k]=arr1[i];
        k++;i++;
    }
    while(j<arr2.length){
        union[k]=arr2[j];
        k++;j++;
    }
    for (int x = 0; x < k; x++) {
        System.out.print(union[x]+" ");
    }

    }
}

// Pattern:Traversal+counting
// Find the cout of maximum consecutive one(1's)
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Main {
    public static void main(String[] args) {
    int[] arr={0, 1, 1,1,1 ,1,0,1,1,1,1};
    int count = 0;
    int maxCount = 0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            count++;
        }
        else{
            count=0;
        }
        if(count>maxCount){
        maxCount=count;
    }
    }
    
    System.out.println(maxCount);

    }
}
// Pattern:Sliding window
// Find the length of longest subarray of sum k
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Main {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
    int right=0,left=0,k=6;
    int maxlength=0,sum=0;

    for(right=0;right<arr.length;right++){
        sum+=arr[right];
        while(sum>k){
            sum-=arr[left];
            left++;
        }
        if(sum==k){
            int curr=right-left+1;
            if(curr>maxlength){
                maxlength=curr;
            }
        }
    }
    System.out.println(maxlength);

}
}
