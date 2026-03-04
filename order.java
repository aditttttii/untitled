import java.util.*;
import java.util.stream.Collectors;
public class order{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 6, 8, 10, 1, 5, 3);
        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending: " + sortedDesc);
    }
}
