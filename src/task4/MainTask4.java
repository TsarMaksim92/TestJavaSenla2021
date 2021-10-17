package task4;

public class MainTask4 {

    private static final String[] ICO0 = {"*****", "*   *", "*   *", "*   *", "*****"};
    private static final String[] ICO1 = {"  *  ", " **  ", "* *  ", "  *  ", "*****"};
    private static final String[] ICO2 = {"*****", "    *", "  *  ", "*    ", "*****"};
    private static final String[] ICO3 = {"*****", "    *", " ****", "    *", "*****"};
    private static final String[] ICO4 = {"*   *", "*   *", "*****", "    *", "    *"};
    private static final String[] ICO5 = {"*****", "*    ", "*****", "    *", "*****"};
    private static final String[] ICO6 = {"*****", "*    ", "*****", "*   *", "*****"};
    private static final String[] ICO7 = {"*****", "    *", "   * ", "  *  ", " *   "};
    private static final String[] ICO8 = {"*****", "*   *", "*****", "*   *", "*****"};
    private static final String[] ICO9 = {"*****", "*   *", "*****", "    *", "*****"};

    public static void main(String[] args) {
        Integer num = 2021;
        System.out.println(num);
        String str = num.toString();
        System.out.println(str);
        for (int i = 0; i < 5; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (char c : str.toCharArray()) {
                switch (c) {
                    case '0':
                        stringBuffer.append(ICO0[i]);
                        break;
                    case '1':
                        stringBuffer.append(ICO1[i]);
                        break;
                    case '2':
                        stringBuffer.append(ICO2[i]);
                        break;
                    case '3':
                        stringBuffer.append(ICO3[i]);
                        break;
                    case '4':
                        stringBuffer.append(ICO4[i]);
                        break;
                    case '5':
                        stringBuffer.append(ICO5[i]);
                        break;
                    case '6':
                        stringBuffer.append(ICO6[i]);
                        break;
                    case '7':
                        stringBuffer.append(ICO7[i]);
                        break;
                    case '8':
                        stringBuffer.append(ICO8[i]);
                        break;
                    case '9':
                        stringBuffer.append(ICO9[i]);
                        break;
                }
                stringBuffer.append("  ");
            }
            System.out.println(stringBuffer);
        }
    }
}
