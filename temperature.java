import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        float tempF = input.nextFloat();

        float tempC = (tempF - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + tempC);

        input.close();
    }
}