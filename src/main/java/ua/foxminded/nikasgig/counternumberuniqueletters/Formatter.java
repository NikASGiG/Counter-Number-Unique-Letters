package ua.foxminded.nikasgig.counternumberuniqueletters;

import java.util.ArrayList;

public class Formatter {

    public String format(ArrayList<LetterData> list) {
        StringBuilder result = new StringBuilder();
        for (LetterData element : list) {
            result.append(element).append("\n");
        }
        return result.toString().trim();
    }

}
