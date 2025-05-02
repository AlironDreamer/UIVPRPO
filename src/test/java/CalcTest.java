import org.calc.Calc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    Calc calc = new Calc();

    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2.0, 3.0));
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(4.0, 3.0));
    }

    @Test
    void testMultiply() {
        assertEquals(12.0, calc.multiply(4.0, 3.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(4.0, 2.0));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1.0, 0.0));
    }
}
