import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
    private StringCalculator cal;

    @Before
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    public void add_null_or_empty() {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add_one_digit() {
        assertEquals(1, cal.add("1"));
    }
}
