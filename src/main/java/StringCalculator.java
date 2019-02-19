import java.util.Arrays;
import java.util.List;


public class StringCalculator {
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else  {
            List<String> numbers = delimiters(s);

            return (int) sum(numbers);
        }
    }

    private static List<String> delimiters(String s) {
        String newLine = "|\n";
        String delimiter = ",";
        if(s.matches("//(.*)\n(.*)")){
            delimiter = Character.toString(s.charAt(2));
            s = s.substring(4);
        }
        return Arrays.asList(s.split(delimiter + newLine));
    }

    private static int sum(List<String> tokens) {
        String negatives = "";
        for (String value : tokens){
            if(parseToInt(value) <  0 ){
                negatives+= ","+ value;
            }
        }
        if(negatives.length() > 0 ){
            throw new IllegalArgumentException("Negative number is not allowed : "+ negatives.substring(1));
        }
        int total = 0;
        for (String value : tokens){
            if(parseToInt(value) < 1000 ) {
                total += Integer.valueOf(value);
            }
        }

        return total;
    }


    private static int parseToInt(String s) {
        return Integer.parseInt(s);
    }
}
