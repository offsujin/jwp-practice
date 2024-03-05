public class StringCalculator {
    int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        if (text.contains(",")) {
            String[] values = text.split(",");
            int sum = 0;
            for (String v : values) {
                sum += Integer.parseInt(v);
            }
            return sum;
        }

        return Integer.parseInt(text);

    }
}