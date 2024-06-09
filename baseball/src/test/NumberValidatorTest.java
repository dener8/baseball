package test;

import main.Number;
import main.NumberUnit;
import main.NumberValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberValidatorTest {

    @DisplayName("🖥️ 각 자리 모두 다른 숫자 (123) 생성 테스트")
    @Test
    void generateRightComputerNumber() {
        NumberValidator validator = new NumberValidator();
        Number computerNumber = new Number(new NumberUnit(1), new NumberUnit(2), new NumberUnit(3));
        Assertions.assertTrue(validator.validateComputerNumber(computerNumber));
    }

    @DisplayName("🖥️ 각 자리 모두 다르지 않은 숫자 (122) 생성 테스트")
    @Test
    void generateWrongComputerNumber() {
        NumberValidator validator = new NumberValidator();
        Number computerNumber = new Number(new NumberUnit(1), new NumberUnit(2), new NumberUnit(2));
        Assertions.assertFalse(validator.validateComputerNumber(computerNumber));
    }

    @DisplayName("🧑 각 자리 모두 다른 숫자 (456) 생성 테스트")
    @Test
    void generateRightPlayerNumber() {
        NumberValidator validator = new NumberValidator();
        Number playerNumber = new Number(new NumberUnit(4), new NumberUnit(5), new NumberUnit(6));
        Assertions.assertTrue(validator.validatePlayerNumber(playerNumber));
    }

    @DisplayName("🧑 자릿수 중복 숫자 (455) 생성 테스트")
    @Test
    void generateWrongPlayerNumber() {
        NumberValidator validator = new NumberValidator();
        Number playerNumber = new Number(new NumberUnit(4), new NumberUnit(5), new NumberUnit(5));
        Assertions.assertFalse(validator.validatePlayerNumber(playerNumber));
    }

    @DisplayName("🧑 세 자리가 아닌 숫자 (12) 생성 테스트")
    @Test
    void generateNotThreeDigitsNumber() {
        NumberValidator validator = new NumberValidator();
        Number playerNumber = new Number("12");
        Assertions.assertFalse(validator.validatePlayerNumber(playerNumber));
    }

    @DisplayName("🧑 숫자가 아닌 문자열 생성 테스트")
    @Test
    void generateNotNumber() {
        NumberValidator validator = new NumberValidator();
        Number playerNumber = new Number("안녕");
        Assertions.assertFalse(validator.validatePlayerNumber(playerNumber));
    }
}