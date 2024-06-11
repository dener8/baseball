package main.view;

public enum Message {

    /*
    입력 오류
     */
    USER_INPUT("좌표를 입력해주세요."),
    OUT_OF_RANGE_INPUT("0 이상 24 이하로 입력해주세요."),
    RESULT_VALUE("정답: %.4f"),
    INVALID_INPUT("옳지 않은 입력 형식입니다."),


    ;

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }

    public String format(Object... args) {
        return String.format(message, args);
    }

}
