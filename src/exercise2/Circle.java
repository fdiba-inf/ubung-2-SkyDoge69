package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();

        double C = 2 * radius * pi;
        double A = pi * Math.pow(radius, 2);

        System.out.println("Circumference: " + C);
//        System.out.println("Area: " + A);
    }
}
