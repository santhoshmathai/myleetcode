package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamExample4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 25);

        // Find maximum value
        OptionalInt maxNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

        if (maxNumber.isPresent()) {
            System.out.println("List of numbers: " + numbers);
            System.out.println("Maximum number: " + maxNumber.getAsInt());
        } else {
            System.out.println("List is empty.");
        }
    }
}
