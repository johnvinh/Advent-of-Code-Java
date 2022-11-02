package aoc2019day2;

import java.util.ArrayList;

public class Part2 {
    ArrayList<String> input;

    public Part2(ArrayList<String> input) {
        this.input = input;
    }

    private int[] getNounAndVerb(ArrayList<Integer> numbers) {
        ArrayList<Integer> copy = new ArrayList<Integer>(numbers);

        for (int nounValue = 0; nounValue < 100; nounValue++) {
            for (int verbValue = 0; verbValue < 100; verbValue++) {
                numbers = new ArrayList<Integer>(copy);
                numbers.set(1, nounValue);
                numbers.set(2, verbValue);

                for (int i = 0; i < numbers.size(); i += 4) {

                    int opcode;
                    int position1;
                    int position2;
                    int outputPosition;
                    try {
                        opcode = numbers.get(i);
                        position1 = numbers.get(i + 1);
                        position2 = numbers.get(i + 2);
                        outputPosition = numbers.get(i + 3);
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }

                    int num1 = numbers.get(position1);
                    int num2 = numbers.get(position2);
                    switch (opcode) {
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

                if (numbers.get(0) == 19690720) {
                    return new int[]{nounValue, verbValue};
                }
            }
        }
        return new int[]{0, 0};
    }
    public int solve() {
        ArrayList<Integer> numbers = Part1.stringToIntArray(input.get(0));

        // Restore the program
        int[] results = getNounAndVerb(numbers);

        return 100 * results[0] + results[1];
    }
}
