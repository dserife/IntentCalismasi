package com.example.intentcalismasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String mesaj=intent.getStringExtra(MainActivity.MESAJ);

        textView=findViewById(R.id.textView);
        textView.setText(mesaj);
    }
}
