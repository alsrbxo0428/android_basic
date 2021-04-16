package org.ict.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //onCreate 메서드 외부에 작성한 변수들은 해당 어플리케이션에서 사용할 부품임을 나타냄.
    // ctrl + space를 이용해 임포트해줘야 사용가능함.
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Res의 id 공간에 저장된 요소 중 button1 아이디를 연결
        button1  = (Button) findViewById(R.id.button1);

        //클릭시 발동할 이벤트를 아래와 같이 설정합니다.
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  "버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}