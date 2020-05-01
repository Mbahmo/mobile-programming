package com.example.aplikasiku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends Activity implements View.OnClickListener {
    private EditText Panjang, Lebar, Tinggi;
    private TextView Hasil;
    private Button Hitung;
    private Integer PanjangProses, LebarProses, TinggiProses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        Panjang = findViewById(R.id.txtpanjangbalok);
        Lebar = findViewById(R.id.txtlebarbalok);
        Tinggi = findViewById(R.id.txttinggibalok);

        Hasil = findViewById(R.id.txthasilbalok);

        Hitung = findViewById(R.id.btnhitungluasbalok);
        Hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        PanjangProses = Integer.parseInt(Panjang.getText().toString());
        LebarProses = Integer.parseInt(Lebar.getText().toString());
        TinggiProses = Integer.parseInt(Tinggi.getText().toString());

        Hasil.setText("Hasil Volumen Persegi Panjang : " + PanjangProses * LebarProses * TinggiProses);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent ExplicitIntent = new Intent(Balok.this, Menu.class);
        startActivity(ExplicitIntent);
        finish();
    }
}
