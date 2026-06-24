import java.util.Scanner;

public class calculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Addition /n 2 - Subtraction /n 3 - Multiplication /n 4 - Division /n 5 - Modulus");
        System.out.println("Enter your choice");
        int ch = input.nextInt();
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        int c = 0;
        if(ch==1)
        {
            c = a + b;
        }
        else if(ch == 2)
        {
            c = a - b;
        }
        else if(ch == 3)
        {
            c = a * b;
        }
        else if(ch == 4)
        {
            c = a / b;
        }
        else if(ch == 5)
        {
            c = a % b;
        }
        System.out.println(c);
        input.close();
    }
    
}
