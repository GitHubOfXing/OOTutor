package 策略模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class StrategyTest {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(200);
        System.out.println("原始票价："+ticket.getPrice());

        ticket.setCount(new StudentDiscount());
        System.out.println("学生票价："+ticket.getPrice());

        ticket.setCount(new VIPDiscount());
        System.out.println("VIP票价："+ticket.getPrice());

        ticket.setCount(new ChildDiscount());
        System.out.println("儿童票价："+ticket.getPrice());
    }
}
