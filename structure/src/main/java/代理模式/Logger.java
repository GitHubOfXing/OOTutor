package 代理模式;

/**
 * Created by lichenxing on 2019/5/9.
 */
public class Logger {

    public void Log(String userID)
    {
        System.out.println("更新数据库，用户 {"+userID+"} 查询次数加1!");
    }
}
