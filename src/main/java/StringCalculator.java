import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else  {
            String delimiter = ",";
            String newLine = "|\n";
            if(s.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(s.charAt(2));
                s = s.substring(4);
            }
            List<String> numbers = Arrays.asList(s.split(delimiter + newLine));
            return (int) sum(numbers);
        }
    }
    
    private static int sum(List<String> tokens) {
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
