import java.util.Scanner;

public class largest 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        if(a > b)
        {
            System.out.println("A is largest");
        }
        else
        {
            System.out.println("B is largest");
        }
        input.close();
    }
    
}
