package 状态模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class DemoContext {

    private State state;


    public void setState(State state) {
        this.state = state;
    }


    public void request(String sample) {
        state.handle(sample);
    }
}
