package abstraction;

public class HourlyEmployee extends Employee{
    int hours;
    HourlyEmployee(String name,String empId,int hours){
        super(name,empId);
        this.hours=hours;
    }
   
    float calculatePay() {
       return 100*hours;
    }

    void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary: "+calculatePay());
    }
}
