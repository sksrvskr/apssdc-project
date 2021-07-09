package com.gec.learningmaterials.cse.I.sem1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.gec.learningmaterials.R;
import com.gec.learningmaterials.cse.I.sem1.unit1.*;
import com.gec.learningmaterials.cse.I.sem1.unit2.*;
import com.gec.learningmaterials.cse.I.sem1.unit3.u3;
import com.gec.learningmaterials.cse.I.sem1.unit4.u4;
import com.gec.learningmaterials.cse.I.sem1.unit5.u5;
import com.gec.learningmaterials.cse.I.sem1.unit6.u6;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class sem1 extends AppCompatActivity {
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
        toolBarLayout.setTitle("I year I sem");
        toolBarLayout.setContentScrimResource(R.color.colorAccent);
        ll4 = findViewById(R.id.lil4);
        ll3 = findViewById(R.id.lil3);
        ll4.setVisibility(View.INVISIBLE);
        I = findViewById(R.id.b1);
        I.setText("UNIT1");
        II = findViewById(R.id.b2);
        II.setText("UNIT2");
        III = findViewById(R.id.b3);
        III.setText("UNIT3");
        IV = findViewById(R.id.b4);
        IV.setText("UNIT4");
        V = findViewById(R.id.b5);
        V.setText("UNIT5");
        VI = findViewById(R.id.b6);
        VI.setText("UNIT6");
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c6.setVisibility(View.GONE);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        ll1 = findViewById(R.id.lil1);
        ll2 = findViewById(R.id.lil2);
        ll3 = findViewById(R.id.lil3);
        ll4 = findViewById(R.id.lil4);
        ll4.setVisibility(View.INVISIBLE);
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), u1.class);
                startActivity(i);

            }
        });
        II.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), u2.class);
                startActivity(i);

            }
        });
        III.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), u3.class);
                startActivity(i);

            }
        });
        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), u4.class);
                startActivity(i);

            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), u5.class);
                startActivity(i);

            }
        });
        VI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), u6.class);
                startActivity(i);

            }
        });  }
}