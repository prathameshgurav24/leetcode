package pattern;

import java.util.Scanner;

public class Q12_RightHandPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter number : " + number);
        scanner.close();

    for (int i = 0; i < number; i++) {
        for (int j = i; j >=0; j--) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
