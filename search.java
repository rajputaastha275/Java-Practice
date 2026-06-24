public class search 
{
    public static void main(String[] args) 
    {
        int[] arr = {23, 45, 67, 78, 12, 90, 27, 2, 4, 5};
        int target = 2;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    // Search in the array
    static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }
        return -1;
    }
}
