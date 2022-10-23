package com.example.rvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manual3 extends AppCompatActivity {
    Button Image;
    Button Image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual3);
        Image = (Button) findViewById(R.id.button21);
        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Manual3.this, Manual2.class);
                startActivity(i);
            }
        });
        Image1 = (Button) findViewById(R.id.button20);
        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Manual3.this, Ventana.class);
                startActivity(i);
            }
        });
    }
}