import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator:");
        double num1 = scanner.nextInt();

        System.out.println("Enter the denominator:");
        double num2 = scanner.nextInt();

        try {
            if (num1 < 0 || num2 <= 0) {
                throw new Exception("Negative number input or divide by zero exception");
            }
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
