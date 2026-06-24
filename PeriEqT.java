import java.util.Scanner;

public class PeriEqT 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side");
        int a = input.nextInt();
        int p = 3 * a;
        System.out.println("Perimeter of Equilateral Triangle = " + p);
        input.close();
    }
}
