package 状态模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class Test {
    public static void main(String[] args) {
        State s = new ConcreteStateA();
        DemoContext context = new DemoContext();
        context.setState(s);
        context.request("AAA test");

        State s2 = new ConcreteStateB();
        context.setState(s2);
        context.request("BBB test");
    }
}
