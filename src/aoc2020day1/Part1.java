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

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == 2020) {
                    num1 = numbers.get(i);
                    num2 = numbers.get(j);
                }
            }
        }

        return num1 * num2;
    }
}
