import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 2;
        if (num == 1 || num == 0) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        while(num >= i * i){    // optimized approach Complexity: n log n 
            if(num % i == 0){
                System.out.println(num + " is not a prime number.");
                return;
                
            }
            i++;

        }
        System.out.println(num + " is a prime number.");
        sc.close();
    }
}
