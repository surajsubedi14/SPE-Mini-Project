package org.example.spe_calculater;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpeCalculaterApplicationTests {

    private final CalculatorController calculatorController = new CalculatorController();

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, calculatorController.squareRoot(4.0));
        assertEquals(0.0, calculatorController.squareRoot(0.0));
        assertThrows(IllegalArgumentException.class, () -> calculatorController.squareRoot(-4.0));
    }

    @Test
    public void testFactorial() {
        assertEquals(24, calculatorController.factorial(4));
        assertEquals(1, calculatorController.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> calculatorController.factorial(-4));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.0, calculatorController.naturalLogarithm(Math.E), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calculatorController.naturalLogarithm(0.0));
        assertThrows(IllegalArgumentException.class, () -> calculatorController.naturalLogarithm(-4.0));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculatorController.power(2.0, 3.0));
        assertEquals(1.0, calculatorController.power(5.0, 0.0));
        assertEquals(0.0, calculatorController.power(0.0, 5.0));
        assertEquals(1.0, calculatorController.power(0.0, 0.0));
    }

}
