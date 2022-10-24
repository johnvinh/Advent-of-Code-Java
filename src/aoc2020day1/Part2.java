package aoc2020day1;

import java.util.ArrayList;

public class Part2 {
    ArrayList<String> input;

    public Part2(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < input.size(); i++) {
            numbers.add(Integer.parseInt(input.get(i)));
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                for (int k = j + 1; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 2020) {
                        return numbers.get(i) * numbers.get(j) * numbers.get(k);
                    }
                }
            }
        }
        return 0;
    }
}
