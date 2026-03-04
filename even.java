import java.util.*;
import java.util.stream.Collectors;

public class even {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 10, 22, 45, 77, 200, 2008, 1, 6);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }
}
