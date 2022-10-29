package aoc2020day3;

import java.util.ArrayList;

public class Part1 {
    ArrayList<String> input;

    public Part1(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        final int LINE_LENGTH = 11;
        int numTrees = 0;
        int currentLinePosition = 0;
        for (String line : input) {
            int spacesTravelledRight = 0;
            if (currentLinePosition == LINE_LENGTH) {
                currentLinePosition = 0;
            }
            if (line.charAt(currentLinePosition) == '#') {
                numTrees++;
            }
            while (true) {
                currentLinePosition++;
                spacesTravelledRight++;
                if (spacesTravelledRight == 3) {
                    break;
                }
            }
        }
        return numTrees;
    }
}
