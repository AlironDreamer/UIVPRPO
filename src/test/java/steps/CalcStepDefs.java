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
        exception = null;
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
        } catch (Exception e) {
            exception = e;
        }
    }

    @When("I raise {double} to the power of {double}")
    public void i_raise_to_the_power_of(double a, double b) {
        result = calc.power(a, b);
    }

    @When("I take the square root of {double}")
    public void i_take_the_square_root_of(double a) {
        try {
            result = calc.sqrt(a);
        } catch (Exception e) {
            exception = e;
        }
    }

    @When("I get the absolute value of {double}")
    public void i_get_the_absolute_value_of(double a) {
        result = calc.abs(a);
    }

    @Then("the result should be {double}")
    public void the_result_should_be(double expected) {
        assertEquals(expected, result, 0.0001);
    }

    @Then("an exception should be thrown")
    public void an_exception_should_be_thrown() {
        assertNotNull(exception);
        assertTrue(exception instanceof ArithmeticException);
    }

    @Then("an error should be thrown")
    public void an_error_should_be_thrown() {
        assertNotNull(exception);
        assertTrue(exception instanceof ArithmeticException);
    }
}
