package dam.optativa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiscountCalculatorTest {
    
    @Test
    public void testCalcularWithNegativePrice() {
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(0, calculator.calcular(-10, false), 0);
    }
    
    @Test
    public void testCalcularWithZeroPrice() {
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(0, calculator.calcular(0, false), 0);
    }
    
    @Test
    public void testCalcularStudentDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(80, calculator.calcular(100, true), 0);
    }
    
    @Test
    public void testCalcularRegularDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(95, calculator.calcular(100, false), 0);
    }
    
    @Test
    public void testCalcularStudentDiscountWithDecimal() {
        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(16.4, calculator.calcular(20.5, true), 0.1);
    }
}
