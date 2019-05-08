package 观察者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class ObserverTest {
    public static void main(String[] args) {
        AllyControlCenter center = new ConcreteAllyControlCenter("斩首小队");
        IObserver observerA = new Player("冷血");
        IObserver observerB = new Player("无情");
        IObserver observerC = new Player("铁手");
        IObserver observerD = new Player("追命");

        center.join(observerA);
        center.join(observerB);
        center.join(observerC);
        center.join(observerD);

        System.out.println("---------");

        observerB.beAttacked(center);

        System.out.println("---------");


        center.quit(observerD);
        center.quit(observerC);
        center.quit(observerB);
        center.quit(observerA);

    }
}
