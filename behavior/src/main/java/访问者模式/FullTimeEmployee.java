package 访问者模式;

public class FullTimeEmployee implements IEmployee
    {
        public String Name;
        public double WeeklyWage;
        public int WorkTime;

        public FullTimeEmployee(String name, double weeklyWage, int workTime)
        {
            this.Name = name;
            this.WeeklyWage = weeklyWage;
            this.WorkTime = workTime;
        }

        public void Accept(Department handler)
        {
            handler.Visit(this);
        }
    }