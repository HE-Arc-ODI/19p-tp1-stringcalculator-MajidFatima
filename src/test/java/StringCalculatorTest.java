import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
    @Test
    public void AddLine(){
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void OtherDelimiters(){
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void ExceptionOnNegativesNumbers(){
        try {
            StringCalculator.add("-1,-2,3");
            fail("Exception");
        } catch (IllegalArgumentException e){
            assertEquals("Negative number is not allowed : -1, -2", e.getMessage());
        }
    }
}
