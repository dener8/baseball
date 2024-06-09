import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        InputValidator validator = new InputValidator();
        validator.validate(inputString);


    }
}

/*
calculator가 String을 입력 받고,
계산 외적인 행위는 다른 클래스가 분담하는 것이 좋을 듯.
0. 공백 삭제
1. 하이픈 split
2. 괄호 체크
3. 쉼표 체크
4. 좌표 범위 체크

다 체크한 후 좌표가 2~4개 일텐데, 이 좌표를 어떻게 세 분기로 나누어 저장해두지? 어떤 객체에?
List<Point>를 반환하면 좋겠다.


인터페이스를 사용해야 하면..
Calculator를 interface로 두고,
TriangleCalculator, RectangleCalculator 등으로 나눌까


 */