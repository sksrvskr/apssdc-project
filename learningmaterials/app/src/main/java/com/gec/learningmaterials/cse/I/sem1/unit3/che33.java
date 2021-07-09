package com.gec.learningmaterials.cse.I.sem1.unit3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.gec.learningmaterials.R;
import com.github.barteksc.pdfviewer.PDFView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class che33 extends AppCompatActivity {

    private  final  String pdflink = "https://drive.google.com/uc?export=download&id=1_XGe6Ph3drHDsPFZN3U--1VqzBehdf1J";
    private  final String mypdf = "ens124.pdf";
    private PDFView pdfView;
    private TextView txtView;
    private AppCompatSeekBar seekBar;
    private ProgressDialog pDialog;
    private static String file_url = "http://idsp.ak.gov.ng/images/logo.png";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf);
        pdfView = findViewById(R.id.pdfView);
        txtView = findViewById(R.id.txtview);

      //  downloadpdf(mypdf);

    }

 /*   private void downloadpdf(final String fileName) {


        @Override
        protected Dialog onCreateDialog(int id){
            switch (id){
                case progress_bar_type:
                    pDialog = new ProgressDialog(this);
                    pDialog.setMessage("Downloading file. Please wait...");
                    pDialog.setIndeterminate(false);
                    pDialog.setMax(100);
                    pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                    pDialog.setCancelable(true);
                    pDialog.show();
                    return pDialog;
                default:
                    return null;
            }
        }
        new AsyncTask<Void, Integer, Boolean>() {
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                showDialog(progress_bar_type);
            }

            @Override
            protected Boolean doInBackground(Void... params) {
                return downloadpdf();
            }

            @Nullable
            private Boolean downloadpdf() {
                try {
                    File file = getFileStreamPath(fileName);
                    long  length = file.length();
                    if (file.exists()  &(length!=0) )
                        return true;
                    try {
                        FileOutputStream fileOutputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
                        URL u = new URL(pdflink);
                        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
                        conn.connect();
                        int contentLength = conn.getContentLength();
                        InputStream input = new BufferedInputStream(u.openStream());
                        byte data[] = new byte[contentLength];
                        long total = 0;
                        int count;
                        while ((count = input.read(data)) != 1) {
                            total += count;
                            publishProgress((int)(total*100)/contentLength);
                            fileOutputStream.write(data, 0, count);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        input.close();
                        return true;
                    } catch (final Exception e) {
                        e.printStackTrace();
                        return false;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;


            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
                seekBar.setProgress(values[0]);
            }

            @Override
            protected void onPostExecute(Boolean aBoolean) {
                super.onPostExecute(aBoolean);
                if (aBoolean) {
                    openPdf(fileName);
                } else {
                    Toast.makeText(getApplicationContext(), "please wait", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());

                }
            }
        }.execute();
    }

  */
    private void openPdf(String fileName){
        try {
            File file = getFileStreamPath(fileName);
            pdfView.setVisibility(View.VISIBLE);
            pdfView.fromFile(file)
                    .enableSwipe(true)
                    .spacing(0)
                    .load();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}