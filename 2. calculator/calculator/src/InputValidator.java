public class InputValidator {

    boolean validate(String inputString) {
        containsWhitespace(inputString);


        return true;
    }

    private boolean containsWhitespace(String inputString) {
        for (char c : inputString.toCharArray()) {
            if (Character.isWhitespace(c)) {
                System.out.println("");
                return false;
            }
        }
        return true;
    }

}
