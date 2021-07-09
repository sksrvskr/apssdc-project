/*package com.gec.learningmaterials.cse.I.sem1.unit2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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

public class bee2 extends AppCompatActivity {

    private  final  String pdflink = "https://drive.google.com/uc?export=download&id=1Wl7Yc86GtLTcCFWTalVWBycyW9dEmDIq";
    private  final String mypdf = "bee2.pdf";
    private PDFView pdfView;
    private TextView txtView,txt1;
    private AppCompatSeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf);
        pdfView = findViewById(R.id.pdfView);
        txtView = findViewById(R.id.txtview);

        initSeekbar();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        downloadpdf(mypdf);
    }
    private void initSeekbar(){
        seekBar = findViewById(R.id.seekbar);
        txt1 = findViewById(R.id.txt1);
        txt1.setText("Downloading please Wait");
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int val = (progress *(seekBar.getWidth()-3*seekBar.getThumbOffset()))/seekBar.getMax();
                txtView.setText("" + progress);
                txtView.setX(seekBar.getX()+val+seekBar.getThumbOffset()/2);
                if(val == 100){
                    seekBar.setVisibility(View.GONE);
                    txt1.setVisibility(View.GONE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void downloadpdf(final String fileName) {
        new AsyncTask<Void, Integer, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... params) {
                return downloadpdf();
            }

            @Nullable
            private Boolean downloadpdf() {
                try {

                    File file = getFileStreamPath(fileName);
                    if (file.exists() & file.length()!=0){
                        return true;
                    }
                    if(file.length() == 0){
                        getCacheDir().delete();
                    }
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
                            publishProgress((int) (total * 100) / contentLength);
                            fileOutputStream.write(data, 0, count);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        input.close();
                        return true;
                    }catch (MalformedURLException e){
                        e.printStackTrace();
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
                    Toast.makeText(getApplicationContext(), "Please Wait", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        }.execute();
    }
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

}*/
package com.gec.learningmaterials.cse.I.sem1.unit2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.widget.LinearLayout;
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

import es.voghdev.pdfviewpager.library.PDFViewPager;
import es.voghdev.pdfviewpager.library.RemotePDFViewPager;
import es.voghdev.pdfviewpager.library.adapter.PDFPagerAdapter;
import es.voghdev.pdfviewpager.library.remote.DownloadFile;
import es.voghdev.pdfviewpager.library.util.FileUtil;

public class bee2 extends AppCompatActivity implements DownloadFile.Listener {

    private  final  String pdflink = "https://drive.google.com/uc?export=download&id=1Wl7Yc86GtLTcCFWTalVWBycyW9dEmDIq";
    LinearLayout root;
    RemotePDFViewPager remotePDFViewPager;
    final int REQUEST_CODE = 1;

    PDFViewPager pdfViewPager;
    PDFPagerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ens3);

        root = findViewById(R.id.remote_pdf_root);
        final Context ctx = this;
        final DownloadFile.Listener listener = this;
        remotePDFViewPager = new RemotePDFViewPager(ctx, pdflink, listener);
        remotePDFViewPager.setId(R.id.pdfViewPager);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (adapter != null) {
            adapter.close();
        }
    }


    @Override
    public void onSuccess(String url, String destinationPath) {
        adapter = new PDFPagerAdapter(this, FileUtil.extractFileNameFromURL(url));
        remotePDFViewPager.setAdapter(adapter);
        root.removeAllViewsInLayout();
        root.addView(remotePDFViewPager,
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

    }

    @Override
    public void onFailure(Exception e) {
        e.printStackTrace();
        finish();
        startActivity(getIntent());
    }

    @Override
    public void onProgressUpdate(int progress, int total) {

    }
    protected boolean hasExternalStoragePermissions() {
        boolean hasReadPermission = ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_EXTERNAL_STORAGE
        ) == PackageManager.PERMISSION_GRANTED;

        boolean hasWritePermission = ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_EXTERNAL_STORAGE
        ) == PackageManager.PERMISSION_GRANTED;

        return hasReadPermission && hasWritePermission;
    }

    protected void requestPermissionsThenOpen(Class activityClass) {
        if (hasExternalStoragePermissions()) {
        } else {
            requestExternalStoragePermissions();
        }
    }

    protected void requestExternalStoragePermissions() {
        String[] permissions = {
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
        };

        ActivityCompat.requestPermissions(this, permissions, REQUEST_CODE);
    }

}