package b4hive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrintHorizontalTest {
    @Test
    void testPrintPattern() {
        float[] values = {1.23456789f, 2.48163264f, 3.73737373f, 9.87654321f};
        String expectedOutput = "1,2 2,5 3,7 9,9";
        String actualOutput = PrintFactory.printPattern(values, "Horizontal", 1);
        assertEquals(expectedOutput, actualOutput);
    }
}
