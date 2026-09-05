package b4hive;

public class PrintVertical implements IPrintPattern {
    @Override
    public String printPattern(float values[], int significantFigures) {
        StringBuilder sb = new StringBuilder();
        for (float value : values) {
            sb.append(String.format("%." + significantFigures + "f", value)).append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
