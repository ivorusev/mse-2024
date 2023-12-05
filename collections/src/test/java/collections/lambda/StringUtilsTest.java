package collections.lambda;

import com.mse.lambda.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    void testIsCapital() {
        String input = "Hello";
        boolean actual = StringUtils.isCapital(input);
        assertTrue(actual);
    }

    @Test
    void testIsCapitalWithNullString() {
        String input = null;
        boolean actual = StringUtils.isCapital(input);
        assertFalse(actual);
    }

    @Test
    void testIsCapitalWithLowerCase() {
        String input = "asd";
        boolean actual = StringUtils.isCapital(input);
        assertFalse(actual);
    }

}
