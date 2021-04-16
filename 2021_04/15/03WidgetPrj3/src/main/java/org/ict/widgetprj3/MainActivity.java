package org.ict.widgetprj3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv3;
    CheckBox chk;
    Button select;
    RadioGroup pet;
    RadioButton lion, tiger, sq;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk = (CheckBox) findViewById(R.id.checkBox);
        pet = (RadioGroup) findViewById(R.id.pet);
        lion = (RadioButton) findViewById(R.id.lion);
        tiger = (RadioButton) findViewById(R.id.tiger);
        sq = (RadioButton) findViewById(R.id.sq);
        tv3 = (TextView) findViewById(R.id.textView3);
        select = (Button) findViewById(R.id.select);
        img = (ImageView) findViewById(R.id.img);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isChecked = chk.isChecked();

                if(isChecked) {
                    tv3.setVisibility(View.VISIBLE);
                    select.setVisibility(View.VISIBLE);
                    pet.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                } else {
                    tv3.setVisibility(View.INVISIBLE);
                    select.setVisibility(View.INVISIBLE);
                    pet.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = pet.getCheckedRadioButtonId();

                if(id == R.id.lion) {
                    img.setImageResource(R.drawable.lion);
                } else if(id == R.id.tiger) {
                    img.setImageResource(R.drawable.tiger);
                } else if(id == R.id.sq) {
                    img.setImageResource(R.drawable.sq);
                }
            }
        });
    }
}