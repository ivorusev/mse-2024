package collections.lambda;

import com.mse.lambda.ArithmeticUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticUtilsTest {

    @Test
    void testSum() {
        int firstNumber = 1;
        int secondNumber = 2;
        int actual = ArithmeticUtils.sum(firstNumber, secondNumber);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
