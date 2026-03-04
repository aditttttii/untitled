import java.util.*;
import java.util.stream.Collectors;
public class uppercase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("programming", "calculus", "math");
        List<String> upper = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase: " + upper);
    }
}