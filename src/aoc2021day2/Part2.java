package aoc2021day2;

import java.util.ArrayList;

public class Part2 {
    ArrayList<String> input;

    public Part2(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        int horizontalPositon = 0;
        int depth = 0;
        int aim = 0;
        for (int i = 0; i < input.size(); i++) {
            String[] operationMagnitude = input.get(i).split(" ", 2);
            String operation = operationMagnitude[0];
            int magnitude = Integer.parseInt(operationMagnitude[1]);
            if (operation.equals("forward")) {
                horizontalPositon += magnitude;
                depth += aim * magnitude;
            } else if (operation.equals("down")) {
                aim += magnitude;
            } else if (operation.equals("up")) {
                aim -= magnitude;
            }
        }
        return horizontalPositon * depth;
    }
}
