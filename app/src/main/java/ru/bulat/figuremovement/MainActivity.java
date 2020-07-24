package ru.bulat.figuremovement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DrawView drawView = new DrawView(this);
        setContentView(drawView);

        drawView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawView.changeColors();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                drawView.invalidate();
                new Handler().postDelayed(this, 10);
            }
        }, 10);
    }
}