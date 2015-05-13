package com.example.splash;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ReportdetailActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportdetail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_reportdetail, menu);
        return true;
    }
}
