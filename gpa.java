import java.util.*;
class Student4 {
    String name;
    String group;
    double gpa;
    Student4(String name, String group, double gpa) {
        this.name = name; this.group = group; this.gpa = gpa;
    }
    double getGpa() { return gpa; }
}
public class gpa {
    public static void main(String[] args) {
        List<Student4> students4 = Arrays.asList(
                new Student4("Alina", "A1", 3.8),
                new Student4("Gulzar", "A1", 3.2),
                new Student4("Asan", "B1", 3.9)
        );
        double avgGpa = students4.stream()
                .mapToDouble(Student4::getGpa)
                .average()
                .orElse(0);
        System.out.println("Average GPA: " + avgGpa);
    }
}
