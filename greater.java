import java.util.*;
class Student7 {
    String name;
    double gpa;
    Student7(String name, double gpa) { this.name = name; this.gpa = gpa; }
    double getGpa() { return gpa; }
}
public class greater {
    public static void main(String[] args) {
        List<Student7> students7 = Arrays.asList(
                new Student7("Alina", 3.8),
                new Student7("Gulzar", 3.2),
                new Student7("Asan", 3.9),
                new Student7("Malika", 3.6)
        );
        long count = students7.stream()
                .filter(s -> s.getGpa() > 3.5)
                .count();
        System.out.println("Students with GPA > 3.5: " + count);
    }
}