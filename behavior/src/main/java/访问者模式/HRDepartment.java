package 访问者模式;

/**
 * Created by lichenxing on 2019/5/8.
 */
public class HRDepartment extends Department {
    @Override
    public void Visit(FullTimeEmployee employee) {
        int workTime = employee.WorkTime;
        System.out.println("临时工 {"+ employee.Name+"} 实际工作时间为：{"+ workTime+"} 小时");
        if (workTime > 40)
        {
            System.out.println("临时工 {"+ employee.Name+"} 加班时间为：{"+ (workTime-40)+"} 小时");
        }
        else if (workTime < 40)
        {
            System.out.println("临时工 {"+ employee.Name+"} 请假时间为：{"+ (40 - workTime)+"} 小时");
        }
    }

    @Override
    public void Visit(PartTimeEmployee partTimeEmployee) {
        int workTime = partTimeEmployee.workTime;
        System.out.println("临时工 {"+ partTimeEmployee.name+"} 实际工作时间为：{"+ workTime+"} 小时");
    }
}
