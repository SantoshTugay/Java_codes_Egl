package interview_prgrams.java.JavaSamples;

public class PrintAllPrimeNumber {

    public static void main(String[] args) {

        int limit = 10;   // print primes up to this number
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}