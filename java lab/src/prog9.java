import java.util.Scanner;
public class prog9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string:");
        String inputString1 = sc.nextLine();
        System.out.println("The string entered by you is:"+inputString1);
        System.out.println("Enter another string:");
        String inputString2 = sc.nextLine();
        System.out.println("The string entered by you is:"+inputString2);
        System.out.println(inputString1.concat(inputString2));
       sc.close();
    }
}