package task1;

public class ScanString {

    public static Integer scanStringAndSumNumbers(String str) {
        Integer sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
