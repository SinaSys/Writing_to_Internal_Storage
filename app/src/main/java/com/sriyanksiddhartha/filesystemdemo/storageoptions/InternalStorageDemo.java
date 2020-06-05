package com.sriyanksiddhartha.filesystemdemo.storageoptions;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.sriyanksiddhartha.filesystemdemo.R;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class InternalStorageDemo extends AppCompatActivity {

    private EditText etFileName, etMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internal_storage);

        etFileName = (EditText) findViewById(R.id.etFileName);
        etMessage = (EditText) findViewById(R.id.etMessage);

    }

    public void saveToInternalStorage(View view) {

        String fileName = etFileName.getText().toString();
        String messageData = etMessage.getText().toString();

        FileOutputStream fos = null;

        try {
            fos = openFileOutput(fileName, MODE_PRIVATE);
            fos.write(messageData.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
