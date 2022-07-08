package com.diplomaprogrammig.count_able;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static  int count=0;
    static TextView textView;
    static Button Button_1,Button_2,Button_3;
    static Button Button_4;
    static Button text_1;
    static Button text_2,text_3;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.display);
        Button_1=findViewById(R.id.Button_1);
        Button_2=findViewById(R.id.Button_2);
        Button_3=findViewById(R.id.Button_3);
        Button_4=findViewById(R.id.Button_4);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);







        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(""+count);
                if(count==33){
                    textView.setText("Done the work");
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);

                    count=0;
                }

            }
        });
        Button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(""+count);
                if(count==33){
                    textView.setText("Done the work Next \nAllahu Akbar");
                    Intent intent_1=new Intent(MainActivity.this,Alhumdullila.class);
                    startActivity(intent_1);

                    count=0;
                }

            }
        });
        Button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText(""+count);
                if(count==33){
                    textView.setText("Done the work");
                    Intent intent_2=new Intent(MainActivity.this,Allahu_Akbar.class);
                    startActivity(intent_2);
                    count=0;
                }

            }
        });
        Button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Exit this program",Toast.LENGTH_SHORT).show();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        text_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sura=new Intent(MainActivity.this, sura.class);
                startActivity(sura);
            }
        });

        text_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent duya=new Intent(MainActivity.this,Duya.class);
                startActivity(duya);

            }
        });

        text_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masayel=new Intent(MainActivity.this,Masayel.class);
                startActivity(masayel);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_option,menu);

        return super.onCreateOptionsMenu(menu);



        }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() ==R.id.home){
            Intent intent_4=new Intent(MainActivity.this,option_1.class);
            startActivity(intent_4);
        }

        return super.onOptionsItemSelected(item);

    }
}
