package com.example.kupal.myapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class third extends AppCompatActivity implements View.OnClickListener {

    private Button butAdd,butSub,butMul,butdivide,bRem;
    private TextView t1;
    private int sum1,f1,f2;
    private String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        init();

    }

    private void init() {
        Button bClr,bequal,but0,but1,but2,but3,but4,but5,but6,but7,but8,but9;
        sum1 = 0;
        f1 = 0;
        f2 = 0;
        result = "";
        t1 = (TextView)findViewById(R.id.text1);
        bRem = (Button) findViewById(R.id.bRemainder);
        butAdd = (Button)findViewById(R.id.buttonAdd);
        butSub = (Button)findViewById(R.id.buttonSubract);
        butdivide = (Button)findViewById(R.id.buttonDivide);
        butMul = (Button)findViewById(R.id.buttonMultiply);
        bequal = (Button)findViewById(R.id.buttonEqual);
        bClr = (Button) findViewById(R.id.bClear);
        but0 = (Button)findViewById(R.id.button0);
        but1 = (Button)findViewById(R.id.button1);
        but2 = (Button)findViewById(R.id.button2);
        but3 = (Button)findViewById(R.id.button3);
        but4 = (Button)findViewById(R.id.button4);
        but5 = (Button)findViewById(R.id.button5);
        but6 = (Button)findViewById(R.id.button6);
        but7 = (Button)findViewById(R.id.button7);
        but8 = (Button)findViewById(R.id.button8);
        but9 = (Button)findViewById(R.id.button9);

        butAdd.setOnClickListener(this);
        butSub.setOnClickListener(this);
        butMul.setOnClickListener(this);
        butdivide.setOnClickListener(this);
        bRem.setOnClickListener(this);
        bequal.setOnClickListener(this);
        bClr.setOnClickListener(this);
        but0.setOnClickListener(this);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
        but9.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bClear:
                sum1 = 0;
                f1 = 0;
                f2 = 0;
                result = "";
                t1.setText("");
                butAdd.setEnabled(true);
                butdivide.setEnabled(true);
                butMul.setEnabled(true);
                butSub.setEnabled(true);
                bRem.setEnabled(true);
                break;
            case R.id.button0:
                sum1 = sum1*10;
                String x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button1:
                sum1 = sum1*10 + 1;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button2:
                sum1 = sum1*10 + 2;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button3:
                sum1 = sum1*10 + 3;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button4:
                sum1 = sum1*10 + 4;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button5:
                sum1 = sum1*10 + 5;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button6:
                sum1 = sum1*10 + 6;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button7:
                sum1 = sum1*10 + 7;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button8:
                sum1 = sum1*10 + 8;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.button9:
                sum1 = sum1*10 + 9;
                x = result + String.valueOf(sum1);
                t1.setText(x);
                break;
            case R.id.buttonAdd:
                butAdd.setEnabled(true);
                butdivide.setEnabled(false);
                butMul.setEnabled(false);
                butSub.setEnabled(false);
                bRem.setEnabled(false);
                f1 = sum1;
                sum1 = 0;
                result = String.valueOf(f1)+ " + ";
                t1.setText(result );
                break;
            case R.id.buttonSubract:
                butSub.setEnabled(true);
                butAdd.setEnabled(false);
                butdivide.setEnabled(false);
                butMul.setEnabled(false);
                f1 = sum1;
                sum1 = 0;
                result = String.valueOf(f1)+ " - ";
                t1.setText(result );
                break;
            case R.id.buttonDivide:
                butdivide.setEnabled(true);
                butAdd.setEnabled(false);
                butMul.setEnabled(false);
                butSub.setEnabled(false);
                bRem.setEnabled(false);
                f1 = sum1;
                sum1 = 0;
                result = String.valueOf(f1)+ " / ";
                t1.setText(result );
                break;

            case R.id.buttonMultiply:
                butMul.setEnabled(true);
                butAdd.setEnabled(false);
                butdivide.setEnabled(false);
                butSub.setEnabled(false);
                bRem.setEnabled(false);
                f1 = sum1;
                sum1 = 0;
                result = String.valueOf(f1) + " x ";
                t1.setText(result );
                break;

            case R.id.bRemainder:
                butMul.setEnabled(false);
                butAdd.setEnabled(false);
                butdivide.setEnabled(false);
                butSub.setEnabled(false);
                bRem.setEnabled(true);
                f1 = sum1;
                sum1 = 0;
                result = String.valueOf(f1)+ " % ";
                t1.setText(result );
                break;

            case R.id.buttonEqual:
                f2 = sum1;
                int ans = 0;
                if (butAdd.isEnabled()){
                    ans = f1 + f2;
                    result = result + f2 + " = ";
                    String y = result  + Integer.toString(ans);
                    t1.setText(y);
                }
                else if (butSub.isEnabled()){
                    ans = f1 - f2;
                    result = result + f2 + " = ";
                    String y = result  + Integer.toString(ans);
                    t1.setText(y);
                }
                else if (butMul.isEnabled()){
                    ans = f1 * f2;
                    result = result + f2 + " = ";
                    String y = result  + Integer.toString(ans);
                    t1.setText(y);
                }
                else if (butdivide.isEnabled()){
                    try{
                        ans = f1 / f2;
                        result = result + f2 + " = ";
                        String y = result  + Integer.toString(ans);
                        t1.setText(y);
                    }
                    catch (Exception ex){
                        String y = "Can't Divide! did u type second number as zero?";
                        t1.setText(y);
                    }
                }
                else if (bRem.isEnabled()){
                    try{
                        ans = f1%f2;
                        result = result + f2 + " = ";
                        String y = result  + Integer.toString(ans);
                        t1.setText(y);
                    }
                    catch (Exception ex){
                        String y = "Can't Divide! did u type second number as zero?";
                        t1.setText(y);
                    }
                }
                butAdd.setEnabled(false);
                butdivide.setEnabled(false);
                butMul.setEnabled(false);
                butSub.setEnabled(false);
                bRem.setEnabled(false);

        }
    }
}
