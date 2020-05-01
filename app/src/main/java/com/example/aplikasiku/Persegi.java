package com.example.aplikasiku;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Persegi extends Activity implements View.OnClickListener {
    private EditText Sisi;
    private Integer Input;
    private Button HitungLuas, HitungKeliling;
    private String Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        Sisi = findViewById(R.id.txtpassword);
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
                Toast.makeText(getApplicationContext(), "Hasil Luas Persegi: " + Input * Input, Toast.LENGTH_LONG).show();
                break;

            case R.id.btnhitungkelilingpersegi:
                Toast.makeText(getApplicationContext(), "Hasil Keliling Persegi: " + 4 * Input, Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
