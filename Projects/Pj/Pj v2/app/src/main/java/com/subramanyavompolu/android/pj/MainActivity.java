package com.subramanyavompolu.android.pj;

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
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                EditText base = (EditText) findViewById(R.id.editText1);
                TextView TFOT = (TextView) findViewById(R.id.TFOT);
                TextView TTOT = (TextView) findViewById(R.id.TTOT);
                TextView TFHT = (TextView) findViewById(R.id.TFHT);
                TextView TTHT = (TextView) findViewById(R.id.TTHT);
                TextView TFQT = (TextView) findViewById(R.id.TFQT);
                TextView TTQT = (TextView) findViewById(R.id.TTQT);
                TextView TFOG = (TextView) findViewById(R.id.TFOG);
                TextView TTOG = (TextView) findViewById(R.id.TTOG);
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
                TFOT.setText(forma.format(TF));
                TTOT.setText(forma.format(TT));
                TFHT.setText(forma.format(TA));
                TTHT.setText(forma.format(TB));
                TFQT.setText(forma.format(TC));
                TTQT.setText(forma.format(TD));
                TFOG.setText(forma.format(TE));
                TTOG.setText(forma.format(TZ));

            }
        });
    }
}
