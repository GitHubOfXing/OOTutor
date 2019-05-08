package 观察者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class Player implements IObserver {

    String name;


    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void help() {
        System.out.println("{"+name+"} ：坚持住，立马来救你！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println("{"+name+"}：我正被攻击，速来援救！");
        acc.notifyObserver(name);
    }
}
