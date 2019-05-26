package 模板方法模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }

    @Override
    public boolean isAllowDisplay() {
        return super.isAllowDisplay();
    }
}
