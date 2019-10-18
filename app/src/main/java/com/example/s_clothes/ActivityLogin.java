package com.example.s_clothes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void abrePreCadastro(View view){
        Intent intent = new Intent(this, ActivityPreCadastro.class);
        startActivity(intent);
    }

    public void openHome(View view){
        /*
         * Fazer a autenticação aqui, se falhar retorna um erro
         * Se achou o usuario na tebela doador abre a tela de doador
         * Se achou na tabela donatario abre a tela Home_donatario
         */
        Intent intent = new Intent(this, HomeDoador.class);
        startActivity(intent);
    }

}
