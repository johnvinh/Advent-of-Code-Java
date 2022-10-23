package aoc2020day1;

import java.util.ArrayList;

public class Part1 {
    ArrayList<String> input;

    public Part1(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (String inputLine : input) {
            numbers.add(Integer.parseInt(inputLine));
        }
        return 0;
    }
}
