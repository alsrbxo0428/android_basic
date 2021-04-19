# Android Studio

### 2021/04/19

고급 위젯 : 날짜나 시간, 자동완성, 진행바 등이 있고, 여러 레이아웃이 탭처럼 처리되도록 만드는 뷰컨테이너 기능도 있다.

- 아날로그 시계, 디지털 시계
  - 시간은 UTC로 표시
- 크로노미터
  - 스톱워치와 같은 기능
  - `Chronometer.setBase(SystemClock.elapsedRealtime());`로 초기화해서 사용
- 타임피커
  - 스피너 모드와 클락 모드가 있다.
- 데이트피커
  - 스피너 모드와 캘린더 모드가 있다.
- 캘린더뷰
  - 데이트피커의 캘린더 모드와 비슷하다.

- 자동완성

  - `AutoCompleteTextView` : 자동완성
  - `MultiAutoCompleteTextView` : 멀티자동완성

- 프로그레스 바

- 스크롤 뷰

  - 내부에 하나의 요소만 가질 수 있기 때문에 보통 레이아웃을 집어넣고 레이아웃 내부에 위젯을 배치하는 식으로 사용

- 슬라이딩 드로어

  - handle과 content로 handle을 누르거나 위로 드래그하면 서랍처럼 열리고 내부에 content가 보이게된다.

    <!--삼성페이와 비슷함.-->

- 뷰 플리퍼

  - 여러 개의 위젯을 배치한 다음 필요에 따라 왼쪽, 오른쪽으로 밀어서 보이는 위젯을 선택하게 만드는 것.

    <!--갤러리와 비슷함.-->

- 탭 호스트
  - 상/하단의 탭을 터치하거나 클릭할 때마다 해당 탭에 해당하는 레이아웃만 화면에 표출한다.
  - TabHost는 TabActivity를 상속해야 구현가능하다.
  - `getTabHost()`로 얻어올 수 있다.
  - `newTabSpec()`, `setIndicator()`으로 탭 이름을 바꾼다.
  - `setContent()`으로 버튼과 연결해 탭1이 작동하도록한다.
  - `addTab()`으로 1번 버튼 정보를 탭호스트에 추가한다.
  - `setCurrentTab(0)`으로 탭 순서를 초기화한다.

### 2021/04/16

- 리니어 레이아웃
  - `orientation="vertical"` : 수직 배치
  - `orientation="horizontal"` : 수평 배치
  - `weight`를 사용해서 비율 조절
- 렐러티브 레이아웃
  - `centerInParent` : 부모 레이아웃의 중심에 배치.
  - `alignParent~~~` : 부모 레이아웃의 중심을 기준으로 어느 쪽에 배치할 것인가.<br><!--(Top, Bottom, Left, Right)-->
  - `center~~~` : 수직, 수평을 기준으로 중심에 배치<br><!--(Vertical, Horizontal)-->
  - `align~~~` : 기준 위젯을 기준으로 상, 중, 하단을 결정<br><!--(Top, Baseline, Bottom)-->
  - `to~~~Of` : 기준 위젯을 기준으로 상,하,좌,우를 결정<br><!--(above, below, Left, Right)-->
  - 기준 위젯을 여러 개가 될 수 있다.
- 테이블 레이아웃
  - `android:layout_height`, `android:layout_width`가 필수가 아니다.
  - `<TableRow>` : 행(가로줄)생성
  - `android:layout_span` : 행에서 몇 칸을 차지할지 지정
  - `android:layout_column` : 앞에 몇 열을 비울지 지정<br><!--(Bootstrap의 offset과 비슷함.)-->
- 테이블 레이아웃을 이용해서 계산기 만들기
  - 버튼의 Text값도 getText를 이용해서 가져올 수 있다.
- 그리드 레이아웃
  - `android:rowCount` : 열의 수 설정
  - `android:columnCount` : 행의 수를 설정
  - `android:layout_row` : 위젯의 열 위치 설정
  - `android:layout_column` : 위젯의 행 위치 설정
  - `android:layout_rowSpan` : 위젯이 몇 열을 차지할지 설정
  - `android:layout_columnSpan` : 위젯이 몇 행을 차지할지 설정
  - `android:layout_gravity="fill_~~~"` : horizontal 또는 vertical을 사용하여 해당 위젯으로 열의 수평, 행의 수직을 채운다.
- 프레임 레이아웃
  - 여러 뷰 프레임을 겹쳐서 보여준다.

### 2021/04/15

- EditText위젯에 입력한 값을 문자열로 가져오는 법 : `editText.getText().toString();`
  - 가져온 문자열을 set메서드로 위젯에 부여할 수 있음.
- 사칙연산+나머지 버튼으로 계산기 만들어보기
- 가시성 부여 visibility

### 2021/04/14

- 안드로이드 스튜디오의 기본적인 개념
  - 앱의 디자인은 activity_main.xml에서 한다.<br><!--(디자인 방식이 HTML CSS와 비슷함.)-->
  - activity_main.xml에서 배치한 요소들의 기능은 MainActivity.java에서 작성한다.<br><!--(사용 언어는 코틀린 또는 자바를 사용)-->
  - activity_main.xml에서 작성하는 문자열(문장)은 Strings.xml에서 작성하는 것을 원칙으로 한다.<br><!--(위젯에 직접 android:text="STRING"와 같이 작성 가능.)-->
  - id를 생성할 때는 @+id/ID와 같은 형식으로 만든다.
  - 버튼에 기능을 부여할 때는 `Button.setOnClickListener(new View.OnClickListener {})`와 같은 형식으로 만들고 {}내부에 로직을 작성한다.
  - 앱을 종료시키는 메서드는 `finish()`이다.

### 2021/04/13(안드로이드 스튜디오 수업 시작)

- 안드로이드 스튜디오 설치 및 프로젝트 생성