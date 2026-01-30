import org.junit.Test;
import static org.junit.Assert.*;
import dam.optativa.DiscountCalculator;

public class DiscountCalculatorTest {
    
}

public class DiscountCalculatorTest {
    
    private DiscountCalculator calculator = new DiscountCalculator();
    
    @Test
    public void testNegativePriceStudent() {
        double result = calculator.calcular(-100, true);
        assertEquals(-80, result, 0.01);
    }
    
    @Test
    public void testNegativePriceNonStudent() {
        double result = calculator.calcular(-100, false);
        assertEquals(-95, result, 0.01);
    }
    
    @Test
    public void testPositivePrice() {
        double result = calculator.calcular(100, true);
        assertEquals(0, result, 0.01);
    }
    
    @Test
    public void testZeroPrice() {
        double result = calculator.calcular(0, true);
        assertEquals(0, result, 0.01);
    }
    
    @Test
    public void testNegativePriceDecimalStudent() {
        double result = calculator.calcular(-50.5, true);
        assertEquals(-40.4, result, 0.01);
    }
    
    @Test
    public void testNegativePriceDecimalNonStudent() {
        double result = calculator.calcular(-50.5, false);
        assertEquals(-47.975, result, 0.01);
    }
}
