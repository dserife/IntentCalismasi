package com.example.intentcalismasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESAJ = " " ;

    EditText editText;
    Button butonGonder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =findViewById(R.id.editText);
        butonGonder=findViewById(R.id.butonGonder);


        butonGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(getApplicationContext(), SecondActivity.class);
                final String mesaj = editText.getText().toString();
                intent.putExtra(MESAJ,mesaj);
                startActivity(intent);
            }
        });
    }
}
