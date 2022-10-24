package aoc2020day2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
    private final ArrayList<String> input;

    public Part1(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        int numValid = 0;
        Pattern pattern = Pattern.compile("^(\\d+)-(\\d+) ([A-Za-z]): ([a-z]+)$");
        for (String line : input) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                int numChar = 0;
                int lowerBound = Integer.parseInt(matcher.group(1));
                int upperBound = Integer.parseInt(matcher.group(2));
                String letter = matcher.group(3);
                String password = matcher.group(4);
                for (int i = 0; i < password.length(); i++) {
                    if (Character.toString(password.charAt(i)).equals(letter)) {
                        numChar++;
                    }
                }
                if (numChar >= lowerBound && numChar <= upperBound) {
                    numValid++;
                }
            }
        }
        return numValid;
    }
}
