import java.util.Scanner;

public class USD 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ammount in Indian rupee");
        float rupee = input.nextFloat();
        float dollar = (rupee) / 85;
        System.out.println("USD = " + dollar);
        input.close();
    }
    
}
