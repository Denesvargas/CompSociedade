package com.example.s_clothes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityCadastroAssociacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_associacao);
    }

    public void abreHome(View view){
        Intent intent = new Intent(this, HomeDoador.class);
        startActivity(intent);
    }
}
