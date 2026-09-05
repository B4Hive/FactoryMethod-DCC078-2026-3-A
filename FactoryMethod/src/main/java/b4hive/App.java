package b4hive;

public class App {
    public static void main(String[] args) {
        float[] values = {1.23456789f, 2.48163264f, 3.73737373f, 9.87654321f};
        System.out.println("Printing Vertical Pattern:");
        System.out.println(PrintFactory.printPattern(values, "Vertical", 4));

        System.out.println("Printing Horizontal Pattern");
        System.out.println(PrintFactory.printPattern(values, "Horizontal", 1));

        System.out.println("Printing Encased Pattern");
        System.out.println(PrintFactory.printPattern(values, "Encased", 2));
    }
}
