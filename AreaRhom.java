import java.util.Scanner;

public class AreaRhom 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter diagonals ");
        int a = input.nextInt();
        int b = input.nextInt();
        int area = (a * b) / 2;
        System.out.println("Area of Rhombus = " + area);
        input.close();
    }
    
}
