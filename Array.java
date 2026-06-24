import java.util.Scanner;

public class Array 
{
    public static void main(String[] args) 
    {
        // int[] rnos = new int[5];
        // int[] rno2 = {23, 12, 45, 32, 15};
        // System.out.println(rnos[1]);
        // System.out.println(rno2[2]);
        // String[] arr = new String[4];
        // System.out.println(arr[0]);
        // int[] arr = new int[5];
        // arr[0] = 4;
        // arr[1] = 34;
        // arr[2] = 45;
        // arr[3] = 27;
        // arr[4] = 2;
        // System.out.println(arr[3]);
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements of array");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Elements of Array");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
