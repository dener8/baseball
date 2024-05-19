public class NumberValidator {

    public boolean validateComputerNumber(Number number) {
        return hasDifferentUnits(number);
    }

    public boolean validatePlayerNumber(Number number) {
        return isThreeDigits(number)
                && isNumber(number)
                && hasDifferentUnits(number);
    }

    private boolean isThreeDigits(Number number) {
        return number.toString().length() == 3;
    }

    private boolean isNumber(Number number) {
        try {
            Integer.parseInt(number.toString());
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    private boolean hasDifferentUnits(Number number) {
        return number.getHundreds() != number.getTens()
                && number.getTens() != number.getUnits()
                && number.getHundreds() != number.getUnits();
    }

}
