import java.util.Scanner;

public class PeriSq 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side");
        int s = input.nextInt();
        int p = 4 * s;
        System.out.println("Perimeter of Square = " + p);
        input.close();
    }
}
