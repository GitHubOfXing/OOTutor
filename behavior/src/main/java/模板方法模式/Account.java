package 模板方法模式;

/**
 * Created by lichenxing on 2019/5/26.
 */
public abstract class Account {
    public boolean validate(String account, String password) {
        System.out.println("账号 : {" + account + "}");
        System.out.println("密码 : {" + password + "}");

        if (account.equals("张无忌") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void calculateInterest();

    public void display() {
        System.out.println("显示利息");
    }

    public boolean isAllowDisplay() {
        return true;
    }

    public void handle(String account, String password) {
        if(!validate(account,password)) {
            System.out.println("账户或密码错误，请重新输入！");
        }

        calculateInterest();

        if(isAllowDisplay()) {
            display();
        }
    }
}
