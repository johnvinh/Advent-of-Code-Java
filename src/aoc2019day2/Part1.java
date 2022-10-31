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
        ArrayList<Integer> numbers = stringToIntArray(input.get(0));
        // Restore the program
        numbers.set(1, 12);
        numbers.set(2, 2);

        for (int i = 0; i < numbers.size(); i += 4) {
            int instruction;
            int position1;
            int position2;
            int outputPosition;
            try {
                instruction = numbers.get(i);
                position1 = numbers.get(i + 1);
                position2 = numbers.get(i + 2);
                outputPosition = numbers.get(i + 3);
            } catch (IndexOutOfBoundsException e) {
                break;
            }

            int num1 = numbers.get(position1);
            int num2 = numbers.get(position2);
            switch (instruction) {
                case 1:
                    numbers.set(outputPosition, num1 + num2);
                    break;
                case 2:
                    numbers.set(outputPosition, num1 * num2);
                    break;
                case 99:
                    break;
            }
        }
        return numbers.get(0);
    }
}
