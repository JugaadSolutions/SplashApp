package com.example.splash;

import com.example.splash.R.id;


import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdminActivity extends Activity {
	ListView list;

	//creating list of items
	 String[] myList ={
			 "configuration",
			 "customers",
			 "report",
			 "admin users"
			 
			 };
	 Integer[] imgid={
			 R.drawable.splash,
			 R.drawable.splash,
			 R.drawable.splash,
			 R.drawable.splash,
			
	 };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        
        
    CustomListAdapter adapter=new CustomListAdapter(this, myList,imgid);
    list=(ListView)findViewById(R.id.listView1);
    list.setAdapter(adapter);
    
    list.setOnItemClickListener(new OnItemClickListener()
    {
    
    	public void onItemClick(AdapterView<?> adapter,View v,int position,long id)
    	{
    		switch(position)
    		{
    		case 0:
    			startActivity(new Intent(getApplicationContext(),ConfigdetailActivity.class));
    			break;
    		case 1:
    			startActivity(new Intent(getApplicationContext(),CustomerdetailActivity.class));
    			break;
    		case 2:
    			startActivity(new Intent(getApplicationContext(), ReportdetailActivity.class));
    			break;
    		case 3:
    			startActivity(new Intent(getApplicationContext(),UsersActivity.class));
    			break;
    		}
    	}
    
    });
    }
    
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_admin, menu);
        return true;
    }
}
