package org.example.streamApi.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        String joined = strings.stream().collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}
