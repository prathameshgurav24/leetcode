package IBM;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 57;

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime " + i);
                break;
            }
        }


    }

}
