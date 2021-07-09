package com.gec.learningmaterials.eee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.gec.learningmaterials.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class eeey extends AppCompatActivity {
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
        toolBarLayout.setTitle("cse");
        toolBarLayout.setContentScrimResource(R.color.colorAccent);
        I = findViewById(R.id.b1);
        I.setVisibility(View.INVISIBLE);
        II = findViewById(R.id.b2);
        II.setText("I");
        III = findViewById(R.id.b3);
        III.setText("II");
        IV = findViewById(R.id.b4);
        IV.setVisibility(View.INVISIBLE);
        V = findViewById(R.id.b5);
        V.setVisibility(View.INVISIBLE);
        VI = findViewById(R.id.b6);
        VI.setText("III");
        VII = findViewById(R.id.b7);
        VII.setText("IV");
        VIII = findViewById(R.id.b8);
        VIII.setVisibility(View.INVISIBLE);
        ll1 = findViewById(R.id.lil1);
        ll2 = findViewById(R.id.lil2);
        ll3 = findViewById(R.id.lil3);
        ll4 = findViewById(R.id.lil4);
        c1 = findViewById(R.id.c1);
        c1.setVisibility(View.INVISIBLE);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c4.setVisibility(View.INVISIBLE);
        c5 = findViewById(R.id.c5);
        c5.setVisibility(View.INVISIBLE);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c8.setVisibility(View.INVISIBLE);

        II.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), com.gec.learningmaterials.eee.I.sem.class);
                startActivity(i);

            }
        });
        III.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),com.gec.learningmaterials.eee.II.sem.class);
                startActivity(i);

            }
        });
        VI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), com.gec.learningmaterials.eee.III.sem.class);
                startActivity(i);

            }
        });
        VII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), com.gec.learningmaterials.eee.IV.sem.class);
                startActivity(i);

            }
        });
    }
}