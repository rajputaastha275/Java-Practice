import java.util.Scanner;

public class sinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal ammount");
        int p = input.nextInt();
        System.out.println("Enter time");
        int t = input.nextInt();
        System.out.println("Enter rate");
        int r = input.nextInt();
         
        float si = (p * r * t) / 100;
        System.out.println("Simple interest = " + si);

        input.close();
    }
    
}
