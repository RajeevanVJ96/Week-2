import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week2Test {

    TestingMethods tm = new TestingMethods();

    @Test
    public void FactTest(){
        assertEquals("120=5!", tm.reverseFactorial(120));
        assertEquals("150 NONE", tm.reverseFactorial(150));
    }
    @Test
    public void percTaxAmountTest(){
        assertEquals(20,tm.percTaxAmount(31150));
        assertEquals(15,tm.percTaxAmount(20000));
    }
    @Test
    public void exactTaxAmountTest(){
        assertEquals((2999),tm.taxExactAmount(29999),1);
    }



}
