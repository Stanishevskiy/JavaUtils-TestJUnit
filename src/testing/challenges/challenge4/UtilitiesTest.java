package testing.challenges.challenge4;

import org.junit.Before;
import org.junit.Test;
import testing.challenges.Utilities;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @Before
    public void setup() {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar_lessQuantity() {
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
    }

    @Test
    public void everyNthChar_moreQuantity() {
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output);
    }

    @Test
    public void removePairs_ordered() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
    }

    @Test
    public void removePairs_unordered() {
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
    }

    @Test
    public void removePairs_nullInput() {
        assertNull("Null not handled by removePairs()", utilities.removePairs(null));
    }

    @Test
    public void removePairs_emptyInput() {
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    public void removePairs_singleChar() {
        assertEquals("A", utilities.removePairs("A"));
    }

    @Test
    public void nullIfOddLength_checkNull() {
        assertNull(utilities.nullIfOddLength("odd"));
    }

    @Test
    public void nullIfOddLength_checkNotNull() {
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}