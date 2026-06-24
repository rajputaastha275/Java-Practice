public class SearchInRange 
{
    public static void main(String[] args) 
    {
       int[] arr = {1, 4, 56, 78, 2, 27};
       int target = 2;
       int start = 2;
       int end = 4; 
        System.out.println(SInRange(arr, target, start, end));
    }

    static int SInRange(int[] arr, int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for(int i = start; i <= end; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
