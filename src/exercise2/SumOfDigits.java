package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        while (n != 0) {
            int d = n%10;
            sum = sum + d;
             n = n/10;
        }

        System.out.println("Sum of digits: " + sum);

    }
}
