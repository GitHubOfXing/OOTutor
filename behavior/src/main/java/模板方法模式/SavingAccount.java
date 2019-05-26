package 模板方法模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }

    @Override
    public boolean isAllowDisplay() {
        return false;
    }
}
