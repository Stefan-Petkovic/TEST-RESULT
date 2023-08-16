import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculator() {
        // Test cases
        String[] expressions = {
            "3 + 4",         
            "5 * 4 + 3",     
            "10 + 5 * (4 + 3)",  
            "16 / 2",        
            "5 / 0",         
            "abc + 2"        
        };
        
        String[] expectedResults = {
            "7.0",
            "23.0",
            "45.0",
            "8.0",
            "Infinity",
            "ERROR"
        };

        for (int i = 0; i < expressions.length; i++) {
            String result = Calculator.Run(expressions[i]);
            assertEquals(expectedResults[i], result);
        }
    }
}
