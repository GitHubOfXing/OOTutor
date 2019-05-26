package deathlock;

public class DeadLock
{
    private final Object left = new Object();
    private final Object right = new Object();
    
    public void leftRight() throws Exception
    {
        synchronized (left)
        {
            System.out.println("into leftRight!");
            Thread.sleep(2000);
            synchronized (right)
            {
                System.out.println("leftRight end!");
            }
        }
    }
    
    public void rightLeft() throws Exception
    {
        synchronized (right)
        {
            System.out.println("into rightLeft!");
            Thread.sleep(2000);
            synchronized (left)
            {
                System.out.println("rightLeft end!");
            }
        }
    }
}