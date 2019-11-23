package com.example.s_clothes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityAgendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar);
    }

    public void onClickButton(View view) {
        Intent intent = new Intent(this, HomeDoador.class);
        startActivity(intent);
    }

    public void onClickSearch(View view) {
        Intent intent = new Intent(this, ActivityResultados.class);
        startActivity(intent);
    }
}
