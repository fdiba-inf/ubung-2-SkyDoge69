package exercise2;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a != 0) {

            double Disk = Math.pow(b, 2) - 4 * a * c;

            if (Disk < 0) {
                System.out.println("Imaginary values");
            } else {
                double x1 = (-b + sqrt(Disk)) / (2 * a);
                double x2 = (-b - sqrt(Disk)) / (2 * a);
                System.out.print(x1 + ", ");
                System.out.println(x2);
            }
        } else {
            if (b != 0) {
                System.out.println(-b/2*a);
            } else {
                if (c != 0) {
                    System.out.println("No values");
                } else {
                    System.out.println("Many values");
                }
            }
        }





    }
}
