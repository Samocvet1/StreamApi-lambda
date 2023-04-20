package org.example.streamApi.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer numbers2 = numbers.stream().max(Integer::compareTo).get();
        System.out.println(numbers2);
    }
}
