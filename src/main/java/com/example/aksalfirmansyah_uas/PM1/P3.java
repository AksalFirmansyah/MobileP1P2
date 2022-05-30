package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aksalfirmansyah_uas.R;

public class P3 extends AppCompatActivity {
    TextView Masukan, Keluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
        Masukan = (TextView) findViewById(R.id.masukan);
        Keluaran = (TextView) findViewById(R.id.hasilmasukan);
    }

    public void Masukan(View V) {
        String kataKalimat = Masukan.getText().toString();
        Keluaran.setText(kataKalimat);
    }
}