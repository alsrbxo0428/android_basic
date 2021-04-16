package org.ict.fourbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button naver;
    Button call;
    Button gal;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        naver = (Button) findViewById(R.id.naverBtn);
        call = (Button) findViewById(R.id.callBtn);
        gal = (Button) findViewById(R.id.gallaryBtn);
        exit = (Button) findViewById(R.id.exitBtn);

        naver.setBackgroundColor(Color.rgb(45, 209, 53));
        naver.setTextColor(Color.BLACK);
        call.setBackgroundColor(Color.BLUE);
        gal.setBackgroundColor(Color.GRAY);
        exit.setBackgroundColor(Color.BLACK);
        exit.setTextColor(Color.WHITE);

        naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com/"));
                startActivity(mlntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mlntent);
            }
        });

        gal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mlntent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}