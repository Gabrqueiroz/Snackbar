package fcom.tads.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fcom.tads.fragments.R;
import fcom.tads.fragments.fragmet.ContatosFragment;
import fcom.tads.fragments.fragmet.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;
    private Button buttonConversa, buttonContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.button_contatos);
        buttonConversa = findViewById(R.id.button_conversas);

        //Remover sombra da actionbar

        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //configurar o objeto para o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });

        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversasFragment = new ConversasFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });

    }
}
