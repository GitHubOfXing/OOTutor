package 代理模式;

/**
 * Created by lichenxing on 2019/5/9.
 */
public class RealSearch implements ISearch {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("{"+userId+"} 使用关键词 {"+keyword+"}");
        return "返回具体内容";
    }
}
