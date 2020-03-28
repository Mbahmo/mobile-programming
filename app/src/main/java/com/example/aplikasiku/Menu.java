package com.example.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity implements View.OnClickListener {

    private Button Profil, Kegiatan, Keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Profil.setOnClickListener(this);
        Kegiatan.setOnClickListener(this);
        Keluar.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.btnprofil:
                Intent ExplicitIntent = new Intent(Menu.this, Menu.class);
                startActivity(ExplicitIntent);
                break;
            case R.id.btnkegiatan:
//                Intent ExplicitIntent=new Intent(Menu.this, Menu.class);
//                startActivity(ExplicitIntent);
                break;
            case R.id.btnkeluar:
//                Intent ExplicitIntent=new Intent(Menu.this, Menu.class);
//                startActivity(ExplicitIntent);
                break;
        }
    }
}
