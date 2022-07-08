package com.diplomaprogrammig.count_able;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sura extends AppCompatActivity {
    static Button sura1;
    static Button sura2;
    static Button sura3;
    static Button sura4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura);

        sura1=findViewById(R.id.sura1);
        sura2=findViewById(R.id.sura2);
        sura3=findViewById(R.id.sura3);
        sura4=findViewById(R.id.sura4);


        sura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sura_intent=new Intent(sura.this,Sura_Fatiha.class);
                startActivity(sura_intent);
            }
        });

        sura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sura_2=new Intent(sura.this,Sura_Naz.class);
                startActivity(sura_2);
            }
        });
        sura3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sura_3=new Intent(sura.this,Sura_Iqlas.class);
                startActivity(sura_3);
            }
        });
        sura4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sura_4=new Intent(sura.this,Sura_Falaq.class);
                startActivity(sura_4);
            }
        });
    }
}