import java.util.Objects;

class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name , person.name); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String args[]) {
        System.out.println("\nEquals() and Override() Demo\n");

        Person person1 = new Person("Meet", 20);
        Person person2 = new Person("Meet", 20);
        if (person1.equals(person2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}