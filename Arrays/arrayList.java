import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(67);
        list.add(45);
        list.add(89);
        list.add(23);
        list.add(12);
        list.add(1, 100);
        list.remove(2);
        list.set(3, 500);
        System.out.println(list);   
        System.out.println(list.size());
        System.out.println(list.contains(123));

        }
    
}
