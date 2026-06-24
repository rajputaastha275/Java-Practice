public class OrderAgnosticBS 
{
    public static void main(String[] args)
    {
        int[] arr = {90, 78, 67, 56, 45, 34, 23, 12, 0};
        int target = 78;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if(arr[start] < arr[end])
        {
            while(start <= end)
            {
                mid = start + (end - start) / 2;
                if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else if(target > arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    return mid;
                }

            }
            return -1;
        
        }
         else
        {
            while(start <= end)
            {
                mid = start + (end - start) / 2;
                if(target < arr[mid])
                {
                    
                    start = mid + 1;
                }
                else if(target > arr[mid])
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
}
// 90, 78, 67, 56, 45, 34, 23, 12, 0
// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19