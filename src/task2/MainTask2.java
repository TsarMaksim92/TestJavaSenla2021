package task2;

import java.util.Scanner;

public class MainTask2 {

    public static void main(String[] args) {
        String str = inputString();
        if (isDigit(str)) {
            Integer num = Integer.parseInt(str);
            recurse(num, 2);
        }
    }

    public static void recurse(int n, int k) {
        if (k > n) return;
        if (n % k == 0) {
            System.out.print(k + " ");
            while (n % k == 0) {
                n = n / k;
            }
        }
        recurse(n, k + 1);
    }

    private static String inputString() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите целое число: ");
            String str = scanner.next();
            return str;
        }
    }

    private static boolean isDigit(String str) throws NumberFormatException {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("*** Введено не целое число! ***");
            return false;
        }
    }
}
