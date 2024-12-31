package main.java.com.learning.oracleAcademy.JavaFoundationExerceise.HR;

public class HR {
    public static void main(String[] args) {


        System.out.println("HR app start");

        Employee e1 = new Employee(10, "Sadhu", 100.00);
        Employee e2 = new Employee(11, "Brahma", 100.00);
        Employee e3 = new Employee(12, "Nanda", 100.00);

        Department department = new Department("Educaion Employee");
        department.addEmployee(e1);

        Employee[] e = department.getEmployee();
        for (Employee ee : e) {
            System.out.println("Employee ->" + ee);
        }
        System.out.println("Total Salary" + department.getTotalSalary());
        System.out.println("Avg Salary " + department.getAverageSalary());
        System.out.println("Number Of Employees " + department.getEmployeeCount());
        System.out.println("Employee by identification Number is " + department.getEmployeeByIdOtherWay(122));
    }
}
