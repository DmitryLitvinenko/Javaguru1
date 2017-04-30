package Gravitrips;


import java.util.Scanner;
import java.util.stream.IntStream;


public class Input {


    private int[] inputRange;

    public Input(int range) {
        this.inputRange = new int[range];
        for (int i = 0; i < inputRange.length; i++) {
            inputRange[i] = i;
        }
    }


    private int input;
    private boolean check;

    private Scanner sc = new Scanner(System.in);

    public int input() {
        do {
            input = sc.nextInt();
            check = IntStream.of(inputRange).anyMatch(x -> x == input);
        } while (!check);
        return input;
    }
}


