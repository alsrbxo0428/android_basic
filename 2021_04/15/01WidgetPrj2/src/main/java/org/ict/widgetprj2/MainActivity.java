package org.ict.widgetprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button btn;
    TextView information;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.edit_test);
        btn = (Button) findViewById(R.id.get_value_btn);
        information = (TextView) findViewById(R.id.information);
        result = (TextView) findViewById(R.id.result);

        //btn을 클릭했을때 edit에 있던 값을 result의 text값으로 반영해줘야함.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Result = edit.getText().toString();
                result.setText(Result);
//                edit.setText("");
            }
        });
    }
}