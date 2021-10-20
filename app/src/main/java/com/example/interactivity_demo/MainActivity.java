package com.example.interactivity_demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void myClick(View view){
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        Log.i( " Info", "Hurrayyy!!");
        Log.i("Info",nameEditText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}