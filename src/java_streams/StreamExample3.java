package java_streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate sum of numbers
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("List of numbers: " + numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
