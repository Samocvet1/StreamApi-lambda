package org.example.streamApi.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = numbers.stream().max(Integer::compareTo).stream().toList();
        System.out.println(numbers2);
    }
}
