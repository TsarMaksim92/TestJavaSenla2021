package task3;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainTask3 {

    static final char[] vowels = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};

    public static void main(String[] args) {
        String str = inputString();
        Map<Integer, StringBuffer> map = new TreeMap<>(Collections.reverseOrder());
        String[] strings = str.split("\\s+");
        for (String s : strings) {
            map.put(countVowels(s), getStringWithUpperVowel(s));
        }
        for (Map.Entry<Integer, StringBuffer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " гласные в слове - " + entry.getValue());
        }
    }

    private static Integer countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private static StringBuffer getStringWithUpperVowel(String s) {
        StringBuffer strBuffer = new StringBuffer();
        int flag = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (isVowel(c) && flag == 0) {
                strBuffer.append(Character.toUpperCase(c));
                flag = 1;
            } else {
                strBuffer.append(c);
            }
        }
        return strBuffer;
    }

    private static boolean isVowel(char c) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

    private static String inputString() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String str = scanner.next();
            return str;
        }
    }
}