package org.ict.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView result;
    Button plus, minus, mul, div;

    //숫자 10개의 배열은 모아서 저장할 수 있도록 리스트 처리
    Button[] numButtons = new Button[10];
    //아이디 값도 반복문에서 처리할 수 있도록 리스트로 저장
    Integer[] numBtnIds = {R.id.zero, R.id.one, R.id.two, R.id.three, R.id.four,
                            R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        result = (TextView) findViewById(R.id.result);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        //반복문으로 0~9번 버튼을 전부 연결
        for(int i = 0; i < numBtnIds.length; i++) {
            numButtons[i] = (Button) findViewById(numBtnIds[i]);
        }

        //0~9 버튼 클릭시 커서 위치에 해당 글자가 입력되도록 설정
        for(int i = 0; i < numBtnIds.length; i++) {
            final int index;    //명목상 넣어줄 int, 꼭 선언해서 사용해야함.
            //i변수를 익명클래스 내부에서 바로 호출하면 에러가 나서 index에 따로 옮겨놓고 사용함.
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String num1,  num2;
                    //EditText1인 et1에 커서가 있는 경우
                    if(et1.isFocused() == true) {
                        //기존에 있던 글자 + 클릭한 버튼의 글자를 합쳐서 num1에 저장한 다음
                        num1 = et1.getText().toString() + numButtons[index].getText().toString();
                        //et1에 합쳐진 글자로 갱신
                        et1.setText(num1);
                    } else if(et2.isFocused() == true) {
                        num2 = et2.getText().toString() + numButtons[index].getText().toString();
                        et2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(), "입력창을 선택해주세요.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    result.setText("" + (Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString())));
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력 가능합니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    result.setText("" + (Integer.parseInt(et1.getText().toString()) - Integer.parseInt(et2.getText().toString())));
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력 가능합니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    result.setText("" + (Integer.parseInt(et1.getText().toString()) * Integer.parseInt(et2.getText().toString())));
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력 가능합니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    result.setText("" + (Integer.parseInt(et1.getText().toString()) / Integer.parseInt(et2.getText().toString())));
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력 가능합니다.", Toast.LENGTH_SHORT).show();
                } catch (ArithmeticException ae) {
                    Toast.makeText(getApplicationContext(), "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}