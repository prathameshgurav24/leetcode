package pattern;

import java.util.Scanner;

/**
 * HollowSquare
 * * * * * * *
 *           *
 *           *
 *           *
 *           *
 * * * * * * *
 */
public class Q1_HollowSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        System.out.println();
        for (int i = 1; i <=number; i++) {
            if (number - i == number-1 || i==number) {
                for (int j = 1; j <= number; j++) {
                    System.out.print("* ");
                }
            } else{
                for (int j = 1; j <= number; j++) {
                    if (j==1 || j==number) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
System.out.println();
        }

    }

}