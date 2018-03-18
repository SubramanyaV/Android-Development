package com.example.subbu.pj;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class GST extends AppCompatActivity {
    File imagePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst);
        Button button = (Button) findViewById(R.id.caln);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                EditText base = (EditText) findViewById(R.id.edittext1n);
                String text = base.getText().toString();
                if (text == null || text.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter a Base Rate and try again.", Toast.LENGTH_SHORT).show();
                    return;
                }
                TextView twofour = (TextView) findViewById(R.id.output1n);
                TextView twotwo = (TextView) findViewById(R.id.output2n);
                float baser = Float.parseFloat(base.getText().toString());
                double TF = (baser * 0.971) + 50;
                double TT = (baser * 0.8965) + 50;
                DecimalFormat form = new DecimalFormat("0.000");
                twofour.setText(form.format(TF));
                twotwo.setText(form.format(TT));
            }
        });
    }

}

