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
    @Test
    public void OneString() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void TwoString(){
        assertEquals(3, StringCalculator.add("1,2"));
    }
    @Test
    public void SumString(){
        assertEquals(6, StringCalculator.add("1,2,3"));
    }
}
