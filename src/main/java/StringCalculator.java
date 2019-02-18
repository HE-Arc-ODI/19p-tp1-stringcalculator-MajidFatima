public class StringCalculator {
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(s);
        }
    }
}
