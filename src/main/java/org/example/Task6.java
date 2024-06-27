package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);
    }
}
