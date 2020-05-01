package com.example.aplikasiku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends Activity implements View.OnClickListener {
    private EditText Panjang, Lebar;
    private TextView Hasil;
    private Button HitungLuas, HitungKeliling;
    private Integer PanjangProses, LebarProses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        Panjang = findViewById(R.id.txtpanjangpersegipanjang);
        Lebar = findViewById(R.id.txtlebarersegipanjang);
        Hasil = findViewById(R.id.txthasilpersegipanjang);

        HitungLuas = findViewById(R.id.btnhitungluaspersegipanjang);
        HitungLuas.setOnClickListener(this);

        HitungKeliling = findViewById(R.id.btnhitungkelilingpersegipanjang);
        HitungKeliling.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        PanjangProses = Integer.parseInt(Panjang.getText().toString());
        LebarProses = Integer.parseInt(Lebar.getText().toString());

        switch (arg0.getId()) {
            case R.id.btnhitungluaspersegipanjang:
                Hasil.setText("Hasil Luas Persegi Panjang : " + PanjangProses * LebarProses);
                break;

            case R.id.btnhitungkelilingpersegipanjang:
                Hasil.setText("Hasil Keliling Persegi Panjang : " + 2 * (PanjangProses + LebarProses));
                break;

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent ExplicitIntent = new Intent(PersegiPanjang.this, Menu.class);
        startActivity(ExplicitIntent);
        finish();
    }
}

