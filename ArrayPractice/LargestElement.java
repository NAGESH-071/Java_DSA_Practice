package ArrayPractice;
// Given int[] arr = {12, 45, 8, 67, 23};, 
// find and print the largest element without using sorting methods.

public class LargestElement {
    public static void main(String args[])
    {
         int arr[] = {12,45,8,67,23};
         int largest = arr[0]; 
     for(int i=1;i<arr.length;i++)
     {
        if(arr[i] > largest)
        {
            largest = arr[i];
        }
     }
       System.out.println("Largest Element : "+largest);
    }
   
}
//we are intilizing the arr[0] to largest becuse  to check form the first element
//starting the loop from the index 1 value becuse to check the with second element and first element
//
