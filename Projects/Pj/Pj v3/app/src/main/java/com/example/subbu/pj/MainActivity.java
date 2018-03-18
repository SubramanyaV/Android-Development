package com.example.subbu.pj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Act1(View view)
    {
        Intent intent = new Intent(this,NoGST.class);
        startActivity(intent);

    }
    public void Act2(View view)
    {
        Intent intent1 = new Intent(this,GST.class);
        startActivity(intent1);
    }
}



