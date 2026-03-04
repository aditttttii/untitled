import java.util.*;
public class specific {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ala-too", "drinks", "books", "alisa", "air");
        long countA = words.stream()
                .filter(s -> s.startsWith("a"))
                .count();
        System.out.println("Strings starting with 'a': " + countA);
    }
}
