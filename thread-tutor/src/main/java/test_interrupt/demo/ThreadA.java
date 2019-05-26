package test_interrupt.demo;

public class ThreadA extends Thread {
    int count = 0;

    public void run() {
        System.out.println(getName() + "将要运行...");
//       !this.isInterrupted()
        try {
            while (!isInterrupted()) {
                System.out.println(getName() + "运行中" + count++);
//           try {
//               Thread.sleep(400);
//           } catch (InterruptedException e) {
//               System.out.println(getName() + "从阻塞中退出...");
//               System.out.println("this.isInterrupted()=" + this.isInterrupted());
//           }

                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + "从阻塞中退出...");
            System.out.println("this.isInterrupted()=" + this.isInterrupted());
        }
        System.out.println(getName() + "已经终止!");
    }

}