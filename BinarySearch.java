public class BinarySearch 
{
    public static int  main(String[] args) 
    {
        int[] arr = {1,3,4,6,9,13,15};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > target)
            {
                start = mid + 1;
            }
            else if(arr[mid] < target)
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }  
}