package task1;

public class MainTask1 {

    private static final String STRING_WITH_NUMBER = "2 дровосека, 2 дроворуба, 2 дровокола.";
    private static final String STRING_WITHOUT_NUMBER = "И прыгают скороговорки, как караси на сковородке.";

    public static void main(String[] args) {
        System.out.println(ScanString.scanStringAndSumNumbers(STRING_WITH_NUMBER));
        System.out.println(ScanString.scanStringAndSumNumbers(STRING_WITHOUT_NUMBER));
    }
}
