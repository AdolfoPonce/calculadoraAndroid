package com.example.oso.calculadora_basica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
public Button hacer;
    public EditText n1,n2,res;
    private int op1,op2,r;
    private double r_d;
    private RadioButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(RadioButton)findViewById(R.id.suma_check);
        b2=(RadioButton)findViewById(R.id.res_check);
        b3=(RadioButton)findViewById(R.id.mult_check);
        b4=(RadioButton)findViewById(R.id.div_check);
        n1=(EditText)findViewById(R.id.caja_n1);
        n2=(EditText)findViewById(R.id.caja_n2);
        res=(EditText)findViewById(R.id.caja_res);
        hacer=(Button)findViewById(R.id.hacer_op);
        hacer.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v){

                 if (b1.isChecked()){
                           op1=Integer.parseInt(n1.getText().toString());
                           op2=Integer.parseInt(n2.getText().toString());
                      r=op1+op2;
                     res.setText(r+"");
                 }
                 else if (b2.isChecked()){
                       op1=Integer.parseInt(n1.getText().toString());
                       op2=Integer.parseInt(n2.getText().toString());
                       r=op1-op2;
                     res.setText(r+"");
                   }
                  else if (b3.isChecked()){
                       op1=Integer.parseInt(n1.getText().toString());
                       op2=Integer.parseInt(n2.getText().toString());
                       r=op1*op2;
                     res.setText(r+"");
                   }
                  else if (b4.isChecked()){
                       op1=Integer.parseInt(n1.getText().toString());
                       op2=Integer.parseInt(n2.getText().toString());
                       r_d=op1/op2;
                     res.setText(r_d+"");;
                   }
            }
        });



        }
    }

