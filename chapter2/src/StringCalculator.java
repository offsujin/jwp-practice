import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String text) {
        if (isBlank(text)) {
            return 0;
        }

        if (text.contains("//")) {
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
            if (m.find()) {
                String customDelimiter = m.group(1);
                String[] tokens = m.group(2).split(customDelimiter);
            }
        }

        return sum(toInts(getSplit(text)));
    }

    private String[] getSplit(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }

        return text.split(",|:");
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = toPositive(values[i]);
        }
        return numbers;
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}