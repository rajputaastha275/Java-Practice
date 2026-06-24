import java.util.Scanner;

public class AreaRect 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length");
        int l = input.nextInt();
        System.out.println("Enter breath");
        int b = input.nextInt();
        float area = l * b;
        System.out.println("Area of Rectangle = " + area);
        input.close();
    }
}
