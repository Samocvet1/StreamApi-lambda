package org.example.streamApi.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
        List<Integer> numbers2 = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers2);
    }
}
