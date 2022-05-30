package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aksalfirmansyah_uas.R;

public class P6 extends AppCompatActivity {
    //R.1
    TextView input1, input2, operator, result, notif;
    Button btHitung, btJumlah, btKurang, btKali, btBagi;
    //V.1
    private int operation = 0;
    private double HasilAkhir = 0.0;
    private String Cek1 = "";
    private String Cek2 = "";


    //M.1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p6);

//R.2
        input1 = (TextView) findViewById(R.id.masukan1);
        input2 = (TextView) findViewById(R.id.masukan2);
        operator = (TextView) findViewById(R.id.operan);
        result = (TextView) findViewById(R.id.hasil);
        notif = (TextView) findViewById(R.id.notifikasi);

//R.3
        btHitung = (Button) findViewById(R.id.hitung);
        btJumlah = (Button) findViewById(R.id.tambah);
        btKurang = (Button) findViewById(R.id.kurang);
        btKali = (Button) findViewById(R.id.kali);
        btBagi = (Button) findViewById(R.id.bagi);
    }

    //M.2
    public void klikTambah(View V) {
        operation = 1;
        operator.setText(" + ");
    }

    //M.3
    public void klikKurang(View V) {
        operation = 2;
        operator.setText(" - ");
    }

    //M.4
    public void klikKali(View V) {
        operation = 3;
        operator.setText(" x ");
    }

    //M.4
    public void klikBagi(View V) {
        operation = 4;
        operator.setText(" : ");
    }

    public void klikHitungYa(View V) {
        Cek1 = input1.getText().toString();
        Cek2 = input2.getText().toString();
        if ((!Cek1.equalsIgnoreCase("")) && (!Cek2.equalsIgnoreCase(""))) {
            double inputA = Double.parseDouble(Cek1);
            double inputB = Double.parseDouble(Cek2);
            HasilAkhir = inputA + inputB;
            String hasilString = String.valueOf(HasilAkhir);
            result.setText(hasilString);
            operator.setText("+");

            if (HasilAkhir > 0) {
                notif.setText("angka positif");
            } else if (HasilAkhir < 0) {
                notif.setText("angka negatif");
            }
        } else {
            notif.setText("Kolom tidak boleh kosong");
        }
    }

    //M.5
    public void klikHasil(View V) {
        Cek1 = input1.getText().toString();
        Cek2 = input1.getText().toString();
        if ((Cek1.equalsIgnoreCase("")) ||
                (Cek2.equalsIgnoreCase(""))) {
            notif.setText("Kolom tidak boleh kosong");
        } else {
            double inputA = Double.parseDouble(Cek1);
            double inputB = Double.parseDouble(Cek2);
            //D.1
            switch (operation) {
                case 1:
                    HasilAkhir = inputA + inputB;
                    break;
                case 2:
                    HasilAkhir = inputA - inputB;
                    break;
                case 3:
                    HasilAkhir = inputA * inputB;
                    break;
                case 4:
                    HasilAkhir = inputA / inputB;
                    break;
                case 0:
                    notif.setText("Harap pilih operan terlebih dahulu!");
                    break;
                default:
                    notif.setText("Undescribeable Error!");
                    break;
            }
            if(operation < 1){
                result.setText("0"); }
            else{
                String hasilString = String.valueOf(HasilAkhir);
                result.setText(hasilString);
                notif.setText("Simple Calculator Ready!");
            }
        }
    }
}