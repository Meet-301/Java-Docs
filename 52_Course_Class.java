class Course {
    String courseName;
    static int maxCapacity;
    int enrollments = 0;
    String[] enrolledStudents;

    @SuppressWarnings("static-access")
    Course(String courseName, int maxCapacity) {
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new String[maxCapacity];
    }

    void setMaxCapacity(int capacity) {
        String[] newEnrolledStudents = new String[capacity];
        System.arraycopy(enrolledStudents, 0, newEnrolledStudents, 0, enrollments);
        enrolledStudents = newEnrolledStudents;
        maxCapacity = capacity;
        System.out.println("Max capacity set successfully");
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            // Check if student already enrolled
            boolean found = false;
            for (int i = 0; i < enrollments; i++) {
                if (enrolledStudents[i].equals(studentName)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                enrolledStudents[enrollments] = studentName;
                enrollments++;
                System.out.println(studentName + " enrolled successfully in the course " + courseName);
            } else {
                System.out.println(studentName + " already enrolled in the course " + courseName);
            }
        } else {
            System.out.println("The course " + courseName + " is full. Cannot enroll " + studentName);
        }
    }

    void unenrollStudent(String studentName) {
        if (enrollments > 0) {
            int studentIndex = -1;
            // Find the student index
            for (int i = 0; i < enrollments; i++) {
                if (enrolledStudents[i].equals(studentName)) {
                    studentIndex = i;
                    break;
                }
            }
            if (studentIndex != -1) {
                System.out.println(studentName + " removed successfully from the course " + courseName);
                // Shift elements to remove the student
                for (int i = studentIndex; i < enrollments - 1; i++) {
                    enrolledStudents[i] = enrolledStudents[i + 1];
                }
                enrolledStudents[enrollments - 1] = null;
                enrollments--;
            } else {
                System.out.println(studentName + " not enrolled in the course " + courseName);
            }
        } else {
            System.out.println("No students enrolled in the course " + courseName);
        }
    }

    void getStudentsList() {
        if (enrollments > 0) {
            System.out.println("Students List");
            for (int i = 0; i < maxCapacity && enrolledStudents[i] != null; i++) {
                System.out.println(enrolledStudents[i]);
            }
        } else {
            System.out.println("No students enrolled in the course " + courseName);
        }
    }

    public static void main(String args[]) {
        Course mern = new Course("Mern Stack", 2);
        mern.enrollStudent("Meet");
        mern.enrollStudent("Kunj");
        mern.setMaxCapacity(3);
        mern.enrollStudent("Vir");
    }
}