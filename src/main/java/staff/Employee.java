package staff;

import com.sun.istack.internal.NotNull;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        if (increment > 0){
        this.salary += increment;
        }
    }

    public double payBonus(){
        return salary*0.01;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }
}
