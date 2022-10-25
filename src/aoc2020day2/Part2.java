package aoc2020day2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {
    ArrayList<String> input;

    public Part2(ArrayList<String> input) {
        this.input = input;
    }

    public int solve() {
        int numValid = 0;
        Pattern pattern = Pattern.compile("^(\\d+)-(\\d+) ([A-Za-z]): ([a-z]+)$");
        for (String line : input) {
            boolean letterInFirstPos = false;
            boolean letterInSecondPos = false;
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                int firstPosition = Integer.parseInt(matcher.group(1));
                int secondPosition = Integer.parseInt(matcher.group(2));
                String letter = matcher.group(3);
                String password = matcher.group(4);
                for (int i = 0; i < password.length(); i++) {
                    boolean equalsLetter = Character.toString(password.charAt(i)).equals(letter);
                    if ((i + 1) == firstPosition) {
                        if (equalsLetter) {
                            letterInFirstPos = true;
                        }
                    }
                    if ((i + 1) == secondPosition) {
                        if (equalsLetter) {
                            letterInSecondPos = true;
                        }
                    }
                }
            }
            if (letterInFirstPos && letterInSecondPos) {

            } else if (letterInFirstPos) {
                numValid++;
            } else if (letterInSecondPos) {
                numValid++;
            }
        }
        return numValid;
    }
}
