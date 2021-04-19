package org.ict.widgetprj10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

//TabActivity를 상속해서 MainActivity를 구현해야 TabHost 구현이 가능함.
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TabHost는 getTabHost()로 얻어와야한다.
        TabHost tabHost = getTabHost();

        //TabSpec을 이용해서 탭 이름을 바꿔줄 수 있다.
        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("Song").setIndicator("음악별");
        //버튼과 연결해 탭1이 작동하도록 마무리
        tabSpecSong.setContent(R.id.tabSong);
        //1번 버튼 정보를 탭호스트에 추가하기
        tabHost.addTab(tabSpecSong);

        //하단에 음악별 말고도 가수별, 앨범별을 추가해주세요.
        TabHost.TabSpec tabSpecSinger = tabHost.newTabSpec("Singer").setIndicator("가수별");
        tabSpecSinger.setContent(R.id.tabSinger);
        tabHost.addTab(tabSpecSinger);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("Album").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

        //탭 순서 초기화
        tabHost.setCurrentTab(0);
    }
}