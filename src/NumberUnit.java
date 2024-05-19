public class NumberUnit {
    private int value; // 숫자 하나 (한 자리)

    public NumberUnit(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
