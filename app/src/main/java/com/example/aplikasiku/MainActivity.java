package com.example.aplikasiku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends Activity implements View.OnClickListener {
    private EditText EmailEditText, PasswordEditText;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EmailEditText = findViewById(R.id.txtusername);
        PasswordEditText = findViewById(R.id.txtpassword);
        Login = findViewById(R.id.btnprofil);
        Login.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0) {
        CheckLogin(Login);
    }

    public void CheckLogin(View arg0){
        final String email = EmailEditText.getText().toString();
        if(!isValidEmail(email)){
            EmailEditText.setError("Email Tidak Valid");
        }
        final String password = PasswordEditText.getText().toString();
        if(!isValidPassword(password)){
            PasswordEditText.setError("Password tidak boleh kosong atau harus lebih dari 4");
        }
        if(isValidEmail(email) && isValidPassword(password)){
            Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
            Intent ExplicitIntent=new Intent(MainActivity.this, Menu.class);
            startActivity(ExplicitIntent);
            this.finish();
        }
    }

    public boolean isValidPassword(String password){
        return password != null && password.length() >= 4;
    }

    public boolean isValidEmail(String email){
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
