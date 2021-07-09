package com.gec.learningmaterials.ece;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.gec.learningmaterials.R;
import com.gec.learningmaterials.civil.I.sem1;
import com.gec.learningmaterials.civil.I.sem2;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class sem extends AppCompatActivity {
    Button I,II,III,IV,V,VI,VII,VIII;
    LinearLayout ll1,ll2,ll3,ll4;
    CardView c1,c2,c3,c4,c5,c6,c7,c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle("GEC Learning Materials");
        toolBarLayout.setContentScrimResource(R.color.colorAccent);
        I = findViewById(R.id.b1);
        I.setText("I");
        II = findViewById(R.id.b2);
        II.setVisibility(View.INVISIBLE);
        V = findViewById(R.id.b5);
        V.setVisibility(View.INVISIBLE);
        VI = findViewById(R.id.b6);
        VI.setText("II");
        ll1 = findViewById(R.id.lil1);
        ll2 = findViewById(R.id.lil2);
        ll2.setVisibility(View.INVISIBLE);
        ll3 = findViewById(R.id.lil3);
        ll4 = findViewById(R.id.lil4);
        ll4.setVisibility(View.INVISIBLE);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c2.setVisibility(View.INVISIBLE);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c5.setVisibility(View.INVISIBLE);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), sem1.class);
                startActivity(i);

            }
        });
        VI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), sem2.class);
                startActivity(i);

            }
        });


    }
}