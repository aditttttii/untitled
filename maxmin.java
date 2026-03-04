import java.util.*;
public class maxmin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 6, 2, 8, 24, 3, 17, 10);
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        int min = numbers.stream().min(Integer::compare).orElseThrow();
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
