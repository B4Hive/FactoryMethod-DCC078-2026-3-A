package b4hive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrintEncasedTest {
    @Test
    void testPrintPattern() {
        float[] values = {1.23456789f, 2.48163264f, 3.73737373f, 9.87654321f};
        String expectedOutput = "{[1,23], [2,48], [3,74], [9,88]}";
        String actualOutput = PrintFactory.printPattern(values, "Encased", 2);
        assertEquals(expectedOutput, actualOutput);
    }
}
