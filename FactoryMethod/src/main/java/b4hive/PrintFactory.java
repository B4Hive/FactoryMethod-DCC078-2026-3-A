package b4hive;

public class PrintFactory {
    @SuppressWarnings("deprecation")
    public static String printPattern(float values[], String patternType, int significantFigures) {
        @SuppressWarnings("rawtypes")
        Class cla = null;
        Object obj = null;
        try {
            cla = Class.forName("b4hive.Print" + patternType);
            obj = cla.newInstance();
        } catch (Exception e) {
            return "Invalid pattern type";
        }
        if (obj instanceof IPrintPattern) {
            IPrintPattern pattern = (IPrintPattern) obj;
            return pattern.printPattern(values, significantFigures);
        }
        return null;
    }
}
