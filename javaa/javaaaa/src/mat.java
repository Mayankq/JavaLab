import java.util.Scanner;

public class mat {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[5][5];
        int[][] mat2 = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
    }
}
