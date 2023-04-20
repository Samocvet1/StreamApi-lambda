package org.example.streamApi.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex8 {
    public static void main(String[] args) {
        Predicate<String> pre = (s)->s.startsWith("A");
        System.out.println(pre.test("Audi"));
    }
}
