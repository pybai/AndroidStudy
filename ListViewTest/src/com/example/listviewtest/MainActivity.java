package com.example.listviewtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	private Button button1;
	private Button button2;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
        setContentView(R.layout.activity_main);
	}

	public void click1(){
		startActivity(new Intent(MainActivity.this, MyListView1.class));
	}
	
	public void click2(){
		startActivity(new Intent(MainActivity.this,MyListView2.class));
	}
    
}
