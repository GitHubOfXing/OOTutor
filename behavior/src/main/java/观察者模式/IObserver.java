package 观察者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public interface IObserver {

    String getName();

    void help();
    void beAttacked(AllyControlCenter acc);

}
