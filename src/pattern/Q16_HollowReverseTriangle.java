package pattern;

import java.util.Scanner;

public class Q16_HollowReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        for (int j = 1; j <= number; j++) {
                    System.out.print("*-");
                }
            System.out.println();

        for (int i = 1; i < number-1; i++) {
            for (int j = 0; j < number; j++) {
                if (j==i || j==number-i) {
                    System.out.print("*");
                } else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
