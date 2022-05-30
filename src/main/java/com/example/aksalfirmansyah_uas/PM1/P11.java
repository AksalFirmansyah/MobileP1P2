package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.aksalfirmansyah_uas.R;

public class P11 extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p11);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        intent = new Intent().setClass(this, Beranda.class);
        //content pada tab yang akan kita buat
        spec =
                tabhost.newTabSpec("beranda").setIndicator("Beranda",null).
                        setContent(intent);
        //mengeset nama tab dan mengisi content pada menu tab anda.
        tabhost.addTab(spec);
        //untuk membuat tabbaru disini bisadiatur sesuai keinginan anda
        intent = new Intent().setClass(this, Berita.class);
        spec =
                tabhost.newTabSpec("berita").setIndicator("Berita",null).setContent(intent);
        tabhost.addTab(spec);
        intent = new Intent().setClass(this, Teman.class);
        spec =
                tabhost.newTabSpec("teman").setIndicator("Teman",null).setContent(intent);
        tabhost.addTab(spec);
    }
    }