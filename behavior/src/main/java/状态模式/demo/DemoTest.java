package 状态模式.demo;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class DemoTest {
    public static void main(String[] args) {
        VoteManager m = new VoteManager();
        int i = 0;
        while(i < 5) {
            m.vote("aaa", "明星2");
            i++;
        }

        while(i < 12) {
            m.vote("aaa", "明星2");
            i++;
        }
    }

}
