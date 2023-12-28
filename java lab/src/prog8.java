import java.util.Scanner;
public class prog8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        System.out.println("The string entered by you is:"+inputString);
        for(int i = 0;i<inputString.length();i++)
        {
          System.out.println(inputString.charAt(i));                
         }
        sc.close();
    }
}