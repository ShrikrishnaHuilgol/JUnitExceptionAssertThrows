import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExceptionTest {
    @Test
    public void throwException() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("abc");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void arithemeticException() {
        Exception exception = assertThrows(ArithmeticException.class, ()-> {
            int a=10/0;
        });
        String expectedMessage = "by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
