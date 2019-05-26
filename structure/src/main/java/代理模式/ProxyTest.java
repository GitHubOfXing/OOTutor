package 代理模式;

/**
 * Created by lichenxing on 2019/5/9.
 */
public class ProxyTest {

    public static void main(String[] args) {
        ISearch s = new ProxySearch();

        s.doSearch("杨过", "玉女心经");
    }
}
