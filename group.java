import java.util.*;
import java.util.stream.Collectors;

class Student3 {
    private String name;
    private String group;
    private double gpa;

    public Student3(String name, String group, double gpa) {
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }

    public String getGroup() { return group; }
    @Override
    public String toString() { return name + " (" + group + ", GPA=" + gpa + ")"; }
}

public class group {
    public static void main(String[] args) {
        List<Student3> students3 = Arrays.asList(
                new Student3("Alina", "A1", 3.8),
                new Student3("Gulzar", "A1", 3.2),
                new Student3("Asan", "B1", 3.9)
        );

        Map<String, List<Student3>> grouped = students3.stream()
                .collect(Collectors.groupingBy(Student3::getGroup));
        System.out.println("Grouped: " + grouped);
    }
}
