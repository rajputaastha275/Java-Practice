public class FloorNumber 
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 3, 5, 7, 9, 13, 15, 16, 18, 21, 27, 30, 86};
        int target = 1;
        int ans = floorNumber(arr, target);
        System.out.println(ans);
    }
    static int floorNumber(int[] arr, int target)
    {
        if(target < arr[0])
        {
            return -1;
        }
        int start = 0; 
        int end = arr.length - 1;
        int mid;
        while(start <= end)
        {
            mid = start + (end - start) / 2;
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
        return arr[end];
    }
    
}
