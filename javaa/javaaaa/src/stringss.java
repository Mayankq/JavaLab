import java.util.Scanner;

public class stringss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.print("\033[H\033[2J");
        System.out.println("Please enter a string: ");
        s1 = sc.nextLine();
        System.out.println("The string entered by you is: " + s1);
        System.out.println("The characters present in the string are: ");
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println("Please enter another string: ");
        String s2 = sc.nextLine();
        System.out.println("The string entered by you is: " + s2);
        System.out.println("The strings after concatenation is: " + s1.concat(s2));
        System.out.println("The first string reversed is: ");
        String s1rev;
        sc.close();
    }
}
