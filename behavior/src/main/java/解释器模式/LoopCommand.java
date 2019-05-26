package 解释器模式;

/**
 * Created by lichenxing on 2019/5/15.
 */
public class LoopCommand extends Node {

    // 循环次数
    private int number;
    // 循环语句中的表达式
    private Node commandNode;

    @Override
    void intercept(EContext context) {
        context.skipToken("LOOP");
        number = context.GetCurrentNumber();
        context.nextToken();
        // 循环语句中的表达式
        commandNode = new ExpressionNode();
        commandNode.intercept(context);
    }

    @Override
    void execute() {
        for (int i = 0; i < number; i++)
        {
            commandNode.execute();
        }
    }
}
