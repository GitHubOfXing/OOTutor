package 命令模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class WindowCommand extends Command {

    private WindowHandler handler;


    public WindowCommand() {
        this.handler = new WindowHandler();
    }

    @Override
    public void execute() {
        if(handler != null) {
            handler.Minimize();
        }
    }
}
