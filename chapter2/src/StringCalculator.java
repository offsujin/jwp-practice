public class StringCalculator {
    int add(String text) {
        if (isBlank(text)) {
            return 0;
        }

        return sum(toInts(getSplit(text)));
    }

    private String[] getSplit(String text) {
        return text.split(",");
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}