import static java.lang.Integer.*;

public class StringCalculator {
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if(s.contains(",")) {
            String[] tokens = s.split(",");
            return parseInt(tokens[0]) + parseInt(tokens[1]);
        }else
         {
            return parseInt(s);
        }
    }
}
