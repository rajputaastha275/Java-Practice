import java.util.Scanner;

public class AreaEqT 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side");
        int s = input.nextInt();
        double area = (1.73 / 4) * s * s;
        System.out.println("Area of Equilateral Triangle = " + area);
        input.close();
    }
    
}
