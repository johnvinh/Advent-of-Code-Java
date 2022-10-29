package aoc2019day1;

import java.util.ArrayList;

public class Part1 {
    private ArrayList<String> input;

    public Part1(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        int fuelSum = 0;
        for (String line : input) {
            int mass = Integer.parseInt(line);
            int fuel = (int) Math.floor(mass / 3.0) - 2;
            fuelSum += fuel;
        }
        return fuelSum;
    }
}
