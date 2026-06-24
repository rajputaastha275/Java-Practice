import java.util.Scanner;

public class fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        for(int i = 1; i <= n; i++)
        {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
            
        }
        input.close();
    }
    
}
