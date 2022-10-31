package aoc2019day2;

import java.util.ArrayList;

public class Part1 {
    ArrayList<String> input;

    public Part1(ArrayList<String> input) {
        this.input = input;
    }

    private ArrayList<Integer> stringToIntArray(String str) {
        String[] strSplit = str.split(",");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < strSplit.length; i++) {
            numbers.add(Integer.parseInt(strSplit[i]));
        }
        return numbers;
    }

    public int solve() {
        return 0;
    }
}
