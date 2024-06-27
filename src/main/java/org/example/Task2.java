package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> lowerCaseItems = items.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        lowerCaseItems.forEach(System.out::println);
    }
}
