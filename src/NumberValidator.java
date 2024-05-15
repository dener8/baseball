public class NumberValidator {

    public boolean validateComputerNumber(String number) {
        return isDifferentNumbers(number);
    }

    public boolean validatePlayerNumber(String number) {
        return isThreeDigits(number)
                && isNumber(number)
                && isDifferentNumbers(number);
    }

    private boolean isThreeDigits(String number) {
        return number.length() == 3;
    }

    private boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isDifferentNumbers(String number) {
        return number.charAt(0) != number.charAt(1)
                && number.charAt(1) != number.charAt(2)
                && number.charAt(0) != number.charAt(2);
    }
}
