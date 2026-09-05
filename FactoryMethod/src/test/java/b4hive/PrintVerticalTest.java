package b4hive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrintVerticalTest {
    @Test
    void testPrintPattern() {
        float[] values = {1.23456789f, 2.48163264f, 3.73737373f, 9.87654321f};
        String expectedOutput = "1,2346\n2,4816\n3,7374\n9,8765";
        String actualOutput = PrintFactory.printPattern(values, "Vertical", 4);
        assertEquals(expectedOutput, actualOutput);
    }
}
