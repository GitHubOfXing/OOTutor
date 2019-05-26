package 策略模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class MovieTicket {

    private double price;

    private IDiscount count;


    public double getPrice() {
        if(count != null) {
            return count.calculate(price);
        } else {
            return price;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public IDiscount getCount() {
        return count;
    }

    public void setCount(IDiscount count) {
        this.count = count;
    }
}
