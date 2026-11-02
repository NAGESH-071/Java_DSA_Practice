package LinearSearch;

public class SearchingElement {
    public static void main(String args[])
    {
        int nums[] = {11,13,17,19,21};
        int target= 19;

        int result =  linearSearch(nums,target);

        if(result != -1)
        System.out.println("Elment found at index :"+ result);
        else
            System.out.println("Element not found");
        

    }
     public static int linearSearch(int nums[],int target)
    {
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == target)
            return i;
        }
        return -1;
        
    }
   
    
}
