package abstraction;

public class SalaryEmployee extends Employee{
    int days;
    SalaryEmployee(String name,String empId,int days){
        super(name,empId);
        this.days=days;
    }
    float calculatePay() {
        return 10000*days;
    }
    void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary: "+calculatePay());
    }
}
