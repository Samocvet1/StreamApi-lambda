package org.example.streamApi.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = numbers.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(numbers2);
    }
}
