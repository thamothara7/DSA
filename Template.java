import java.util.*;

public class Template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // example input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // --- Write your logic here ---
        solve(arr, n);
    }

    static void solve(int[] arr, int n) {
        System.out.println("Input array: " + Arrays.toString(arr));
    }
}
