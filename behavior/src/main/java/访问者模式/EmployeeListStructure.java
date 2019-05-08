package 访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class EmployeeListStructure {

    private List<IEmployee> empList = new ArrayList<>();

    public void AddEmployee(IEmployee employee) {
        this.empList.add(employee);
    }

    public void Accept(Department handler) {
        for(IEmployee e : empList) {
            e.Accept(handler);
        }
    }
}
