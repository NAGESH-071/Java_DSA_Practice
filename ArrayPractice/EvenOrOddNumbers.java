package ArrayPractice;

// Count even and odd numbers
// Given int[] arr = {12, 7, 8, 15, 20, 33, 42};,
//  count how many elements are even and how many are odd.

public class EvenOrOddNumbers {
public static void main (String args[])
{
    int arr[] = {12,7,8,15,20,33,42};
    int EvenCount = 0;
    int OddCount = 0;

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]%2 == 0)
        {
            EvenCount++;
           
        }
        else{
            OddCount++;
            
        }
    }
     System.out.println("Even Count From Array:" + EvenCount);
     System.out.println("Odd count from Array: "+ OddCount);
    
}


}
    