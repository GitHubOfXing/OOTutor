package 状态模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(String sample) {
        System.out.println("ConcreteStateA handle ：" + sample);
    }
}
