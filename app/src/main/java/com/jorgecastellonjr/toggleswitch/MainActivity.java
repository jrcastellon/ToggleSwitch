package com.jorgecastellonjr.toggleswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    TextView first;
    TextView second;
    TextView third;

    String on = "On";
    String off = "Off";
    String t = "True";
    String f = "False";

    boolean[] toggle = {false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        first = (TextView) findViewById(R.id.first);
        second = (TextView) findViewById(R.id.second);
        third = (TextView) findViewById(R.id.third);

        Toggle();

    }

    public void Toggle() {
        if (toggle[0]){
            btn1.setText(on);
            first.setText(t);
        }else {
            btn1.setText(off);
            first.setText(f);
        }

        if (toggle[1]){
            btn2.setText(on);
            second.setText(t);
        }else{
            btn2.setText(off);
            second.setText(f);
        }
        
        if (toggle[2]){
            btn3.setText(on);
            third.setText(t);
        }else{
            btn3.setText(off);
            third.setText(f);
        }
    }

    public void firstToggle(View v){
        toggle[0] = !toggle[0];
        Toggle();
    }

    public void secondToggle(View v){
        toggle[1] = !toggle[1];
        Toggle();
    }

    public void thirdToggle(View v){
        toggle[2] = !toggle[2];
        Toggle();
    }
}
