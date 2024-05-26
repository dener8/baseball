# 숫자 야구게임

### 메인게임
- 야구게임
- 플레이어
- 컴퓨터

### 예외
- 숫자가 맞는지
- 숫자 세 자리 맞는지
- 0이 들어있는지
- 공백이 들어있는지

### 메모장
게임이 최초 시작됐을 때와 재시작했을 때를 구분해야 한다.

재시작시에 플레이어와 컴퓨터 모두 새로 생성자가 호출되어야 할까?
객체를 왜 또 생성해야하나??

컴퓨터 입장)
숫자만 가지고 있으면 된다.

플레이어 입장)
계속 입력되는 숫자 뿐만 아니라, 스트라이크, 볼 등의 일치 정보도 가지고 있어야 한다.

✅ 객체를 계속 생성하는 것이 옳은지, 필드 값만 바꿔주는 게 옳은지 생각해 볼 것

---

### 리팩토링
기존의 Player와 main.Computer 등 주체(?)의 메서드를 보면서, 해당 역할을 할 수 있는 클래스로 따로 분리하는 쪽으로 방향을 잡음 <br>
main.Player, main.Computer, main.Game 등을 없앨 필요는 없고, 이들을 도와주는 객체를 다양하게 만들어보기 <br>

- [x] main.Number
- [x] main.NumberUnit
- [ ] Strike
- [ ] Ball
- [x] main.NumberValidator
  - 자릿수 확인, 숫자 여부 확인 등 모두 클래스로 나누는 것이 좋나?
- [x] main.NumberMaker
- [ ] NumberInputManager 
- [x] GuideMessage
- [ ] ErrorMessage
- [x] main.Game
- [ ] GameJudge

---

### 다시 생각할 것
- NumberMaker가 있는데 왜 Number 생성자를 만들었지? 
- getter를 계속 쓰고 있다. 줄이는 방법 생각할 것
