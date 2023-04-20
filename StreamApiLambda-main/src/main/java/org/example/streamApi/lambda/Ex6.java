package org.example.streamApi.lambda;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate calculate;
        calculate = x-> x*x;
        System.out.println(calculate.calculate(scanner.nextInt()));
//        System.out.println(calculate.calculate(4));
    }
}
interface Calculate{
    int calculate(int x);
}