package org.example.streamApi.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble numbers2 = numbers.stream().mapToInt(n -> n).average();
        System.out.println(numbers2);
    }
}
