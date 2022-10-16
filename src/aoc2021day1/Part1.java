package aoc2021day1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Part1 {
    private final ArrayList<String> lines;

    public Part1(ArrayList<String> lines) {
        this.lines = lines;
    }

    public int solve() {
        int numIncreases = 0;
        for (int i = 1; i < lines.size(); i++) {
            if (Integer.parseInt(lines.get(i)) > Integer.parseInt(lines.get(i - 1))) {
                numIncreases++;
            }
        }
        return numIncreases;
    }
}
