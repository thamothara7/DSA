package DP;

public class maX {
    public static void main(String[] args) {
        int [] arr = {1,5,3,9,2,8};
       max(arr);

    }
    static void max(int [] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } 
        }
        System.out.println(max);
    }

}
