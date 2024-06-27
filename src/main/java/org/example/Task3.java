package org.example;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "ban", "cherry", "date");

        long count = items.stream()
                .filter(item -> item.length() > 3)
                .count();

        System.out.println("Количество строк длиннее трех символов: " + count);
    }
}
