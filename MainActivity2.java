package com.diplomaprogrammig.count_able;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView;
    private ZoomControls Zoom_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView=(ImageView) findViewById(R.id.image_view);
        Zoom_1=(ZoomControls) findViewById(R.id.Zoom_1);
        Zoom_1.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x=imageView.getScaleX();
                float y=imageView.getScaleY();

                imageView.setScaleX((float)x+1);
                imageView.setScaleY((float)y+1);
            }
        });
        Zoom_1.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x=imageView.getScaleX();
                float y=imageView.getScaleY();

                imageView.setScaleX((float)x-1);
                imageView.setScaleY((float)y-1);
            }
        });

    }
}