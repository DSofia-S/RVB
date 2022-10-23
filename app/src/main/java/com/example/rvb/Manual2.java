package com.example.rvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manual2 extends AppCompatActivity {
    Button Image;
    Button Image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual2);
        Image = (Button) findViewById(R.id.button19);
        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Manual2.this, Manual_de_Uso.class);
                startActivity(i);
            }
        });
        Image1 = (Button) findViewById(R.id.button18);
        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Manual2.this, Manual3.class);
                startActivity(i);
            }
        });
    }
}