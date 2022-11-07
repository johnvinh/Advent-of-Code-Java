package aoc2017.day1;

import java.util.ArrayList;

public class Part1 {
    ArrayList<String> input;

    public Part1(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            numbers.add(Integer.parseInt(input.get(i)));
        }
        return 0;
    }
}
