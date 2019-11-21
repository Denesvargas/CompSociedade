package com.example.s_clothes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.s_clothes.data.ActivityCadastroDoador;

public class ActivityPreCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_cadastro);
    }

    public void abreCadastro(View view){
        Intent intent = new Intent(this, ActivityCadastro.class);
        startActivity(intent);
    }

    public void abreCadastroDoador(View view){
        Intent intent = new Intent(this, ActivityCadastroDoador.class);
        startActivity(intent);
    }

    public void abreCadastroAssociacao(View view){
        Intent intent = new Intent(this, ActivityCadastroAssociacao.class);
        startActivity(intent);
    }
}
