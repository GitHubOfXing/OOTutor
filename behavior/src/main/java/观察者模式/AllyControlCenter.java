package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichenxing on 2019/5/8.
 */
public abstract class AllyControlCenter {

    String allyName = "";
    protected List<IObserver> playerList = new ArrayList<IObserver>();

    public void join(IObserver observer) {
        playerList.add(observer);
        System.out.println("通知：{"+observer+"} 加入 {"+this.allyName+"} 战队");
    }

    public void quit(IObserver observer) {
        playerList.remove(observer);
        System.out.println("通知：{"+observer.getName()+"} 退出 {"+this.allyName+"} 战队");
    }

    public abstract void notifyObserver(String name);
}
