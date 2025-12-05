import java.util.*;

public class primeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        int c = 2;
        boolean isPrime = true;
        if (N <= 1) {
            System.out.println(N + " Neither prime nor composite");
        } else {
            while (c * c <= N) {
                if (N % c == 0) {
                    isPrime = false;
                    break;
                } else {
                    c++;
                }

            }
        }
        if (isPrime) {
            System.out.println(N + " is a prime number");
        } else {
            System.out.println(N + " is not a prime number");
        }

    }
}
