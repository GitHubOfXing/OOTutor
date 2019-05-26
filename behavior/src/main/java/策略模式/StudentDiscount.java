package 策略模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class StudentDiscount implements IDiscount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        return price * 0.8;
    }
}
