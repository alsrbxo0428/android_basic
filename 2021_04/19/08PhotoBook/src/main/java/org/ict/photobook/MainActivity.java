package org.ict.photobook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button prev, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewFlipper viewF;

        prev = (Button) findViewById(R.id.prev);
        next = (Button) findViewById(R.id.next);

        viewF = (ViewFlipper) findViewById(R.id.viewF);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewF.showPrevious();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewF.showNext();
            }
        });
    }
}