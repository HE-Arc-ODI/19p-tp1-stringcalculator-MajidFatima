import static java.util.Arrays.asList;

public class StringCalculator {
    private static int startIndex;
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if(s.contains(",")) {
            String[] tokens = s.split(",");
           int total = 0;
           for (String value : tokens){
               total += Integer.valueOf(value);
           }
            //return sum(tokens[0], tokens[1]);
            return total;
        }else
         {
             return parseToInt(s);
         }
    }

    public static int sum(String n1, String n2){
        return parseToInt(n1) + parseToInt(n2);
    }

    private static int parseToInt(String s) {
        return Integer.parseInt(s);
    }
}
