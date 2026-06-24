import java.util.Scanner;

public class PeriParallel 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides");
        int a = input.nextInt();
        int b = input.nextInt();
        int p = 2 * (a + b);
        System.out.println("Perimeter of Parallelogram = " + p );
        input.close();
    }
}
