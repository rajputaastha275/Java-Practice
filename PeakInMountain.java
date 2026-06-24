public class PeakInMountain
{
    public static void main(String[] args) 
    {
        int[] arr = {0, 1, 0};
        int ans = peak(arr);
        System.out.println(ans);
    }

    static int peak(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if((arr[mid] < arr[mid + 1])&&(arr[mid] > arr[mid - 1]))
            {
                return mid;
            }
            else if(arr[mid] > arr[mid + 1])
            {
                return mid;
            }
        }
        return -1;
    }
}