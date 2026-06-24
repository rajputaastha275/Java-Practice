public class MaxIn2D 
{
    public static void main(String[] args)
    {
       int[][] arr = {
        {1, 45, 78},
        {90, 56, 34, 23},
        {2, 4, 7, 27},
        {113, 6, 30, 21}
       };
       int ans = maximum(arr);
       System.out.println(ans);
       
    }
    static int maximum(int arr[][])
    {
        int max = arr[0][0];
        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                if (arr1[col] > max) {
                    max = arr1[col];
                } 
            }
        }
        return max;
    }
}
