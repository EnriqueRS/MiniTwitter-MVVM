package com.enriquers.minitwitter_mvvm;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin;
    TextView tvGoSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            getSupportActionBar().hide();
        } catch (Exception e){}

        btnLogin = findViewById(R.id.buttonLogin);
        tvGoSignup = findViewById(R.id.textViewGoSignup);
        btnLogin.setOnClickListener(this);
        tvGoSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.buttonLogin:
                break;
            case R.id.textViewGoSignup:
                goToSignup();
                break;
        }
    }

    private void goToSignup() {
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }


}
