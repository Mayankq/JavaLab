import java.util.Scanner;

public class prog4 {
   public static void main(String args[])
    {
          
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number:");
          int a = scanner.nextInt();
          if(a%2==0)
          {
            System.out.println("The number is even");
           }
           else{
            System.out.println("The number is odd");
           }
           scanner.close();
        }
}


