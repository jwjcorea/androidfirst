package com.androidjava.app.androidfirst;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidfirstActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        TextView MyText = new TextView(this);
        MyText.setText("코드로 문자열 출력하기");
        setContentView(MyText);
    }
}