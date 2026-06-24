import java.util.Scanner;

public class MetOdd 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        odd(n);
        input.close();
    }
    static void odd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
