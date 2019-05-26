package test_interrupt;

/**
 * Created by lichenxing on 2019/5/11.
 */
public class ThreadFlag extends Thread {

    public volatile boolean exit = false;

    public void run() {
        while(!exit){
            System.out.println("------");
        };
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadFlag flag = new ThreadFlag();
        flag.start();
        sleep(1000);
        flag.exit = true;
        flag.join();
        System.out.println("线程退出!");
    }
}
