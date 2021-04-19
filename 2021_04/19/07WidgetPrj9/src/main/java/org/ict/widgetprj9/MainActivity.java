package org.ict.widgetprj9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    //버튼에 대해 변수를 생성
    Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰플리퍼 변수도 생성
        final ViewFlipper viewFlipper;

        //각 객체를 id값과 연결해주세요.
        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

        //이전으로 가기 버튼을 누를경우 이전페이지를 보여주도록 처리
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showPrevious();
            }
        });//btnPrevOnClick

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();
            }
        });//btnNextOnClick
    }
}//class