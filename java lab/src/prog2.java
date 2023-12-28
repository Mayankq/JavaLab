import java.util.Scanner;
public class prog2 {
    public static void main(String args[])
    {

          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the length of rectangle:");
          int length = scanner.nextInt();
          System.out.println("Enter the breadth of rectangle:");
           int breadth = scanner.nextInt();
           int area;
           area = length*breadth;
          System.out.println("The area of rectangle is:"+area);
          scanner.close();
    }
}
