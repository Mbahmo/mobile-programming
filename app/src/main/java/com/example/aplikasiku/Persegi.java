package com.example.aplikasiku;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends Activity implements View.OnClickListener {
    private EditText Sisi;
    private TextView Hasil;
    private Integer Input;
    private Button HitungLuas, HitungKeliling;
    private String Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        Sisi = findViewById(R.id.txtsisipersegi);
        Hasil = findViewById(R.id.txthasilpersegi);

        HitungLuas = findViewById(R.id.btnhitungluaspersegi);
        HitungLuas.setOnClickListener(this);

        HitungKeliling = findViewById(R.id.btnhitungkelilingpersegi);
        HitungKeliling.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        Input = Integer.parseInt(Sisi.getText().toString());

        switch (arg0.getId()) {
            case R.id.btnhitungluaspersegi:
                Hasil.setText("Hasil Luas Persegi: " + 4 * Input);
                break;

            case R.id.btnhitungkelilingpersegi:
                Hasil.setText("Hasil Keliling Persegi: " + 4 * Input);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
