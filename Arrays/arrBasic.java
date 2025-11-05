import java.util.Arrays;

public class arrBasic {

    public static void main(String[] args) {
        int[] zig = new int[10];
        int[] zag = zig;
        zig[0] = 1;
        System.out.println(Arrays.toString(zag));
        System.out.println(zag[0]);

    }
}