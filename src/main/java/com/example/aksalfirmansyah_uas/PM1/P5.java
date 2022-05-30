package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aksalfirmansyah_uas.R;

public class P5 extends AppCompatActivity {
    //R.1
    TextView input1, input2, operator, result, notif;
    Button btHitung;
    //V.1
    private int operation = 0;
    private double HasilAkhir = 0.0;
    private String Cek1 = "";
    private String Cek2 = "";

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);
//R.2
        input1 = (TextView) findViewById(R.id.angkaPertama);
        input2 = (TextView) findViewById(R.id.angkaKedua);
        operator = (TextView) findViewById(R.id.operasi);
        result = (TextView) findViewById(R.id.hasil);
        notif = (TextView) findViewById(R.id.keterangan);
//R.3
        btHitung = (Button) findViewById(R.id.button);
    }

    //Metod.Hitung
    public void klikHitungYa(View V){
        Cek1 = input1.getText().toString();
        Cek2 = input2.getText().toString();
        if ((!Cek1.equalsIgnoreCase("")) && (!Cek2.equalsIgnoreCase(""))) {
            double inputA = Double.parseDouble(Cek1);
            double inputB = Double.parseDouble(Cek2);
            HasilAkhir = inputA + inputB;
            String hasilString = String.valueOf(HasilAkhir);
            result.setText(hasilString);
            operator.setText("+");

            if(HasilAkhir>0){
                notif.setText("angka positif");
            }else if(HasilAkhir<0){
                notif.setText("angka negatif");
            }
        } else {
            notif.setText("Kolom tidak boleh kosong");
        }
    }
}