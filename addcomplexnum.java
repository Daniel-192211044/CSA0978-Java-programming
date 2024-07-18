import java.util.Scanner;

class Complex {
    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
}

public class addcomplexnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        Complex c1 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter real and imaginary part of second complex number: ");
        Complex c2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum.real + " + " + sum.imag + "i");

        scanner.close();
    }
}
