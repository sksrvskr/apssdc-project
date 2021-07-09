package com.gec.learningmaterials.cse.I.sem1.unit3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.gec.learningmaterials.R;
import com.gec.learningmaterials.cse.I.sem1.unit1.bee1;
import com.gec.learningmaterials.cse.I.sem1.unit1.che1;
import com.gec.learningmaterials.cse.I.sem1.unit1.ens1;
import com.gec.learningmaterials.cse.I.sem1.unit1.lait1;
import com.gec.learningmaterials.cse.I.sem1.unit1.pstcp1;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class u3 extends AppCompatActivity {
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
        toolBarLayout.setTitle("Unit-3");

        toolBarLayout.setContentScrimResource(R.color.colorAccent);
        I = findViewById(R.id.b1);
        I.setText("PSTCP");
        II = findViewById(R.id.b2);
        II.setText("CHE");
        III = findViewById(R.id.b3);
        III.setText("BEE");
        IV = findViewById(R.id.b4);
        IV.setText("LA&IT");
        V = findViewById(R.id.b5);
        V.setText("ENS");
        VI = findViewById(R.id.b6);
        VI.setText("C lab manual");
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

                Intent i = new Intent(getApplicationContext(), pstcp3.class);
                startActivity(i);

            }
        });

        II.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), che3.class);
                startActivity(ii);
            }
        });
        III.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), bee3.class);
                startActivity(ii);
            }
        });
        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), lait3.class);
                startActivity(ii);
            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), ens3.class);
                startActivity(ii);
            }
        });
        VI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), pstcp3.class);
                startActivity(ii);
            }
        });


    }
}