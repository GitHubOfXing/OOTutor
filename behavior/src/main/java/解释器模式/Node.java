package 解释器模式;

/**
 * Created by lichenxing on 2019/5/15.
 */
public abstract class Node {
    abstract void intercept(EContext context);

    abstract void execute();
}
