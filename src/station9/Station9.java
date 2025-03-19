import java.util.ArrayList;
import java.util.Random;

public class Station9 {

    public static String printOrder(ArrayList<Item> itemList, Random random) {
        // ここから
        StringBuilder sb = new StringBuilder();
        int total = 0;
        for (Item item : itemList) {
            sb.append(item.name);
            sb.append(" ");
            sb.append(item.price);
            sb.append("円");
            sb.append(System.lineSeparator());
            total += item.price;
        }
        sb.append("合計 ");
        sb.append(total);
        sb.append("円");
        sb.append(System.lineSeparator());

        int lottery = random.nextInt(100);
        if (lottery % 50 == 0) {
            sb.append("1等: 全額キャッシュバック");
        } else if (lottery % 10 == 0) {
            sb.append("2等: 10%キャッシュバック");
        }
        // ここまで
        return sb.toString(); // return文を追加
    }
}
