package com.gec.learningmaterials.cse.I.sem1.unit6;

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

public class bee6 extends AppCompatActivity implements DownloadFile.Listener {

    private  final  String pdflink = "https://drive.google.com/uc?export=download&id=1eO1moLMJkqcxFunTrc1Zqf_B9wPmnhDM";
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