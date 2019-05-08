package 访问者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class FinanceDepartment extends Department {
    @Override
    public void Visit(FullTimeEmployee employee) {
        int workTime = employee.WorkTime;
        double weekWage = employee.WeeklyWage;

        if (workTime > 40)
        {
            weekWage = weekWage + (workTime - 40) * 50;
        }
        else if (workTime < 40)
        {
            weekWage = weekWage - (40 - workTime) * 80;
            if (weekWage < 0)
            {
                weekWage = 0;
            }
        }

        System.out.println("临时工 {"+ employee.Name+"} 实际工资为：{"+ weekWage+"} 元");
    }

    @Override
    public void Visit(PartTimeEmployee partTimeEmployee) {
        int workTime = partTimeEmployee.workTime;
        double hourWage = partTimeEmployee.hourWage;
        System.out.println("临时工 {"+ partTimeEmployee.name+"} 实际工资为：{"+ workTime * hourWage+"} 元");
    }
}
