package org.ict.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button big, small;
    Button plus, minus, multi, divi, remain;
    TextView textView, result;
    int size = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        big = (Button) findViewById(R.id.big);
        small = (Button) findViewById(R.id.small);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multi = (Button) findViewById(R.id.multi);
        divi = (Button) findViewById(R.id.divi);
        remain = (Button) findViewById(R.id.remain);

        textView = (TextView) findViewById(R.id.textView);
        result = (TextView) findViewById(R.id.result);

        plus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                try {
                    switch (e.getAction()) {
                        default:
                            break;
                        case MotionEvent.ACTION_UP:
                            int Result = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                            result.setText(String.valueOf(Result));
                            break;
                    }
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력할 수 있습니다.", Toast.LENGTH_SHORT).show();
                    result.setText("");
                } finally {
                    return false;
                }
            }
        });

        minus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                try {
                    switch (e.getAction()) {
                        default: break;
                        case MotionEvent.ACTION_UP :
                            int Result = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
                            result.setText(String.valueOf(Result));
                            break;
                    }
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력할 수 있습니다.", Toast.LENGTH_SHORT).show();
                    result.setText("");
                } finally {
                    return false;
                }
            }
        });

        multi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                try {
                    switch (e.getAction()) {
                        default: break;
                        case MotionEvent.ACTION_UP :
                            int Result = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                            result.setText(String.valueOf(Result));
                            break;
                    }
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력할 수 있습니다.", Toast.LENGTH_SHORT).show();
                    result.setText("");
                } finally {
                    return false;
                }
            }
        });

        divi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                try {
                    switch (e.getAction()) {
                        default: break;
                        case MotionEvent.ACTION_UP :
                            int Result = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
                            result.setText(String.valueOf(Result));
                            break;
                    }
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력할 수 있습니다.", Toast.LENGTH_SHORT).show();
                    result.setText("");
                } catch (ArithmeticException ae) {
                    Toast.makeText(getApplicationContext(), "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    result.setText("");
                } finally {
                    return false;
                }
            }
        });

        remain.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                try {
                    switch (e.getAction()) {
                        default: break;
                        case MotionEvent.ACTION_UP :
                            int Result = Integer.parseInt(num1.getText().toString()) % Integer.parseInt(num2.getText().toString());
                            result.setText(String.valueOf(Result));
                            break;
                    }
                } catch (NumberFormatException ne) {
                    Toast.makeText(getApplicationContext(), "정수만 입력할 수 있습니다.", Toast.LENGTH_SHORT).show();
                    result.setText("");
                } catch (ArithmeticException ae) {
                    Toast.makeText(getApplicationContext(), "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    result.setText("");
                } finally {
                    return false;
                }
            }
        });

        big.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                switch (e.getAction()) {
                    default: break;
                    case MotionEvent.ACTION_UP :
                        if(size < 100){
                            size += 5;
                            num1.setTextSize(size);
                            num2.setTextSize(size);
                            big.setTextSize(size);
                            small.setTextSize(size);
                            plus.setTextSize(size);
                            minus.setTextSize(size);
                            multi.setTextSize(size);
                            divi.setTextSize(size);
                            remain.setTextSize(size);
                            textView.setTextSize(size);
                            result.setTextSize(size);
                        }
                        break;
                }

                return false;
            }
        });

        small.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                switch (e.getAction()) {
                    default: break;
                    case MotionEvent.ACTION_UP :
                        if (size > 10) {
                            size -= 5;
                            num1.setTextSize(size);
                            num2.setTextSize(size);
                            big.setTextSize(size);
                            small.setTextSize(size);
                            plus.setTextSize(size);
                            minus.setTextSize(size);
                            multi.setTextSize(size);
                            divi.setTextSize(size);
                            remain.setTextSize(size);
                            textView.setTextSize(size);
                            result.setTextSize(size);
                        }
                        break;
                }

                return false;
            }
        });

    }//onCreate
}//MainActivity