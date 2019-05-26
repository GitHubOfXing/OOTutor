package 代理模式;

/**
 * Created by lichenxing on 2019/5/9.
 */
public class ProxySearch implements ISearch {

    private RealSearch searcher = new RealSearch(); // 维持一个对真实主题的引用
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        if (Validate(userId))
        {
            String result = searcher.doSearch(userId, keyword);
            this.Log(userId);
            return result;
        }
        return null;
    }

    public boolean Validate(String userID)
    {
        validator = new AccessValidator();
        return validator.Validate(userID);
    }


    public void Log(String userID)
    {
        logger = new Logger();
        logger.Log(userID);
    }
}
