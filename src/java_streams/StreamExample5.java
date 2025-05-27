package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "strawberry", "grape");

        // Filter strings longer than 5 characters and convert to lowercase
        List<String> result = words.stream()
                .filter(s -> s.length() > 5)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Original list: " + words);
        System.out.println("Result list (longer than 5 chars, lowercase): " + result);
    }
}
