import java.util.Scanner;

public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int rev = 0;
        while(n > 0)
        {
           int d = n % 10;
           n = n / 10;
           rev = rev * 10 + d;
        }
        System.out.println("Reverse number = " + rev);
        input.close();
    }
}
