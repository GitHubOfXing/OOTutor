package 访问者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class PartTimeEmployee implements IEmployee {

    public String name;
    public double hourWage;
    public int workTime;

    public PartTimeEmployee(String name, double hourWage, int workTime) {
        this.name = name;
        this.hourWage = hourWage;
        this.workTime = workTime;
    }

    public void Accept(Department handler) {
        handler.Visit(this);
    }
}
