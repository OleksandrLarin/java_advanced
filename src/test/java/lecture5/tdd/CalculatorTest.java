package lecture5.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new StringCalculator();

    @Test
    public void shouldCalculateSumOfTwoNumbers() {
        String stringToCalculate = "1,1";

        int actual = calculator.add(stringToCalculate);

        assertEquals(2, actual);
    }

    @Test
    public void shouldCalculateSumOfNumbers() {
        String stringToCalculate = "1,1,2,9";

        int actual = calculator.add(stringToCalculate);

        assertEquals(13, actual);
    }

    @Test
    public void shouldCalculateSumOfStringNumbersWithNewLineSeparator() {
        String separator = System.lineSeparator();
        String stringToCalculate = "10" + separator + "23" + separator + "7";

        int actual = calculator.add(stringToCalculate);

        assertEquals(40, actual);
    }

    @Test
    public void shouldCalculateSumOfStringNumbersWithDifferentSeparators() {
        String separator = System.lineSeparator();
        String stringToCalculate = "10" + separator + "23:7,14 6,9";

        int actual = calculator.add(stringToCalculate);

        assertEquals(69, actual);
    }

    @Test
    public void shouldThrowExceptionWhenStringHasNegativeNumber() {
        String expectedMessage = "Negative numbers are not allowed here. Value of: \\d";
        String stringToCalculate = "10,23:7,14 6,-9";

        String actualMessage = "";
        try {
            int actual = calculator.add(stringToCalculate);
        } catch (RuntimeException e) {
            actualMessage = e.getMessage();
        }
        assertEquals(String.format(expectedMessage, -9), actualMessage);
    }
}
