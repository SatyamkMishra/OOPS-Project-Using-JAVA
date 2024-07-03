import java.util.*;
abstract class Employee{
    private String name;
    private int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

   public abstract double claculateSalary();

   @Override

   public String toString(){
      return "Employee[Name " + name + ", id = " + id + ", salary = " + claculateSalary() + "]";
   }
}


class FulltimeEmployee extends Employee{
    private double monthlysalary;

    public FulltimeEmployee(String name, int id, double monthlysalary){
        super(name,id);
        this.monthlysalary = monthlysalary;
    }
    

    @Override

    public double claculateSalary(){
        return monthlysalary;
    }

}


class PartTimeEmployee extends Employee{


    private int hoursWorked;
    private double hoursRate;

    public PartTimeEmployee(String name,int id,int hoursWorked,double hoursRate){
        super(name,id);

        this.hoursRate = hoursRate;
        this.hoursWorked = hoursWorked;
    }

    @Override

    public double claculateSalary(){
        return hoursRate*hoursWorked;
    }
}


class PayRollSystem{
    private ArrayList<Employee> employeeList;

    public PayRollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmploy(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee e = null;
        for(Employee emp : employeeList){
            e = emp;
            break;
        }
        if(e != null){
            employeeList.remove(e);
        }
    }

    public void displayEmployees(){
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
    }

    
}

public class Employee_Payroll_System {
    public static void main(String[] args){

        PayRollSystem pr = new PayRollSystem();
        FulltimeEmployee emp1 = new FulltimeEmployee("Satyam", 1, 1299);
        PartTimeEmployee prt1 = new PartTimeEmployee("Shivam", 2, 10, 10);


        pr.addEmploy(emp1);
        pr.addEmploy(prt1);

        System.out.println("Intial Details : ");
        pr.displayEmployees();

        System.out.println("Removing Employees");
        pr.removeEmployee(2);

        System.out.println("Remaining Employee Deatils : ");
        pr.displayEmployees();
    }
}
