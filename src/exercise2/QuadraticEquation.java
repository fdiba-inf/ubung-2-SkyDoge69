package exercise2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double Disk = Math.pow(b, 2) - 4 * a * c;

        if (Disk < 0) {
            System.out.println("Imaginary values");
        } else {
            double x1 = (-b + sqrt(Disk))/ (2 * a);
            double x2 = (-b - sqrt(Disk))/ (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }





    }
}
