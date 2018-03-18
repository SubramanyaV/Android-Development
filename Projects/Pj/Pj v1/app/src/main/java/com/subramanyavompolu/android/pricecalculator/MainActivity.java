package com.subramanyavompolu.android.pricecalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                EditText base= (EditText) findViewById(R.id.editText);
                TextView twofour= (TextView) findViewById(R.id.TFV);
                TextView twotwo = (TextView) findViewById(R.id.TTV);
                float baser = Float.parseFloat(base.getText().toString());
                double TF = (baser+50)*(11.670);
                double TT = ((baser*12/13)+50)*11.670;
                DecimalFormat form = new DecimalFormat("0.000");
                twofour.setText(form.format(TF));
                twotwo.setText(form.format(TT));
            }
        });
    }
}
