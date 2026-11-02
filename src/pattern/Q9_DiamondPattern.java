package pattern;

import java.util.Scanner;

public class Q9_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
