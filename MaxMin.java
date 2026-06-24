import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Select one option");
        System.out.println("1 - Maximum");
        System.out.println("2 - Minimum");

        int n = input.nextInt();

        if ((n != 1) && (n != 2))
        {
            System.out.println("Invalid option");
        }
        else
        {
            System.out.println("Enter 2 numbers");

            int a = input.nextInt();
            int b = input.nextInt();

            if (n == 1)
            {
                max(a, b);
            }
            else if (n == 2)
            {
                min(a, b);
            }
        }

        input.close();
    }

    static void max(int a, int b)
    {
        if (a > b)
        {
            System.out.println(a + " is maximum");
        }
        else
        {
            System.out.println(b + " is maximum");
        }
    }

    static void min(int a, int b)
    {
        if (a < b)
        {
            System.out.println(a + " is minimum");
        }
        else
        {
            System.out.println(b + " is minimum");
        }
    }
}