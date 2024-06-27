package org.example;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 2, 3, 4);

        boolean hasNegativeNumber = numbers.stream()
                .anyMatch(number -> number < 0);

        if (hasNegativeNumber) {
            System.out.println("Список содержит хотя бы одно отрицательное число.");
        } else {
            System.out.println("Список не содержит отрицательных чисел.");
        }
    }
}
