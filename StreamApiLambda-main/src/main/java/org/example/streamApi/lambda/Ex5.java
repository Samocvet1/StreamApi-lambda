package org.example.streamApi.lambda;

import java.util.function.Function;

public class Ex5 {
    public static void main(String[] args) {
        Function<String, Integer> function = (s)->s.length();
        System.out.println(function.apply("12345_789"));
    }
}
