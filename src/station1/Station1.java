import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう
        ArrayList<String> answer1 = q1();
        System.out.println(answer1);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Tech");
        list.add("Train");
        list.add("Railway");
        ArrayList<String> searchWords = new ArrayList<String>();
        searchWords.add("Railway");
        searchWords.add("Tech");
        searchWords.add("Station");
        int answer2 = q2(list, searchWords);
        System.out.println(answer2);
    }

    public static ArrayList<String> q1() {
        // 問題1: ここから
        ArrayList<String> items = new ArrayList<String>();
        items.add("Tech");
        items.add("Train");
        return items;
        // 問題1: ここまで
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        // 問題2: ここから
        int count = 0;
        for (String searchWord : searchWords) {
            if (list.contains(searchWord)) {
                count++;
            }
        }
        return count;
        // 問題2: ここまで
    }
}
