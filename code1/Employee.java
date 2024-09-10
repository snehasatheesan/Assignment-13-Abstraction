//1. Change Employee class as abstract and add abstract methods like calculatePay() with concrete methods like getEmployeeDetails(), etc.
    // Extend this abstract class in subclasses - HourlyEmployee and SalariedEmployee.
    // Allow the user to input details of employees and calculate their respective pay using the abstract class reference.


package abstraction;

public abstract class Employee {
    
    String name;
    String empId;
    Employee(String name,String empId){
        this.name=name;
        this.empId=empId;
    }
    abstract float calculatePay();
    void getEmployeeDetails(){
        System.out.println(" The Name is: "+name);
        System.out.println("Employee ID is: "+empId);
    }
}
