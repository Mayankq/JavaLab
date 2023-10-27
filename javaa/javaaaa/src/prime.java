import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int a, check = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check: ");
        a = sc.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("The entered number is prime.");
        } else {
            System.out.println("The entered number is composite.");
        }
    }
}
