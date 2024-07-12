package Program79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Meet", 20, 50000);

        emp.displayEmployeeDetails();
        emp.setSalary(30000);
        emp.displayEmployeeDetails();
        System.out.println();
    }
}
