package com.iancode.platzigram.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iancode.platzigram.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.home);

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(int tabId) {
                switch (tabId){
                    case R.id.home:
                        break;
                    case R.id.user:
                        break;
                    case R.id.search:
                        break;

                }
            }
        });
    }


}

