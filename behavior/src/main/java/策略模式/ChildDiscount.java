package 策略模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class ChildDiscount implements IDiscount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        return price - 10;
    }
}
