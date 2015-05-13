package com.example.splash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread=new Thread(){
        	public void run(){
        		try{
        			sleep(2000);
        			startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
        			
        		}
        		catch(InterruptedException e){
        			e.printStackTrace();
        		}
        		
        	}
        	
        };
        thread.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash, menu);
        return true;
    }
}
