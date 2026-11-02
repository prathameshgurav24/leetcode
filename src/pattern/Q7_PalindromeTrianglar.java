package pattern;

import java.util.Scanner;

public class Q7_PalindromeTrianglar {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
