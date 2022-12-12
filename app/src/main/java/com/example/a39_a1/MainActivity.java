package com.example.a39_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Table Printer");
        button1 = findViewById(R.id.button1);
    }
    public void SetValue(View view){
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        Button clickedButton = (Button) view;
        String value = String.valueOf(clickedButton.getText());
        int number = Integer.parseInt(value);
        i.putExtra("Number", number);
        startActivity(i);
    }

}