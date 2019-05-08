package 访问者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public abstract class Department {
    public abstract void Visit(FullTimeEmployee employee);
    public abstract  void Visit(PartTimeEmployee partTimeEmployee);
}
