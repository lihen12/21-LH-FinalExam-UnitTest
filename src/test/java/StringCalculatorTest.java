import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private StringCalculator myString;

    @BeforeEach
    public void setUp() {
        myString = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void negativeNumbers() {
        Exception thrown = assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1,5"));

        assertTrue(thrown.getMessage().contains("negatives not allowed."));
    }

    @Test
    public void numbersGreaterThan1000() {
        assertEquals(1, StringCalculator.add("1,1000"));
    }
}
