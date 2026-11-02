package pattern;

import java.util.Scanner;

public class Q10_ButterflyStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

        // for (int i = 0; i < number; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = i; j < number-1; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = i; j < number-1; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = number-1; i >0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = i; j <= number-1; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = i; j <= number-1; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < number; i++) {
            for (int j = i; j >=0; j--) {
                if (j%2==1) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");       
                }
            }
            for (int j = (number-i)*2; j > i; j--) {
                    System.out.print(" ");
            }

            for (int j = number-1; j >1; j--) {
                    if (j%2==1) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");       
                }
            

            System.out.println();
        }
    }
}
