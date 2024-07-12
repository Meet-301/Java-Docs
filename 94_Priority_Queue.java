import java.util.Comparator;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
class StudentPriorityQueue {

    private static class Student {

        private String name, grade;

        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Grade: " + grade;
        }

    }

    public static void main(String args[]) {

        System.out.println("\nPriority Queue Implementation\n");

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGrade().compareTo(s2.getGrade());
            }

        });

        queue.offer(new Student("Meet", "B"));
        queue.offer(new Student("Viru", "A"));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}