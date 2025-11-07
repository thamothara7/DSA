import java.util.*;

public class multiDimen {

    public static void main(String[] args) {
        // int [] [] matrix = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // System.out.println(matrix[1][0]);
Scanner sc = new Scanner(System.in);
        int [][]  arr = new int [3][3];
        
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
               System.out.print("Enter the value of " + row + " " + col + ": ");
               arr [row][col] = sc.nextInt();
            }
        }
        // for(int row = 0; row < arr.length; row++) {
        //     for(int col = 0; col < arr[row].length; col++) {
        //        System.out.print(arr [row][col] + "  ");
        //     }
        //     System.out.println();
        // }
        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
    

}