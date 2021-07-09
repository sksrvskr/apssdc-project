package com.gec.learningmaterials.cse.I.sem2.unit3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.gec.learningmaterials.R;
import com.gec.learningmaterials.cse.I.sem2.unit3.ap;
import com.gec.learningmaterials.cse.I.sem2.unit3.eee;
import com.gec.learningmaterials.cse.I.sem2.unit3.es;
import com.gec.learningmaterials.cse.I.sem2.unit3.nmde;
import com.gec.learningmaterials.cse.I.sem2.unit3.pp;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class u3 extends AppCompatActivity {
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
        ll4 = findViewById(R.id.lil4);
        ll3 = findViewById(R.id.lil3);
        ll4.setVisibility(View.INVISIBLE);
        I = findViewById(R.id.b1);
        I.setText("Python");
        II = findViewById(R.id.b2);
        II.setText("PHY");
        III = findViewById(R.id.b3);
        III.setText("EEE");
        IV = findViewById(R.id.b4);
        IV.setText("NM&DE");
        V = findViewById(R.id.b5);
        V.setText("ES");
        VI = findViewById(R.id.b6);
        VI.setVisibility(View.INVISIBLE);
        c6 = findViewById(R.id.c6);
        c6.setVisibility(View.INVISIBLE);
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), pp.class);
                startActivity(i);

            }
        });

        II.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), ap.class);
                startActivity(ii);
            }
        });
        III.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), eee.class);
                startActivity(ii);
            }
        });
        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), nmde.class);
                startActivity(ii);
            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), es.class);
                startActivity(ii);
            }
        });
    }

}