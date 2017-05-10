package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view) {
        TextView oldText = (TextView)findViewById(R.id.helloText);
        EditText phrase = (EditText) findViewById(R.id.editText);
        String newText = phrase.getText().toString();
        oldText.setText(newText);
    }
}
