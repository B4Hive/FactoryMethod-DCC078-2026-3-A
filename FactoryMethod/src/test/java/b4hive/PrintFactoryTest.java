package b4hive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrintFactoryTest {
    @Test
    void testPrintPattern() {
        float[] values = {1.23456789f, 2.48163264f, 3.73737373f, 9.87654321f};
        String expectedOutputVertical = "1,2346\n2,4816\n3,7374\n9,8765";
        String actualOutputVertical = PrintFactory.printPattern(values, "Vertical", 4);
        assertEquals(expectedOutputVertical, actualOutputVertical);

        String expectedOutputHorizontal = "1,2 2,5 3,7 9,9";
        String actualOutputHorizontal = PrintFactory.printPattern(values, "Horizontal", 1);
        assertEquals(expectedOutputHorizontal, actualOutputHorizontal);

        String expectedOutputEncased = "{[1,23], [2,48], [3,74], [9,88]}";
        String actualOutputEncased = PrintFactory.printPattern(values, "Encased", 2);
        assertEquals(expectedOutputEncased, actualOutputEncased);

        String expectedOutputInvalid = "Invalid pattern type";
        String actualOutputInvalid = PrintFactory.printPattern(values, "Matrix", 2);
        assertEquals(expectedOutputInvalid, actualOutputInvalid);
    }
}
