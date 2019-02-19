public class StringCalculator {

    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if(s.contains(",")) {
            String[] tokens = s.split(",");
            return parseToInt(tokens[0]) + parseToInt(tokens[1]);
        }else
         {
             return parseToInt(s); 
         }
    }

    private static int parseToInt(String s) {
        return Integer.parseInt(s);
    }
}
