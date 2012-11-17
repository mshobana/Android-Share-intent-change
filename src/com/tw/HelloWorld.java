package com.tw;

import android.R.string;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.test.ActivityInstrumentationTestCase2;

public class HelloWorld extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.main);
        
    }
    public void buttonClicked(View view)
    {
    	 Intent intent=new Intent(this, SecondActivity.class);
         TextView textView=(TextView)findViewById(R.id.txt);
         String message=textView.getText().toString(); 
         intent.putExtra("txt",message);
         startActivity(intent); 
    }

}
