package org.ict.bookingapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
//    Button start, stop;
    RadioGroup radio;
    RadioButton date, time;
    CalendarView calView;
    TimePicker timePick;

    TextView[] textViews = new TextView[5];
    Integer[] ids = {R.id.year, R.id.month, R.id.day, R.id.hour, R.id.minute};

    //시간 정보 저장용 변수 추가 선언
    int selectYear, selectMonth, selectDay, selectHour, selectMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chrono = (Chronometer) findViewById(R.id.chrono);
//        start = (Button) findViewById(R.id.start);
//        stop = (Button) findViewById(R.id.stop);
        radio = (RadioGroup) findViewById(R.id.radio);
        date = (RadioButton) findViewById(R.id.date);
        time = (RadioButton) findViewById(R.id.time);
        calView = (CalendarView) findViewById(R.id.calView);
        timePick = (TimePicker) findViewById(R.id.timePick);

        for(int i = 0; i < ids.length; i++) {
            textViews[i] = (TextView) findViewById(ids[i]);
        }

        radio.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);
        timePick.setVisibility(View.INVISIBLE);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePick.setVisibility(View.INVISIBLE);
                calView.setVisibility(View.VISIBLE);
            }
        });//dateOnClick

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calView.setVisibility(View.INVISIBLE);
                timePick.setVisibility(View.VISIBLE);
            }
        });//timeOnclick

//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                chrono.setBase(SystemClock.elapsedRealtime());
//                chrono.start();
//                chrono.setTextColor(Color.BLUE);
//            }
//        });//startOnClick
        chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.BLUE);
                radio.setVisibility(View.VISIBLE);
            }
        });

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
            //첫번째 파라미터는 연도, 두번째파라미터는 월(0월부터 시작), 세번째파라미터는 일 정보이다.
                selectYear = year;
                selectMonth = month + 1;
                selectDay = day;
            }
        });//calViewOnDateChange

        timePick.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                selectHour = hour;
                selectMinute = minute;
            }
        });//timePickOnTimeChange

//        stop.setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            @Override
//            public void onClick(View view) {
//                chrono.stop();
//                chrono.setTextColor(Color.RED);
//
//                textViews[0].setText(selectYear + "/");
//                textViews[1].setText(selectMonth + "/");
//                textViews[2].setText(selectDay + "\t");
//                textViews[3].setText(timePick.getHour() + ":");
//                textViews[4].setText(String.valueOf(timePick.getMinute()));
//            }
//        });//stopOnClick
        textViews[0].setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.RED);

                textViews[0].setText("예약일자 : " + selectYear + "/");
                textViews[1].setText(selectMonth + "/");
                textViews[2].setText(selectDay + "\t");
                textViews[3].setText(timePick.getHour() + ":");
                textViews[4].setText(String.valueOf(timePick.getMinute()));

                radio.setVisibility(View.INVISIBLE);
                calView.setVisibility(View.INVISIBLE);
                timePick.setVisibility(View.INVISIBLE);
            }
        });//textViewsOnClick


    }
}