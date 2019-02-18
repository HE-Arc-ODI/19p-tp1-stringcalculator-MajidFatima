public class StringCalculator {
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if(s.contains(",")) {
            String[] tokens = s.split(",");
            return Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
        }else
         {
            return Integer.parseInt(s);
        }
    }
}
