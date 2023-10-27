import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        int temp;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter element" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array before sorting is: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + ", ");
        }
        for (int k = 0; k < 10; k++) {
            for (int l = 1; l < 10 - k; l++) {
                if (arr[l] < arr[l - 1]) {
                    temp = arr[l];
                    arr[l] = arr[l - 1];
                    arr[l - 1] = temp;
                }
            }
        }
        System.out.println("The array after sorting is: ");
        for (int v = 0; v < 10; v++) {
            System.out.print(arr[v] + ", ");
        }
        sc.close();
    }
}
