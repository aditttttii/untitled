import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String group;
    private double gpa;

    public Student(String name, String group, double gpa) {
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return name + " (" + group + ", GPA=" + gpa + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        // Sample data
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 8, 10, 1);
        List<String> words = Arrays.asList("apple", "banana", "avocado", "pear", "apple");

        List<Student> students = Arrays.asList(
                new Student("Ali", "A1", 3.8),
                new Student("Sara", "A1", 3.2),
                new Student("John", "B1", 3.9),
                new Student("Lola", "B1", 2.8),
                new Student("Mike", "A1", 3.6)
        );

        // 1️⃣ Filter even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + evens);

        // 2️⃣ Convert strings to uppercase
        List<String> upper = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase: " + upper);

        // 3️⃣ Count strings starting with 'a'
        long countA = words.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.println("Start with 'a': " + countA);

        // 4️⃣ Sort numbers descending
        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Descending: " + sortedDesc);

        // 5️⃣ Find max and min
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        int min = numbers.stream().min(Integer::compare).orElseThrow();
        System.out.println("Max: " + max + ", Min: " + min);

        // 6️⃣ Remove duplicates
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Unique numbers: " + uniqueNumbers);

        // 7️⃣ Join strings with comma
        String joined = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);

        // 8️⃣ Group students by group
        Map<String, List<Student>> grouped = students.stream()
                .collect(Collectors.groupingBy(Student::getGroup));
        System.out.println("Grouped: " + grouped);

        // 9️⃣ Average GPA
        double avgGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0);
        System.out.println("Average GPA: " + avgGpa);

        // 🔟 First 3 students with GPA > 3.5
        List<Student> top3 = students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .limit(3)
                .toList();
        System.out.println("Top 3 students: " + top3);

        // 1️⃣1️⃣ Count students with GPA > 3.5
        long countHighGpa = students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .count();
        System.out.println("Students with GPA > 3.5: " + countHighGpa);
    }
}