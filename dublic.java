import java.util.*;
import java.util.stream.Collectors;
public class dublic {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 2, 8, 24, 3, 2, 17, 10, 3, 24);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
