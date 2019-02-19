
public class StringCalculator {

    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if(s.contains(",")) {
            String[] tokens = s.split(",");
            return sum(tokens[0], tokens[1]);
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
