import static java.util.Arrays.asList;

public class StringCalculator {
    private static int startIndex;
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if(s.contains(",")) {
            return sum(s.split(","));
        }else
         {
             return parseToInt(s);
         }
    }

    private static int sum(String[] tokens) {
        int total = 0;
        for (String value : tokens){
            total += Integer.valueOf(value);
        }
        return total;
    }

    private static int parseToInt(String s) {
        return Integer.parseInt(s);
    }
}
