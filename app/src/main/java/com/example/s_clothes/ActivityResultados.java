package com.example.s_clothes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityResultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
    }

    public void abreItem(View view){
        Intent intent = new Intent(this, ActivityItem.class);
        startActivity(intent);
    }

    public void abrePesquisaDetalhada(View view){
        Intent intent = new Intent(this, ActivityPesquisa.class);
        startActivity(intent);
    }
}
