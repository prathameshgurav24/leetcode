package pattern;

import java.util.Scanner;

/**
 * Q4_NumberIncreasingReversePyramid
 */
public class Q4_NumberIncreasingReversePyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        for (int i = number; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}