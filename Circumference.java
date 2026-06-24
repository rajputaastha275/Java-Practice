import java.util.Scanner;

public class Circumference 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = input.nextInt();
        double c = 2 * 3.14 * r;
        System.out.println("Circumference = " + c);
        input.close();
    }
}
