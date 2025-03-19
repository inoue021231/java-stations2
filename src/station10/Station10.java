import java.util.ArrayList;
import java.util.Iterator;

public class Station10 {

    public static void q1(ArrayList<Integer> list) {
        // ここから
        int length = list.size();
        int max = String.format("%,d", list.get(0)).length();
        for (int i = 1; i < length; i++) {
            int value = String.format("%,d", list.get(i)).length();
            if (value > max) {
                max = value;
            }
        }
        for (Integer value : list) {
            System.out.println(String.format("%," + max + "d", value));
        }
        // ここまで
    }
}
