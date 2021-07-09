package com.gec.learningmaterials.cse.I.sem2.unit2;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.gec.learningmaterials.R;

import es.voghdev.pdfviewpager.library.PDFViewPager;
import es.voghdev.pdfviewpager.library.RemotePDFViewPager;
import es.voghdev.pdfviewpager.library.adapter.PDFPagerAdapter;
import es.voghdev.pdfviewpager.library.remote.DownloadFile;
import es.voghdev.pdfviewpager.library.util.FileUtil;

public class pp extends AppCompatActivity  implements  DownloadFile.Listener{
    private  final  String pdflink = "https://drive.google.com/uc?export=download&id=1Rt4r9MR5xG8-PtizKy4dCAOXDcaQqsLY";
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


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        remotePDFViewPager.setSaveEnabled(true);
    }
}