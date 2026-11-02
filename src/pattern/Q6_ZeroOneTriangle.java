package pattern;

import java.util.Scanner;

public class Q6_ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j > 0; j--) {
                    System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}
