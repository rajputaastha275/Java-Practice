import java.util.Scanner;

public class occurance 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number");
        int n = input.nextInt();
        System.out.println("Enter number to find");
        int f = input.nextInt();
        while(n > 0)
        {
            int d = n % 10;
            n = n / 10;

            if(d == f)
            {
                count++;
            }
        }
        System.out.println("Occurence = " + count);
        input.close();
    }
}
