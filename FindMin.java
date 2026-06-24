public class FindMin 
{
    public static void main(String[] args) 
    {
        int[] arr = {78, 45, 89, 27, 2, 81, 30, 21};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr)
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;

    }
}
