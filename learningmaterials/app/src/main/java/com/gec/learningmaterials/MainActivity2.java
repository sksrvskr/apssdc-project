package com.gec.learningmaterials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class MainActivity2 extends AppCompatActivity {
    PDFView pdfView;
    private  final  String pdflink = "https://drive.google.com/uc?export=download&id=1PwT-neATommW4ZRdC0Gbtu02XIXLvUil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf);
        pdfView = findViewById(R.id.pdfView);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        new Retrive().execute(pdflink);

    }

    private class Retrive extends AsyncTask<String,Void,InputStream> {
        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                if(httpURLConnection.getResponseCode() == 200){
                    inputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                }
            }catch (IOException e){
                return null;
            }
            return  inputStream;
        }


        @Override
        protected void onPostExecute(InputStream inputStream) {
            super.onPostExecute(inputStream);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
            pdfView.fromStream(inputStream).load();


        }
    }


}
