package com.example.aposentadoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RelatorioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        String nome = getIntent().getStringExtra("nome");
        String genero = getIntent().getStringExtra("genero");
        int idade = Integer.parseInt(getIntent().getStringExtra("idade"));
        int tempoContribuicao = Integer.parseInt(getIntent().getStringExtra("tempoContribuicao"));
        String relatorio = nome + genero + idade + tempoContribuicao;

        ((TextView)findViewById(R.id.idRelatorio)).setText(relatorio);



        /*
        if (genero.equalsIgnoreCase("Masculino")) {
            //TODO calc mas
        }

        if(genero.equalsIgnoreCase("Feminino")) {
            //TODO calc fem
        }
        */

    }


}