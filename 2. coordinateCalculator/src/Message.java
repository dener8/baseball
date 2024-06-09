public enum Message {

    /*
    입력 오류
     */
    CONTAINS_WHITESPACE("공백 없이 입력해주세요."),

    ;

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }


}
