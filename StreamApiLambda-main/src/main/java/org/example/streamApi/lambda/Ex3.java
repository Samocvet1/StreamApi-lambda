package org.example.streamApi.lambda;

public class Ex3 {
    public static void main(String[] args) {
        Exercise exercise;
        exercise = x->x>10;
        boolean result = exercise.TrueOrFalse(5);
        System.out.println(result);
    }
}
interface Exercise{
    boolean TrueOrFalse(int x);
}
