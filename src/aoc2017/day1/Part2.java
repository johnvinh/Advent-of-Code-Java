package aoc2017.day1;

import java.util.ArrayList;

public class Part2 {
    ArrayList<String> input;


    public Part2(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        String line = input.get(0);
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            int length = line.length();
            char currentNumber = line.charAt(i);
            char nextNumber = line.charAt((i + (length / 2)) % line.length());
            if (currentNumber == nextNumber) {
                sum += Integer.parseInt(String.valueOf(currentNumber));
            }
        }
        return sum;
    }
}
