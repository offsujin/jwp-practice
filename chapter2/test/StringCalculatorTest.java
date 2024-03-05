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
    public void add_one_digit() throws Exception {
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_쉼표구분자() throws Exception {
        assertEquals(4, cal.add("1,3"));
    }

    @Test
    public void add_쉼표_or_콜론구분자() throws Exception {
        assertEquals(9, cal.add("1,3:5"));
    }

    @Test
    public void add_custom_구분자() throws Exception {
        assertEquals(8, cal.add("//;\n1;3;4"));
    }

    @Test(expected = RuntimeException.class)
    public void add_negative_number() throws Exception {
        cal.add("-1,2,5");
    }
}
