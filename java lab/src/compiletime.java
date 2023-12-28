import java.util.Scanner;

public class compiletime {

    public int usrstrcmp(String s1, String s2, int n) {
        if (s1.substring(0, n).equals(s2.substring(0, n))) {
            System.out.println("The strings are same till the" + n + "th character");
        } else {
            System.out.println("The strings are not the same until the " + n + "rd character");
        }
        return 0;
    }

    public int usrstrcmp(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("Both the strings are same.");
        } else {
            System.out.println("The strings are not the same.");
        }
        return 0;
    }

    public static void main(String[] args) {
        compiletime instance = new compiletime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Please enter the second string: ");
        String s2 = sc.nextLine();
        instance.usrstrcmp(s1, s2);
        instance.usrstrcmp(s1, s2, 5);
        sc.close();
    }
}