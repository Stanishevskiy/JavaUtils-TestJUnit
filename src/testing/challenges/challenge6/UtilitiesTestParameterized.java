package testing.challenges.challenge6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import testing.challenges.Utilities;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities utilities;

    private final String inputStr;
    private final String outputStr;

    public UtilitiesTestParameterized(String inputStr, String outputStr) {
        this.inputStr = inputStr;
        this.outputStr = outputStr;
    }

    @Before
    public void setup() {
        utilities = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairs() {
        assertEquals(outputStr, utilities.removePairs(inputStr));
    }
}