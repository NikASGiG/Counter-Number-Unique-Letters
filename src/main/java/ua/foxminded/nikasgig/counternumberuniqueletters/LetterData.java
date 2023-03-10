package ua.foxminded.nikasgig.counternumberuniqueletters;

import java.util.Objects;

public class LetterData {

    private char letter;
    private int counter;

    public LetterData(char letter, int counter) {
        this.letter = letter;
        this.counter = counter;
    }

    public char getLetter() {
        return letter;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "\"" + letter + "\"" + " = " + counter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(counter, letter);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LetterData other = (LetterData) obj;
        return counter == other.counter && letter == other.letter;
    }

}
