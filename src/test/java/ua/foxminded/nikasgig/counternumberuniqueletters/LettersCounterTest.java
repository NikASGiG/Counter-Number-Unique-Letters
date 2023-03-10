package ua.foxminded.nikasgig.counternumberuniqueletters;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class LettersCounterTest {

    @Test
    public void count_whenGivenStringWithDifferentLetters_ReturnSuccessList() {
        LettersCounter lettersCounter = new LettersCounter();
        ArrayList<LetterData> actual = lettersCounter.count("hello world!");
        ArrayList<LetterData> expected = new ArrayList<>();
        expected.add(new LetterData('h', 1));
        expected.add(new LetterData('e', 1));
        expected.add(new LetterData('l', 3));
        expected.add(new LetterData('o', 2));
        expected.add(new LetterData(' ', 1));
        expected.add(new LetterData('w', 1));
        expected.add(new LetterData('r', 1));
        expected.add(new LetterData('d', 1));
        expected.add(new LetterData('!', 1));
        assertEquals(expected, actual);
    }

    @Test
    public void count_whenGivenString_ReturnSuccessList() {
        LettersCounter lettersCounter = new LettersCounter();
        List<LetterData> expected = Arrays.asList(new LetterData('h', 1), new LetterData('i', 1));
        List<LetterData> actual = lettersCounter.count("hi");
        assertIterableEquals(expected, actual);
    }

    @Test
    public void count_whenGivenString_ReturnSuccessList2() {
        LettersCounter lettersCounter = new LettersCounter();
        List<LetterData> expected = Arrays.asList(new LetterData('h', 1), new LetterData('i', 1));
        List<LetterData> actual = lettersCounter.count("hi");
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).getLetter(), actual.get(i).getLetter());
            assertEquals(expected.get(i).getCounter(), actual.get(i).getCounter());
        }
    }
    
    @Test
    public void count_whenGivenStringWithSameLetters_ReturnSuccessList() {
        LettersCounter lettersCounter = new LettersCounter();
        ArrayList<LetterData> actual = lettersCounter.count("aaaaaaaaaa");
        ArrayList<LetterData> expected = new ArrayList<>();
        expected.add(new LetterData('a', 10));
        assertEquals(expected, actual);
    }
}
