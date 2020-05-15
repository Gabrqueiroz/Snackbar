package fcom.tads.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button botao;
    private Snackbar mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.button) ;
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensagem = Snackbar.make(botao, "Ação realizadada com sucesso", Snackbar.LENGTH_LONG);
                mensagem.show();

            }
        });
    }
}
