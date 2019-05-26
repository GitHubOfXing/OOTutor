package 解释器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichenxing on 2019/5/15.
 */
public class ExpressionNode extends Node {

    private List<Node> nodeList = new ArrayList();


    @Override
    void intercept(EContext context) {
        while(true) {
            if(context.getCurrentToken() == null) {
                break;
            } else if(context.getCurrentToken().equalsIgnoreCase("END")) {
                context.skipToken("END");
                break;
            } else {
                Node node = new CommandNode();
                node.intercept(context);
                nodeList.add(node);
            }
        }
    }

    @Override
    void execute() {
        for(Node n : nodeList) {
            n.execute();
        }
    }
}
