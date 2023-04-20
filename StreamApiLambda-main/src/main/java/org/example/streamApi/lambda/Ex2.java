package org.example.streamApi.lambda;

public class Ex2 {
    public static void main(String[] args) {
        Operation operation;
        operation = (x,y)->x+y;

        int result = operation.calculate(20,50);
        System.out.println(result);
    }
}
interface Operation{
    int calculate(int x, int y);
}
