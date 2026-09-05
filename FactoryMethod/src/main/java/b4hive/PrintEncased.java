package b4hive;

public class PrintEncased implements IPrintPattern {
    @Override
    public String printPattern(float values[], int significantFigures) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (float value : values) {
            sb.append("[").append(String.format("%." + significantFigures + "f", value)).append("], ");
        }
        int start = sb.length() - 2;
        sb.replace(start, start + 2, "}");
        return sb.toString();
    }
}
