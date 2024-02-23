import java.util.ArrayList;
import java.util.Collections;


public class dynamicArrays {
    public static void main(String args[]) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(14);
        arr.add(45);
        arr.add(85);
        arr.add(44);
        arr.add(23);

        System.out.println(arr);
        System.out.println(arr.get(0));

        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.size());
        
        Collections.sort(arr);
        System.out.println(arr);

        arr.clear();
        System.out.println(arr);


    }
}