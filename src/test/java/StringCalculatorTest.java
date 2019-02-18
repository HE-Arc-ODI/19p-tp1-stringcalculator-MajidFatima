import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Before
    public void setup(){
    }

    @Test
    public void EmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
}
