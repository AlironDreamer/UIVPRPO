package steps;

import io.cucumber.java.en.*;
import org.calc.Calc;

import static org.junit.jupiter.api.Assertions.*;

public class CalcStepDefs {
    private Calc calc;
    private double result;
    private Exception exception;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calc = new Calc();
    }

    @When("I add {double} and {double}")
    public void i_add(double a, double b) {
        result = calc.add(a, b);
    }

    @When("I subtract {double} from {double}")
    public void i_subtract(double b, double a) {
        result = calc.subtract(a, b);
    }

    @When("I multiply {double} and {double}")
    public void i_multiply(double a, double b) {
        result = calc.multiply(a, b);
    }

    @When("I divide {double} by {double}")
    public void i_divide(double a, double b) {
        try {
            result = calc.divide(a, b);
            exception = null;
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("the result should be {double}")
    public void the_result_should_be(double expected) {
        assertEquals(expected, result, 0.0001);
    }

    @Then("an error should be thrown")
    public void an_error_should_be_thrown() {
        assertNotNull(exception);
        assertTrue(exception instanceof ArithmeticException);
    }
}
