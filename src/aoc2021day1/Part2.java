package aoc2021day1;

import java.util.ArrayList;

public class Part2 {
    private final ArrayList<String> input;

    public Part2(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        int previousSum = 0;
        int numGreater = 0;
        for (int i = 2; i < input.size(); i++) {
            int num1 = Integer.parseInt(input.get(i - 2));
            int num2 = Integer.parseInt(input.get(i - 1));
            int num3 = Integer.parseInt(input.get(i));
            if ((num1 + num2 + num3) > previousSum) {
                numGreater++;
            }
            previousSum = num1 + num2 + num3;
        }
        return numGreater - 1;
    }
}
