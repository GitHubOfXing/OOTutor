package test_interrupt.demo;

public class ThreadDemo {
    
    public static void main(String argv[]){
        try {
            ThreadA ta = new ThreadA();
            ta.setName("ThreadA");
            ta.start();
            Thread.sleep(300);
            System.out.println(ta.getName() + "正在被中断...");
            ta.interrupt();
            Thread.sleep(300);
            System.out.println("ta.isInterrupted()=" + ta.isInterrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}