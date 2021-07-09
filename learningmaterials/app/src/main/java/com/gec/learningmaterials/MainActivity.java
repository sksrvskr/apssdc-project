package com.gec.learningmaterials;

import android.content.Intent;
import android.os.Bundle;

import com.gec.learningmaterials.civil.civily;
import com.gec.learningmaterials.cse.csey;
import com.gec.learningmaterials.ece.ecey;
import com.gec.learningmaterials.eee.eeey;
import com.gec.learningmaterials.it.ity;
import com.gec.learningmaterials.mech.mechy;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button I,II,III,IV,V,VI;
    CardView c1,c2,c3,c4,c5,c6,c7,c8;
    LinearLayout ll1,ll2,ll3,ll4;
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
        I.setText("cse");
        II = findViewById(R.id.b2);
        II.setText("It");
        III = findViewById(R.id.b3);
        III.setText("civil");
        IV = findViewById(R.id.b4);
        IV.setText("mech");
        V = findViewById(R.id.b5);
        V.setText("Ece");
        VI = findViewById(R.id.b6);
        VI.setText("Eee");
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
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

                Intent i = new Intent(getApplicationContext(), csey.class);
                startActivity(i);

            }
        });
        II.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ity.class);
                startActivity(i);

            }
        });
        III.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), civily.class);
                startActivity(i);

            }
        });
        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), mechy.class);
                startActivity(i);

            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ecey.class);
                startActivity(i);

            }
        });
        VI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), eeey.class);
                startActivity(i);

            }
        });
    }
}