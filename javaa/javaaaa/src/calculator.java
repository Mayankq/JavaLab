import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b, res = 0;
        System.out.println("Please enter the first number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        b = sc.nextInt();
        System.out.println("Please enter the operator: ");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
        System.out.println("The result is: " + res);
        sc.close();
    }
}
