package 观察者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyname) {
        this.allyName = allyname;
        System.out.println("系统通知：{"+allyname+"} 战队组建成功！");
        System.out.println("-------------------------------------------------------");

    }

    @Override
    public void notifyObserver(String name) {
        System.out.println("通知：盟友们，{"+name+"} 正遭受敌军攻击，速去抢救！");

        for(IObserver observer : playerList) {
            observer.help();
        }
    }
}
