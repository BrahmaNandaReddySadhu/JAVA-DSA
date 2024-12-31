package main.java.com.learning.oracleAcademy.JavaFoundationExerceise.HR;

public class Department {
    private String name;
    private Employee[] emps = new Employee[10];

    private int lastAddEmployeeIndex = -1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        if (lastAddEmployeeIndex < emps.length) {
            lastAddEmployeeIndex++;
            emps[lastAddEmployeeIndex] = employee;
        }
    }

    public Employee[] getEmployee() {
        Employee[] actualEmployee = new Employee[lastAddEmployeeIndex + 1];
        for (int i = 0; i < actualEmployee.length; i++) {
            actualEmployee[i] = emps[i];
        }
        return actualEmployee;
    }

    public int getEmployeeCount() {
        return lastAddEmployeeIndex + 1;
    }

    public Employee getEmployeeById(int id) {
        Employee result = null;
        for (Employee empValue : emps) {
            if ((empValue.getIdentificationNumber()) == id) {
                result = empValue;
                break;
            }
        }
        return result;
    }

    public Employee getEmployeeByIdOtherWay(int id) {
        if (emps == null) {
            System.out.println("No employees found.");
            return null;
        }
        for (Employee emp : emps) {
            if (emp == null) {
                continue; // Skip null elements in the list
            }
            if (emp.getIdentificationNumber() == id) {
                return emp; // Return the matching employee
            }
        }

        System.out.println("Employee with ID " + id + " not found.");
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i <= lastAddEmployeeIndex; i++) {
            totalSalary = totalSalary + emps[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (lastAddEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddEmployeeIndex + 1);
        }
        return 0.0;
    }

    public String toString() {
        return name;
    }


}
