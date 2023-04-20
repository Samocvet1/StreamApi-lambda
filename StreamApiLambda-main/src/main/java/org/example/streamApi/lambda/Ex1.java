package org.example.streamApi.lambda;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map((x) -> x*2).forEach(System.out::println);
    }
}
