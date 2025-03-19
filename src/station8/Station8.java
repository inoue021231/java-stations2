import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Station8 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう
    }

    public static HashSet<String> aggregateUserId(ArrayList<Order> orders) {
        // 問題1: ここから
        HashSet<String> userIds = new HashSet<>();
        for (Order order : orders) {
            userIds.add(order.userId);
        }
        return userIds;
        // 問題1: ここまで
    }

    public static HashMap<String, Integer> aggregateUserAndTotalPrice(ArrayList<Order> orders) {
        // 問題2: ここから
        HashMap<String, Integer> userAndTotalPrice = new HashMap<>();
        for (Order order : orders) {
            String userId = order.userId;
            int totalPrice = order.totalPrice;
            if (userAndTotalPrice.containsKey(userId)) {
                totalPrice += userAndTotalPrice.get(userId);
            }
            userAndTotalPrice.put(userId, totalPrice);
        }
        return userAndTotalPrice;
        // 問題2: ここまで
    }
}
