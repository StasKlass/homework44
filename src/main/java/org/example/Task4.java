package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");

        Optional<String> firstItemStartingWithC = items.stream()
                .filter(item -> item.startsWith("c"))
                .findFirst();

        firstItemStartingWithC.ifPresent(item -> System.out.println("Первый элемент, начинающийся на 'c': " + item));
    }
}
