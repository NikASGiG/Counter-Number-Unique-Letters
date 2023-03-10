package ua.foxminded.nikasgig.counternumberuniqueletters;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class FormatterTest {

    @Test
    public void formatter_whenGivenList_ReturnSuccessFormatString() {
        Formatter formatter = new Formatter();
        ArrayList<LetterData> list = new ArrayList<>();
        list.add(new LetterData('a', 2));
        list.add(new LetterData('b', 3));
        String expected = "\"a\" = 2\n\"b\" = 3";
        String actual = formatter.format(list);
        assertEquals(expected, actual);
    }
}