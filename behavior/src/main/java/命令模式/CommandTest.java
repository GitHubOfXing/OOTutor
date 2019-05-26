package 命令模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class CommandTest {

    public static void main(String[] args) {
        FBSettingWindow window = new FBSettingWindow("设置窗口");
        FuntionButton help = new FuntionButton("helper");
        help.setCommand(new HelperCommand());

        FuntionButton w = new FuntionButton("window");
        w.setCommand(new WindowCommand());

        window.addFuctionButton(help);
        window.addFuctionButton(w);

        window.display();

        help.onClick();

        w.onClick();

    }
}
