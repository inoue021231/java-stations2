public class Station3 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう
        String testEmail1 = "abcd@example.com";
        String testEmail2 = "abcdexample.com";
        String testEmail3 = "";
        String testEmail4 = null;
        System.out.println(checkEmailAddress(testEmail1));
        System.out.println(checkEmailAddress(testEmail2));
        System.out.println(checkEmailAddress(testEmail3));
        System.out.println(checkEmailAddress(testEmail4));
        User user1 = new User();
        User user2 = new User();
        user2.name = "Taro";
        q2(user1);
        q2(user2);
        System.out.println(user1.name);
        System.out.println(user2.name);
    }

    public static boolean checkEmailAddress(String email) {
        // 問題1: ここから
        if(email != null && email != "" && email.contains("@")) {
            return true;
        } else {
            return false;
        }
        // 問題1: ここまで
    }

    public static void q2(User user) {
        // 問題2: ここから
        if(user.name == null) {
            user.name = "未設定";
        }
        // 問題2: ここまで
    }
}
