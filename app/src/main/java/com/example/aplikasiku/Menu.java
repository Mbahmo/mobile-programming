package com.example.aplikasiku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity implements View.OnClickListener {

    private Button Profil, Kegiatan, Persegi, PersegiPanjang, Keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//      Profil = findViewById(R.id.btnprofil);
//      Kegiatan = findViewById(R.id.btnkegiatan);
//      Profil.setOnClickListener(this);
//      Kegiatan.setOnClickListener(this);

        Persegi = findViewById(R.id.btnpersegi);
        Persegi.setOnClickListener(this);

        Persegi = findViewById(R.id.btnpersegipanjang);
        Persegi.setOnClickListener(this);

        Persegi = findViewById(R.id.btnvolumebalok);
        Persegi.setOnClickListener(this);

        Keluar = findViewById(R.id.btnkeluar);
        Keluar.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
                /*
            case R.id.btnprofil:
               startActivity(new Intent(Menu.this, Profil.class));
               startActivity(new Intent(Menu.this, Kegiatan.class));
               this.finish();
               break;
            case R.id.btnkegiatan:
                startActivity(new Intent(Menu.this, Kegiatan.class));
                this.finish();
                break;
                 */
            case R.id.btnpersegi:
                startActivity(new Intent(Menu.this, Persegi.class));
                this.finish();
                break;
            case R.id.btnpersegipanjang:
                startActivity(new Intent(Menu.this, PersegiPanjang.class));
                this.finish();
                break;
            case R.id.btnvolumebalok:
                startActivity(new Intent(Menu.this, Balok.class));
                this.finish();
                break;
            case R.id.btnkeluar:
                this.finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
