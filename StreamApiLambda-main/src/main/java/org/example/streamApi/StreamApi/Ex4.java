package org.example.streamApi.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean numbers2 = numbers.stream().noneMatch(n -> n==3);
        System.out.println(numbers2);
    }
}
