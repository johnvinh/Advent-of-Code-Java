package aoc2019day1;

import java.util.ArrayList;

public class Part2 {
    ArrayList<String> input;

    public Part2(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        int totalFuel = 0;
        for (String line : input) {
            int moduleMass = Integer.parseInt(line);
            int fuel = (int) (Math.floor(moduleMass / 3.0) - 2);
            totalFuel += fuel;
            while (fuel >= 0) {
                fuel = (int) (Math.floor(fuel / 3.0) - 2);
                if (fuel <= 0) {
                    break;
                }
                totalFuel += fuel;
            }
        }
        return totalFuel;
    }
}
