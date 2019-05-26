package 解释器模式;

/**
 * Created by lichenxing on 2019/5/15.
 */
public class EContext {

    private int index = -1;

    private String[] tokens ;

    private String currentToken;

    public EContext(String text) {
        text = text.replace("  ", " ");
        tokens = text.split(" ");
        nextToken();
    }

    public String nextToken() {
        if(index < tokens.length-1) {
            currentToken = tokens[++index];
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public void skipToken(String token) {
        if(!token.equalsIgnoreCase(currentToken)) {
            System.out.println("错误提示：{"+currentToken+"} 解释错误！");
        }

        nextToken();
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public int GetCurrentNumber()
    {
        int number = 0;
        try
        {
            // 将字符串转换为整数
            number = Integer.parseInt(currentToken);
        }
        catch (Exception ex)
        {
            System.out.println("错误提示：{"+ex.getMessage()+"}");
        }

        return number;
    }
}
