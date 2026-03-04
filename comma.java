import java.util.*;
import java.util.stream.Collectors;

public class comma {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear");
        String joined = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);
    }
}
