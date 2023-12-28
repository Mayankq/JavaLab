
import java.util.Scanner;

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public void increment() {
        this.real++;
        this.imaginary++;
    }

    public void decrement() {
        this.real--;
        this.imaginary--;
    }

    public boolean equals(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

        // Addition of two complex numbers
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");

        // Subtraction of two complex numbers
        ComplexNumber difference = c1.subtract(c2);
        System.out.println("Difference: " + difference.real + " + " + difference.imaginary + "i");

        // Incrementing a complex number
        c1.increment();
        System.out.println("Incremented: " + c1.real + " + " + c1.imaginary + "i");

        // Decrementing a complex number
        c1.decrement();
        System.out.println("Decremented: " + c1.real + " + " + c1.imaginary + "i");

        // Compare two complex numbers 
        System.out.println("Enter the real part of the third complex number:");
        double real3 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the third complex number:");
        double imaginary3 = scanner.nextDouble();
        ComplexNumber c3 = new ComplexNumber(real3, imaginary3);

        System.out.println("Enter the real part of the fourth complex number:");
        double real4 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the fourth complex number:");
        double imaginary4 = scanner.nextDouble();
        ComplexNumber c4 = new ComplexNumber(real4, imaginary4);

        if (c3.equals(c4)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}



