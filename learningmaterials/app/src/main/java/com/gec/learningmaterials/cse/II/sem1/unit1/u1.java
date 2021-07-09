package com.gec.learningmaterials.cse.II.sem1.unit1;

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


public class u1 extends AppCompatActivity {
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
        toolBarLayout.setTitle("Unit-1");

        toolBarLayout.setContentScrimResource(R.color.colorAccent);
        I = findViewById(R.id.b1);
        I.setText("OOPJAVA");
        II = findViewById(R.id.b2);
        II.setText("DS");
        III = findViewById(R.id.b3);
        III.setText("DLD");
        IV = findViewById(R.id.b4);
        IV.setText("DMS");
        V = findViewById(R.id.b5);
        V.setText("MEFA");
        VI = findViewById(R.id.b6);
        VI.setVisibility(View.INVISIBLE);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c6.setVisibility(View.INVISIBLE);
        ll1 = findViewById(R.id.lil1);
        ll2 = findViewById(R.id.lil2);
        ll3 = findViewById(R.id.lil3);
        ll4 = findViewById(R.id.lil4);
        ll4.setVisibility(View.INVISIBLE);
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), oops.class);
                startActivity(i);

            }
        });

        II.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), ds.class);
                startActivity(ii);
            }
        });
        III.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(),dld.class);
                startActivity(ii);
            }
        });
        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), dms.class);
                startActivity(ii);
            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), mefa.class);
                startActivity(ii);
            }
        });
        


    }

}