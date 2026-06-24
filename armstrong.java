import java.util.Scanner;

public class armstrong 
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = input.nextInt();
        int d = 0;
        int sum = 0;
        int m = n;
        while(n > 0)
        {
            d = n % 10;
            n = n / 10;
            sum = sum + (d * d * d);

        }
        if(sum == m)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
        input.close();
   } 
}
