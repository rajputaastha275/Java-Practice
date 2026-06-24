public class CeilingNumber 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 4, 6, 8, 12, 14, 23, 35, 46, 90};
        int target = 99;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
    }
    static int ceilingNumber(int[] arr, int target)
    {
        if(target > arr[arr.length])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                    return arr[mid];
            }

        }
        return arr[start];
    }
}