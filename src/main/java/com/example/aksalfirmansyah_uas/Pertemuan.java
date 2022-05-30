package com.example.aksalfirmansyah_uas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.aksalfirmansyah_uas.PM1.Layout;
import com.example.aksalfirmansyah_uas.PM1.P1;
import com.example.aksalfirmansyah_uas.PM1.P11;
import com.example.aksalfirmansyah_uas.PM1.P12;
import com.example.aksalfirmansyah_uas.PM1.P2;
import com.example.aksalfirmansyah_uas.PM1.P3;
import com.example.aksalfirmansyah_uas.PM1.P4;
import com.example.aksalfirmansyah_uas.PM1.P5;
import com.example.aksalfirmansyah_uas.PM1.P6;
import com.example.aksalfirmansyah_uas.PM1.P7;
import com.example.aksalfirmansyah_uas.PM1.Webview;

public class Pertemuan extends ListActivity {
    String[] pertemuan = {"Pertemuan 1", "Pertemuan 2","Pertemuan 3", "Pertemuan 4", "Pertemuan 5", "Pertemuan 6","Pertemuan 7","Pertemuan 8", "Pertemuan 9", "Pertemuan 10", "Pertemuan 11", "Pertemuan 12","Web View","Layout"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertemuan);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pertemuan));
    }
    public void onListItemClick(ListView parent, View v, int urutan, long id) {
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i;
        if (tampil == "Pertemuan 1") {
            i = new Intent(Pertemuan.this, P1.class);
            startActivity(i);
        }else if (tampil == "Pertemuan 2") {
            i = new Intent(Pertemuan.this, P2.class);
            startActivity(i);
        }
        else if (tampil == "Pertemuan 3") {
            i = new Intent(Pertemuan.this, P3.class);
            startActivity(i);
        }
        else if (tampil == "Pertemuan 4") {
            i = new Intent(Pertemuan.this, P4.class);
            startActivity(i);
        }
        else if (tampil == "Pertemuan 5") {
            i = new Intent(Pertemuan.this, P5.class);
            startActivity(i);
        }
        else if (tampil == "Pertemuan 6") {
            i = new Intent(Pertemuan.this, P6.class);
            startActivity(i);
        }
        else if (tampil == "Pertemuan 7") {
            i = new Intent(Pertemuan.this, P7.class);
            startActivity(i);
        }
        else if (tampil == "Pertemuan 11") {
            i = new Intent(Pertemuan.this, P11.class);
            startActivity(i);
        }
        else if (tampil == "Pertemuan 12") {
            i = new Intent(Pertemuan.this, P12.class);
            startActivity(i);
        }
        else if (tampil == "Web View") {
            i = new Intent(Pertemuan.this, Webview.class);
            startActivity(i);
        }
        else if (tampil == "Layout") {
            i = new Intent(Pertemuan.this, Layout.class);
            startActivity(i);
        }
    }
}