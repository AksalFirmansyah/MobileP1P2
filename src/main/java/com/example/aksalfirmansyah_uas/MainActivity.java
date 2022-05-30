package com.example.aksalfirmansyah_uas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost = getTabHost(); TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, Pertemuan.class);
        //content pada tab yang akan kita buat
        spec = tabhost.newTabSpec("project").setIndicator("pertemuan",null). setContent(intent);
        //mengeset nama tab dan mengisi content pada menu tab anda.
        tabhost.addTab(spec);
        //untuk membuat tabbaru disini bisa diatur sesuai keinginan anda
        intent = new Intent().setClass(this, project.class);
        spec = tabhost.newTabSpec("pertemuan").setIndicator("project",null).setContent(intent);
        tabhost.addTab(spec);
        intent = new Intent().setClass(this, Biodata.class);
        spec = tabhost.newTabSpec("Biodata").setIndicator("Biodata",null).setContent(intent);
        tabhost.addTab(spec);
    }
}