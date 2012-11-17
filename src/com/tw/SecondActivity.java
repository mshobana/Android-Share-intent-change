package com.tw;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.test.ActivityInstrumentationTestCase2;

public class SecondActivity extends Activity{


    private OnClickListener onClickListener=new OnClickListener() {

		@SuppressLint("NewApi")
		public void onClick(View v) {
			Intent intent=new Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI);
			startActivity(intent);

		}
	};

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView=(TextView)findViewById(R.id.txt1);
        String message=getIntent().getStringExtra("txt");
        textView.setText(message);
        textView.setOnClickListener(onClickListener);
    }

}

