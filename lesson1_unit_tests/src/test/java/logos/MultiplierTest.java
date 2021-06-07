package logos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplierTest {

    private Multiplier multiplier;

    @BeforeEach
    public void test() {
        multiplier = new Multiplier();
    }

    //TODO: пофіксити
    @ParameterizedTest
    @CsvSource(value = {
            "1, 1, 2",
            "2, 1, 2",
            "3, 5, 15",
            "4, 2, 5",
            "1, 10, 10",
            "5, 5, 25",
    })
    public void testMultipleTwoNumbers(double firstNumber, double secondNumber, double expected) {
        double actual = multiplier.multiply(firstNumber, secondNumber);
        Assertions.assertEquals(expected, actual);
    }

    //TODO: пофіксити
    @ParameterizedTest
    @CsvSource(value = {
            "1, 1, 1, 2",
            "2, 1, 5, 10",
            "3, 5, 1, 15",
            "4, 2, 7, 50",
            "1, 10, 2, 10",
            "5, 5, 2, 45",
    })
    public void testMultipleThreeNumbers(double firstNumber, double secondNumber, double thirdNumber, double expected) {
        double actual = multiplier.multiply(firstNumber, secondNumber, thirdNumber);
        Assertions.assertEquals(expected, actual);
    }

    // TODO: Написати тест кейси для positiveMultiply (3 кейси) для випадку коли якесь з чисел або обидва є відємні
    @ParameterizedTest
    public void testPositiveMultiplyError() {

    }

    // TODO: Написати тест кейси для positiveMultiply (мінімум 5) для випадку коли два числа додатні
    @ParameterizedTest
    public void testPositiveMultiply() {

    }
}
