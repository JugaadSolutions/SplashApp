package com.example.splash;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ConfigdetailActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configdetail);
    }
public void oncanclebutttonclick(View v)
{
	startActivity(new Intent(getApplicationContext(),AdminActivity.class));
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_configdetail, menu);
        return true;
    }
}
