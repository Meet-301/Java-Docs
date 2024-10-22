package Program114;

import java.util.List;

public class TestingEmployee {
    public static void main(String[] args) {
        System.out.println("\nEmployee Testing\n");

        List<Employee> employees = List.of(new Employee("one", 78000),
        new Employee("two", 87000),new Employee("three", 810000));

        employees.stream().
        sorted((emp1,emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
        .forEach(System.out::println);
    }
}