package 访问者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class VisitorTest {
    public static void main(String[] args) {
        EmployeeListStructure empList = new EmployeeListStructure();
        IEmployee fteA = new FullTimeEmployee("梁思成", 3200.00, 45);
        IEmployee fteB = new FullTimeEmployee("徐志摩", 2000, 40);
        IEmployee fteC = new FullTimeEmployee("梁徽因", 2400, 38);
        IEmployee fteD = new PartTimeEmployee("方鸿渐", 80, 20);
        IEmployee fteE = new PartTimeEmployee("唐宛如", 60, 18);

        empList.AddEmployee(fteA);
        empList.AddEmployee(fteB);
        empList.AddEmployee(fteC);
        empList.AddEmployee(fteD);
        empList.AddEmployee(fteE);

        Department par = new FinanceDepartment();

        empList.Accept(par);


        par = new HRDepartment();
        empList.Accept(par);
    }
}
