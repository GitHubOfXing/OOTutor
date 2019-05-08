package 访问者模式;

public interface IEmployee {
    public void Accept(Department handler);
}