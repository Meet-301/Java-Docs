package Program79;

public class Employee {

    private String name;
    private int age;
    private long salary;

    Employee(String name, int age, long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("\nEmployee Added Successfully\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Empty name doesn't allowed!!!");
        } else {
            this.name = name;
            System.out.println("Name set successfully!!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age entered!!!");
        } else {
            this.age = age;
            System.out.println("Age set successfully!!");
        }
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        if (salary <= 0) {
            System.out.println("Invalid salary entered!!!");
        } else {
            this.salary = salary;
            System.out.println("Salary set successfully!!");
        }
    }

    void displayEmployeeDetails() {
        System.out.printf("\nEmployee's name is: %s and Age is: %d and Salary is: %d\n", 
        name, age, salary);
    }

}