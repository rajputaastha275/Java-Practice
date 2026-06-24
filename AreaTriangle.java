import java.util.Scanner;

public class AreaTriangle 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base");
        int b = input.nextInt();
        System.out.println("Enter height");
        int h = input.nextInt();
        float area = 1 * b * h;
        System.out.println("Area of Triangle = " + area);
        input.close();
    }
    
}
