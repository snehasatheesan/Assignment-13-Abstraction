package abstraction;


import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e;
        Scanner sc=new Scanner(System.in);
        //hourly employee
        System.out.println("Enter id, name and hours:");
        String name=sc.next();
        String id=sc.next();
        int hours=sc.nextInt();
        e=new HourlyEmployee(name,id,hours);
        e.getEmployeeDetails();

        //salaried employee
        System.out.println("Enter id, name and hours:");
        name=sc.next();
        id=sc.next();
        hours=sc.nextInt();
        e=new SalaryEmployee(name,id,hours);
        e.getEmployeeDetails();
    }
}
