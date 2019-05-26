package 解释器模式;

/**
 * Created by lichenxing on 2019/5/15.
 */
public class ExplainTest {

    public static void main(String[] args)
    {
        String instruction = "LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉";
        EContext context = new EContext(instruction);

        Node node = new ExpressionNode();
        node.intercept(context);

        System.out.println("源指令 : {"+instruction+"}");
        System.out.println("解释后 : ");

        node.execute();
    }
}
