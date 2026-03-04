import java.util.*;
import java.util.stream.Collectors;
class Student5 {
    String name;
    double gpa;
    Student5(String name, double gpa) { this.name = name; this.gpa = gpa; }
    double getGpa() { return gpa; }
    @Override
    public String toString() { return name + " (GPA=" + gpa + ")"; }
}
public class first {
    public static void main(String[] args) {
        List<Student5> students5 = Arrays.asList(
                new Student5("Alina", 3.8),
                new Student5("Gulzar", 3.2),
                new Student5("Asan", 3.9),
                new Student5("Malika", 3.6)
        );
        List<Student5> top3 = students5.stream()
                .filter(s -> s.getGpa() > 3.5)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3 students with GPA > 3.5: " + top3);
    }
}