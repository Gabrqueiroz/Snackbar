package com.tads.passardados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_enviar = findViewById(R.id.button_enviar);

        button_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Instanciar o Objeto
                usuario usuario = new usuario("Gabriel","gabriel123@gmail.com");

                //passar dados
                intent.putExtra("nome","Gabriel");
                intent.putExtra("idade",22);
                intent.putExtra("objeto", usuario);

                //Chamar Outra Activity
                startActivity(intent);
            }
        });
    }
}
