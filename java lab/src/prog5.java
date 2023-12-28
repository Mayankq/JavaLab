import java.util.Scanner;

public class prog5 {
   public static void main(String args[])
    {
          int a, check = 0;
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number:");
           a = scanner.nextInt();
          for (int i = 2; i< a; i++){
            if (a % i == 0){
                check = 1;
                break;

            }
          }
          if(check == 0){
            System.out.print("The number "+ a +" is prime.");
          }
          else{
            System.out.print("The number "+ a +" is not prime.");
          }
          scanner.close();
        }
    }