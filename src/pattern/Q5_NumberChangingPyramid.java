package pattern;

import java.util.Scanner;

public class Q5_NumberChangingPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();
        int n=1;
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n+++" ");
            }
            System.out.println();
        }
    }
}
