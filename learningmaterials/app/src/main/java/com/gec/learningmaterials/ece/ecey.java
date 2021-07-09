package com.gec.learningmaterials.ece;

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

public class ecey extends AppCompatActivity {
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
        toolBarLayout.setTitle("it");
        toolBarLayout.setContentScrimResource(R.color.colorAccent);
        I = findViewById(R.id.b1);
        I.setText("I");
        II = findViewById(R.id.b2);
        II.setVisibility(View.INVISIBLE);
        III = findViewById(R.id.b3);
        III.setVisibility(View.INVISIBLE);
        IV = findViewById(R.id.b4);
        IV.setText("II");
        V = findViewById(R.id.b5);
        V.setText("III");
        VI = findViewById(R.id.b6);
        VI.setVisibility(View.INVISIBLE);

        VII = findViewById(R.id.b7);

        VIII = findViewById(R.id.b8);
        VIII.setText("IV");
        VII.setVisibility(View.INVISIBLE);

        ll1 = findViewById(R.id.lil1);
        ll2 = findViewById(R.id.lil2);
        ll3 = findViewById(R.id.lil3);
        ll4 = findViewById(R.id.lil4);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c2.setVisibility(View.INVISIBLE);
        c3 = findViewById(R.id.c3);
        c3.setVisibility(View.INVISIBLE);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c6.setVisibility(View.INVISIBLE);
        c7.setVisibility(View.INVISIBLE);
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), com.gec.learningmaterials.ece.I.sem.class);
                startActivity(i);

            }
        });
        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),com.gec.learningmaterials.ece.II.sem.class);
                startActivity(i);

            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), com.gec.learningmaterials.ece.III.sem.class);
                startActivity(i);

            }
        });
        VIII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), com.gec.learningmaterials.ece.IV.sem.class);
                startActivity(i);

            }
        });


    }
}