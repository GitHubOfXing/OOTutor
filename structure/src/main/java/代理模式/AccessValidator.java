package 代理模式;

/**
 * Created by lichenxing on 2019/5/9.
 */
public class AccessValidator {

    public boolean Validate(String userID)
    {
        System.out.println("在数据库中验证用户 {"+userID+"} 是否是合法用户?");
        if (userID.equalsIgnoreCase("杨过"))
        {
            System.out.println("{"+userID+"} 登录成功!");
            return true;
        }
        else
        {
            System.out.println("{"+userID+"} 登录失败!");
            return false;
        }
    }
}
