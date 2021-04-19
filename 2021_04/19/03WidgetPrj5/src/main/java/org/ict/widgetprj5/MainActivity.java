package org.ict.widgetprj5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
//import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = {"가렌", "갈리오", "갱플랭크", "그라가스", "그레이브즈", "그웬"
                , "나르", "나미", "나서스", "노틸러스", "녹턴", "누누와 윌럼프", "니달리", "니코"
                , "다리우스", "다이애나", "드레이븐", "라이즈", "라칸", "람머스", "럭스", "럼블", "레넥톤"
                , "레오나", "렉사이", "렐", "쓰레쉬", "애니", "애니비아", "애쉬", "야스오"};

//        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.autoCompliteView1);
        MultiAutoCompleteTextView mulauto = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompliteView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);

        //콤마 단위로 구분지어 분류하기 위해 토크나이저 생성
        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();

//        auto.setAdapter(adapter);
        mulauto.setTokenizer(token);
        mulauto.setAdapter(adapter);
    }
}