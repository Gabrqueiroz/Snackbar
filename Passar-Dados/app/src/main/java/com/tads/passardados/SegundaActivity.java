package com.tads.passardados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView text_nome;
    private TextView text_idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        text_nome = findViewById(R.id.text_nome);
        text_idade = findViewById(R.id.text_idade);

        //Recuperar dados

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");
        usuario usuario = (usuario) dados.getSerializable("objeto");

        // Recuperar Valores Retornados
        text_nome.setText(usuario.getEmail());
        text_idade.setText(String.valueOf(idade));
    }
}
