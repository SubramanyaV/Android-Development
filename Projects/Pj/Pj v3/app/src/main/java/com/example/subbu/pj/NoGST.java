package com.example.subbu.pj;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class NoGST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_gst);
        Button button = (Button) findViewById(R.id.cal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                EditText base = (EditText) findViewById(R.id.edittext1);
                String text = base.getText().toString();
                if (text == null || text.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter a number and try again.", Toast.LENGTH_SHORT).show();
                    return;
                }
                TextView output1 = (TextView) findViewById(R.id.output1);
                TextView output2 = (TextView) findViewById(R.id.output2);
                TextView output3 = (TextView) findViewById(R.id.output3);
                TextView output4 = (TextView) findViewById(R.id.output4);
                TextView output5 = (TextView) findViewById(R.id.output5);
                TextView output6 = (TextView) findViewById(R.id.output6);
                TextView output7 = (TextView) findViewById(R.id.output7);
                TextView output8 = (TextView) findViewById(R.id.output8);
                float baser = Float.parseFloat(base.getText().toString());
                double TF = (baser+50)*(11.670);
                double TT = ((baser*12/13)+50)*11.670;
                double TA = TF/2;
                double TB = TT/2;
                double TC = TF/4;
                double TD = TT/4;
                double TE = (baser+50)*(1);
                double TZ = ((baser*12/13)+50)*1;
                DecimalFormat forma = new DecimalFormat("0.000");
                output1.setText(forma.format(TF));
                output2.setText(forma.format(TT));
                output3.setText(forma.format(TA));
                output4.setText(forma.format(TB));
                output5.setText(forma.format(TC));
                output6.setText(forma.format(TD));
                output7.setText(forma.format(TE));
                output8.setText(forma.format(TZ));

            }
        });
    }
}
