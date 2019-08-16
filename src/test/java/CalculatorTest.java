import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(7,calculator.add(3,4));
    }
}
