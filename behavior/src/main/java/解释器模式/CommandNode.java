package 解释器模式;

/**
 * Created by lichenxing on 2019/5/15.
 */
public class CommandNode extends Node {

    private Node node;

    @Override
    void intercept(EContext context) {
        if (context.getCurrentToken().equalsIgnoreCase("LOOP"))
        {
            node = new LoopCommand();
            node.intercept(context);
        } else {
            node = new PrimaryCommand();
            node.intercept(context);
        }
    }

    @Override
    void execute() {
        if(node != null) {
            node.execute();
        }
    }
}
