package com.sriyanksiddhartha.filesystemdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sriyanksiddhartha.filesystemdemo.storageoptions.InternalStorageDemo;

/**
 * Author: Sriyank Siddhartha
 * <p>
 * Module 2: Working with Internal Storage
 * <p>
 * "AFTER" project
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openInternalStorageDemoActivity(View view) {

        Intent intent = new Intent(this, InternalStorageDemo.class);
        startActivity(intent);
    }

    public void openCacheStorageDemoActivity(View view) {

        //    Intent intent = new Intent(this, CacheStorageDemo.class);
        //   startActivity(intent);
    }

    public void openExternalStorageDemoActivity(View view) {

        //  Intent intent = new Intent(this, ExternalStorageDemo.class);
        // startActivity(intent);
    }
}
