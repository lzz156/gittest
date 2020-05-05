package TEST;

import java.time.LocalDate;

public class Empioyee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    public  Empioyee(String n,double s,int year,int month ,int day){
        name = n;
        salary=s;
        hireDay=LocalDate.of(year,month,day);
    }
    public String getName() {
        return name;
    }
    public double getSalar() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise =salary*byPercent/100;
        salary+=raise;
    }
}
