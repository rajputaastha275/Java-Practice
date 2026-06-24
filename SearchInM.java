import java.util.Arrays;
public class SearchInM
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {23, 45, 67},
            {1, 18, 12, 34},
            {36, 54, 89, 99},
            {27, 2}
        };
        int target = 2;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target)
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}