package aoc2021day3;

import java.util.ArrayList;
import java.util.HashMap;

public class Part1 {
    private final int BIT_COUNT;
    ArrayList<String> input;
    public Part1(ArrayList<String> input, int bitCount) {
        this.input = input;
        this.BIT_COUNT = bitCount;
    }

    private void addMoreCommonBit(HashMap<String, Integer> bit, StringBuilder binaryNumber) {
        if (bit.get("1") > bit.get("0")) {
            binaryNumber.append("1");
        } else {
            binaryNumber.append("0");
        }
    }

    private String invertBinaryNumber(String number) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                out.append('1');
            } else {
                out.append('0');
            }
        }
        return out.toString();
    }

    private void incrementBitCount(HashMap<String, Integer> bit, char binary) {
        if (binary == '1') {
            bit.put("1", bit.getOrDefault("1", 0) + 1);
        } else {
            bit.put("0", bit.getOrDefault("0", 0) + 1);
        }
    }

    public int convertToDecimal(String binaryString) {
        int sum = 0;
        int exponent = BIT_COUNT - 1;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                sum += Math.pow(2, exponent);
            }
            exponent--;
        }
        return sum;
    }

    public int solve() {
        int gammaRate = 0;
        int epsilonRate = 0;
        HashMap[] bits = new HashMap[BIT_COUNT];

        for (int i = 0; i < BIT_COUNT; i++) {
            bits[i] = new HashMap<String, Integer>();
        }
        // each line
        for (int i = 0; i < input.size(); i++) {
            // each character in line
            for (int j = 0; j < input.get(i).length(); j++) {
                incrementBitCount(bits[j], input.get(i).charAt(j));
            }
        }

        StringBuilder binaryNumberString = new StringBuilder();

        for (int i = 0; i < BIT_COUNT; i++) {
            addMoreCommonBit(bits[i], binaryNumberString);
        }

        String gammaRateStr = binaryNumberString.toString();
        String epsilonRateStr = invertBinaryNumber(gammaRateStr);
        System.out.println("Gamma Rate: " + gammaRateStr);
        System.out.println("Epsilon Rate: " + epsilonRateStr);
        gammaRate = convertToDecimal(gammaRateStr);
        epsilonRate = convertToDecimal(epsilonRateStr);

        return gammaRate * epsilonRate;
    }
}
