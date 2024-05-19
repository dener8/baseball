public class Number {
    private String value;

    /*
     1. 생성자를 만들고 Game 내의 메서드에서 처리하기
     2. 생성자 없이 NumberMaker에서 바로 예외 던지기
     */
    public Number(String value) {
        this.value = value;
    }

    public Number(NumberUnit hundreds, NumberUnit tens, NumberUnit units) {
        value = String.valueOf(hundreds) + String.valueOf(tens) + String.valueOf(units);
    }

    public char getHundreds() {
        return value.charAt(0);
    }

    public char getTens() {
        return value.charAt(1);
    }

    public char getUnits() {
        return value.charAt(2);
    }

    public char getCharAt(int i) {
        return value.charAt(i);
    }

    public boolean contains(String s) {
        return value.contains(s);
    }

    @Override
    public String toString() {
        return value;
    }
}
