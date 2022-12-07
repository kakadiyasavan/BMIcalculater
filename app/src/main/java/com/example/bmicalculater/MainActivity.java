package com.example.bmicalculater;

import static com.example.bmicalculater.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Eeh;
    TextView Eew;
    TextView total;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Eeh = findViewById(R.id.eh);
        Eew = findViewById(R.id.ew);
        total = findViewById(R.id.total);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float eh = Float.parseFloat(Eeh.getText().toString());
                float ew = Float.parseFloat(Eew.getText().toString());

                float meter=eh/100;

                float ans=ew/(meter*meter);

                total.setText("BMI = "+ans);
            }
        });
    }
}