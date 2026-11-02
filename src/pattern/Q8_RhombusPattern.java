package pattern;

import java.util.Scanner;

public class Q8_RhombusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
