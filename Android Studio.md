# Android Studio

### 2021/04/13(안드로이드 스튜디오 수업 시작)

- 안드로이드 스튜디오 설치 및 프로젝트 생성

### 2021/04/14

- 안드로이드 스튜디오의 기본적인 개념
  - 앱의 디자인은 activity_main.xml에서 한다.<br>(디자인 방식이 HTML CSS와 비슷함.)
  - activity_main.xml에서 배치한 요소들의 기능은 MainActivity.java에서 작성한다.<br>(사용 언어는 코틀린 또는 자바를 사용)
  - activity_main.xml에서 작성하는 문자열(문장)은 Strings.xml에서 작성하는 것을 원칙으로 한다.<br>(위젯에 직접 android:text="STRING"와 같이 작성 가능.)
  - id를 생성할 때는 @+id/ID와 같은 형식으로 만든다.
  - 버튼에 기능을 부여할 때는 Button.setOnClickListener(new View.OnClickListener {})와 같은 형식으로 만들고 {}내부에 로직을 작성한다.
  - 앱을 종료시키는 메서드는 finish()이다.

### 2021/04/15

- EditText위젯에 입력한 값을 문자열로 가져오는 법 : editText.getText().toString();
  - 가져온 문자열을 set메서드로 위젯에 부여할 수 있음.
- 사칙연산+나머지 버튼으로 계산기 만들어보기
- 가시성 부여 visibility

### 2021/04/16

- 리니어 레이아웃 연습
  - orientation="vertical" & orientation="horizontal" 배치 연습

