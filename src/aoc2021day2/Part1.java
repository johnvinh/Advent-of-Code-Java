package aoc2021day2;

import java.util.ArrayList;

public class Part1 {
    private final ArrayList<String> input;

    public Part1(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        int horizontalPosition = 0;
        int depth = 0;
        for (int i = 0; i < input.size(); i++) {
            String[] operationMagnitude = input.get(i).split(" ", 2);
            String operation = operationMagnitude[0];
            int magnitude = Integer.parseInt(operationMagnitude[1]);
            if (operation.equals("forward")) {
                horizontalPosition += magnitude;
            } else if (operation.equals("down")) {
                depth += magnitude;
            } else if (operation.equals("up")) {
                depth -= magnitude;
            }
        }
        return horizontalPosition * depth;
    }
}
