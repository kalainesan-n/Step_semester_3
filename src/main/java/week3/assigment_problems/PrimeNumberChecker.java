

public class PrimeNumberChecker {

    static void checkPrime(int number) {

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {

        checkPrime(17);
        checkPrime(18);
    }
}