import java.util.Scanner;

public class arearec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of length: ");
        int a = sc.nextInt();
        System.out.println("Please enter the value of width: ");
        int b = sc.nextInt();
        int area = a * b;
        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }
}
