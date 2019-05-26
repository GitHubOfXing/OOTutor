package 解释器模式;

/**
 * Created by lichenxing on 2019/5/15.
 */
public class PrimaryCommand extends Node {

    private String name;
    private String text;

    @Override
    void intercept(EContext context) {
        name = context.getCurrentToken();
        context.skipToken(name);
        if (!name.equalsIgnoreCase("PRINT")
                && !name.equalsIgnoreCase("BREAK")
                && !name.equalsIgnoreCase("SPACE"))
        {
            System.out.println("非法命令！");
        }

        if (name.equalsIgnoreCase("PRINT"))
        {
            text = context.getCurrentToken();
            context.nextToken();
        }
    }

    @Override
    void execute() {
        if (name.equalsIgnoreCase("PRINT"))
        {
            System.out.print(text);
        }
        else if (name.equalsIgnoreCase("SPACE"))
        {
            System.out.print(" ");
        }
        else if (name.equalsIgnoreCase("BREAK"))
        {
            System.out.print("\r\n");
        }
    }
}
