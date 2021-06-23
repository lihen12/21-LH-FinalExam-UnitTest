public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInteger = Integer.parseInt(number.trim());

                if (numberInteger < 0) {
                    throw new IllegalArgumentException("negatives not allowed.");
                } else if (numberInteger < 1000) {
                    returnValue += numberInteger;
                }
            }
        }

        return returnValue;
    }
}