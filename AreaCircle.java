import java.util.Scanner;

public class AreaCircle 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = input.nextInt();
        double area = (3.14) * r * r;
        System.out.println("Area of Circle = " + area);

        input.close();
    }
}
