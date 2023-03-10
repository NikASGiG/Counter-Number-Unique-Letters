package ua.foxminded.nikasgig.counternumberuniqueletters;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class LettersCounter {

    public ArrayList<LetterData> count(String line) {
        LinkedHashMap<Character, Integer> letterCounts = new LinkedHashMap<>();
        for (char c : line.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }
        ArrayList<LetterData> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            result.add(new LetterData(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}
