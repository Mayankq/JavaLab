import java.util.Scanner;

public class prog6 {
   public static void main(String args[])
    {
          int a, b, res=0;
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the first number:");
           a = scanner.nextInt();
            System.out.println("Enter the second number:");
           b = scanner.nextInt();
            System.out.println("Enter the operator:");
           char c = scanner.next().charAt(0);
           switch (c){
            case '+':
            res = a+b;
            break;
            case '-':
            res = a-b;
            break;
            case '*':
            res = a*b;
            break;
            case '/':
            res = a/b;
            break;
           }
           System.out.println("The result is:" +res); 
           scanner.close();
        }
    }
