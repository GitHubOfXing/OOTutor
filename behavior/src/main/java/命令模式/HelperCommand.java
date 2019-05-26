package 命令模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class HelperCommand extends Command {

    private HelpHandler handler;


    public HelperCommand() {
        this.handler = new HelpHandler();
    }

    @Override
    public void execute() {
        if(handler != null) {
            handler.display();
        }
    }
}
