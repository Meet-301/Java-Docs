package Program114;

import java.util.List;

public class TestingEmployee {
    public static void main(String[] args) {
        System.out.println("\nEmployee Testing\n");

        List<Employee> employees = List.of(new Employee("Meet", 78000),
        new Employee("Viraj", 87000),new Employee("K.C", 81000));

        employees.stream().
        sorted((emp1,emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
        .forEach(System.out::println);
    }
}