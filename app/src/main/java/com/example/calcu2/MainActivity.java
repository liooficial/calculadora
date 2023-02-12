package com.example.calcu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btmas,btigual,btmenos,btborar;
    TextView tvcalculadora;
    int n1=0,n2,resultado=0;
    String  operador="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvcalculadora=(TextView) findViewById(R.id.tvcalculadora);
        bt0=(Button) findViewById(R.id.bt0);
        bt1=(Button) findViewById(R.id.bt1);
        bt2=(Button) findViewById(R.id.bt2);
        bt3=(Button) findViewById(R.id.bt3);
        bt4=(Button) findViewById(R.id.bt4);
        bt5=(Button) findViewById(R.id.bt5);
        bt6=(Button) findViewById(R.id.bt6);
        bt7=(Button) findViewById(R.id.bt7);
        bt8=(Button) findViewById(R.id.bt8);
        bt9=(Button) findViewById(R.id.bt9);
        btmas=(Button) findViewById(R.id.btmas);
        btigual=(Button) findViewById(R.id.btigual);
        btmenos=(Button) findViewById(R.id.btmenos);
        btborar=(Button) findViewById(R.id.btborar);

        bt0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"0");
            }

        });

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"1");
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"2");
            }

        });

        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"3");
            }

        });

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"4");
            }

        });

        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"5");
            }

        });

        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"6");
            }

        });

        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"7");
            }

        });

        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"8");
            }

        });

        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText(tvcalculadora.getText().toString()+"9");
            }

        });
        btmas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                n1=Integer.valueOf(tvcalculadora.getText().toString());
                tvcalculadora.setText("");
                operador="+";
            }

        });
        btmenos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                n1=Integer.valueOf(tvcalculadora.getText().toString());
                tvcalculadora.setText("");
                operador="-";
            }

        });
        btigual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                n2+=Integer.valueOf(tvcalculadora.getText().toString());
                if(operador=="+") {
                    resultado=n1+n2;
                    tvcalculadora.setText(resultado+"");
                } else {
                    resultado=n1-n2;
                    tvcalculadora.setText(resultado+"");
                }
                resultado=0;
                n1=0;
                n2=0;
            }

        });
        btborar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tvcalculadora.setText("");
            }
        });
    }
}