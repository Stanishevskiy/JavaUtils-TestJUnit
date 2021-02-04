package testing.challenges.challenge2;

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
}