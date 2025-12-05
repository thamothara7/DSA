import java.util.*;
public class primeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        int c = 2;
        if(N <= 1){
            System.out.println(N + " Neither prime nor composite");
        }
        while (c*c <= N) {
            if (N%c == 0) {
                System.out.println(N + " is not a prime number");
                break;
            } else {
                c++;
            }
           
        }
        System.out.println(N + " is a prime number");
        


    }
}
