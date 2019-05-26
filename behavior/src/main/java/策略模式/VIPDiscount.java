package 策略模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class VIPDiscount implements IDiscount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP 票");
        return price * 0.5;
    }
}
