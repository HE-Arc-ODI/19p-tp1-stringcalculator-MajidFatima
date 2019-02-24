import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StringCalculator {

    private String delimiter;
    private String numbers;

    private StringCalculator(String delimiter, String numbers) {
        this.delimiter = delimiter;
        this.numbers = numbers;
    }
    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else  {
            if (s.startsWith("//")) {
                String[] head = s.split("\n", 2);
                String delimiter = head[0].substring(2);
                delimiter = getFirstDelimiter(delimiter);
                String delimitation = getCollect(delimiter);
                return new StringCalculator(delimitation, head[1]).sum();
            } else {
                List<String> numbers = delimiters(s);
                return (int) sum(numbers);
            }
        }

        }

    private static String getCollect(String delimiter) {
        return Stream.of(delimiter.split("]\\["))
                .map(Pattern::quote)
                .collect(Collectors.joining("|"));
    }

    private static String getFirstDelimiter(String delimiter) {
        if (delimiter.startsWith("[")) {
            delimiter = delimiter.substring(1, delimiter.length() - 1);
        }
        return delimiter;
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
        negatives = getString(tokens, negatives);
        throwIllegalArgumentOnNegativesNumbers(negatives);
        int total = 0;
        total = getTotal(tokens, total);

        return total;
    }

    private static void throwIllegalArgumentOnNegativesNumbers(String negatives) {
        if(negatives.length() > 0 ){
            throw new IllegalArgumentException("Negative number is not allowed : "+ negatives.substring(1));
        }
    }

    private static String getString(List<String> tokens, String negatives) {
        for (String value : tokens){
            if(parseToInt(value) <  0 ){
                negatives+= ","+ value;
            }
        }
        return negatives;
    }

    private static int getTotal(List<String> tokens, int total) {
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
    private IntStream getNumbers() {

            return Stream.of(numbers.split(delimiter))
                    .mapToInt(Integer::parseInt)
                    .map(n -> n % 1000);

    }

    private int sum() {
        return getNumbers().sum();
    }

}
