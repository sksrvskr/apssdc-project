package com.gec.learningmaterials.mech.III;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.gec.learningmaterials.R;
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
        toolBarLayout.setTitle("SEM1");
        toolBarLayout.setContentScrimResource(R.color.colorAccent);
        ll4 = findViewById(R.id.lil4);
        ll4.setVisibility(View.INVISIBLE);

    }
}