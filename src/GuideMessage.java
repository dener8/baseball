public enum GuideMessage {
    GAME_START("게임을 시작합니다. "),
    GAME_RESTART("게임을 재시작합니다."),
    GAME_EXIT("게임을 종료합니다."),
    ENTER_RESTART("재시작하려면 1을, 종료하려면 그 외 버튼을 눌러주세요."),
    NUMBER_ENTER("✅각 자리가 서로 다른 ✅세 자리 ✅숫자를 입력하세요."),
    NUMBER_INVALID("입력 제약 조건을 다시 한 번 확인해주세요."),

    RESULT_MESSAGE("%d 스트라이크, %d 볼입니다."),
    NOTHING("낫싱!"),

    ;

    private final String message;

    GuideMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }

    public String format(Object... args) {
        return String.format(message, args);
    }
}
