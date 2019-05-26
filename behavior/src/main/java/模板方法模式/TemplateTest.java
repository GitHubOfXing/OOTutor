package 模板方法模式;

import 模板方法模式.Account;
import 模板方法模式.CurrentAccount;
import 模板方法模式.SavingAccount;

/**
 * Created by lichenxing on 2019/5/26.
 */
public class TemplateTest {

    public static void main(String[] args) {
        Account a = new CurrentAccount();
        a.handle("张无忌", "123456");

        a = new SavingAccount();
        a.handle("张无忌", "123456");
    }
}
