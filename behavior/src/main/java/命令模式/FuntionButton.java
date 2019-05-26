package 命令模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class FuntionButton {

    private String name;


    public String getName() {
        return name;
    }

    private Command command;

    public FuntionButton(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.println("点击");

        if(command != null) {
            command.execute();
        }
    }
}
