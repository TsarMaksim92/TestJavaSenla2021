package task5;

public class MainTask5 {

    static int[] values = new int[]{1000, 1500, 800, 700, 450};
    static int[] worth = new int[]{80, 40, 50, 10, 15};
    static int V = 200;

    public static void main(String[] args) {
        System.out.println(safe(values.length - 1, V));
    }

    private static int safe(int i, int V) {
        if (i < 0) {
            return 0;
        }
        if (worth[i] > V) {
            return safe(i - 1, V);
        } else {
            return Math.max(safe(i - 1, V), safe(i - 1, V - worth[i]) + values[i]);
        }
    }
}
