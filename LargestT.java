import java.util.Scanner;

public class LargestT 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if(b > max)
        {
            max = b;
        }
        else if(c > max)
        {
            max = c;
        }
        System.out.println("Largest = " + max);
        input.close();
    }
}

//max = Math.max(a,b)
