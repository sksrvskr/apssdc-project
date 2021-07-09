package com.gec.learningmaterials.cse.I.sem1.unit1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.gec.learningmaterials.R;
import com.gec.learningmaterials.civil.civily;

import com.gec.learningmaterials.cse.csey;
import com.gec.learningmaterials.ece.ecey;
import com.gec.learningmaterials.eee.eeey;
import com.gec.learningmaterials.it.ity;
import com.gec.learningmaterials.mech.mechy;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

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
        toolBarLayout.setTitle("GEC Learning Materials");

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
        VI.setVisibility(View.GONE);
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
                Intent i = new Intent(getApplicationContext(), pstcp1.class);
                startActivity(i);

            }
        });

        II.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), che1.class);
                startActivity(ii);
            }
        });
        III.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), bee1.class);
                startActivity(ii);
            }
        });
        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), lait1.class);
                startActivity(ii);
            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), ens1.class);
                startActivity(ii);
            }
        });
        VI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getApplicationContext(), pstcp1.class);
                startActivity(ii);
            }
        });


    }

}