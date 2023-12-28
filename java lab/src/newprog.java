
import java.util.Scanner;

interface Compute {
    void convert();
}

class BytesToKilobytes implements Compute {
    public void convert() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of bytes: ");
        double bytes = input.nextDouble();
        double kilobytes = bytes / 1024;
        System.out.println(bytes + " bytes = " + kilobytes + " kilobytes");
    }
}

class EurosToRupees implements Compute {
    public void convert() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in euros: ");
        double euros = input.nextDouble();
        double rupees = euros * 88.5;
        System.out.println(euros + " euros = " + rupees + " rupees");
    }
}

public class newprog {
    public static void main(String[] args) {
        Compute obj1 = new BytesToKilobytes();
        Compute obj2 = new EurosToRupees();
        obj1.convert();
        obj2.convert();
    }
}

