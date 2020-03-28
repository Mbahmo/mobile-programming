package com.example.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menu extends Activity implements View.OnClickListener {

    private Button Profil, Kegiatan, Keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Profil = findViewById(R.id.btnprofil);
        Kegiatan = findViewById(R.id.btnkegiatan);
        Keluar = findViewById(R.id.btnkeluar);
        Profil.setOnClickListener(this);
        Kegiatan.setOnClickListener(this);
        Keluar.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.btnprofil:
                startActivity(new Intent(Menu.this, Profil.class));
                break;
            case R.id.btnkegiatan:
                startActivity(new Intent(Menu.this, Kegiatan.class));
                break;
            case R.id.btnkeluar:
                finish();
                break;
        }
    }
}
