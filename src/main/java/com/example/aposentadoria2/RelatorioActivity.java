package com.example.aposentadoria2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kotlin.jvm.Throws;


public class RelatorioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        String inputNome = getIntent().getStringExtra("nome");
        String inputGenero = getIntent().getStringExtra("genero");
        int inputIdade = Integer.parseInt((getIntent().getStringExtra("idade")));
        int inputTempoContribuicao = Integer.parseInt((getIntent().getStringExtra("tempoContribuicao")));

        String returnAposentadoria = "";

        boolean podeAposentar = podeAposentar(inputGenero, inputTempoContribuicao);

        //atribui um texto ao retorno com base no metodo podeAposentar()
        if(podeAposentar) {
            returnAposentadoria = "Pode aposentar!";
        } else {
            returnAposentadoria = "Não pode aposentar!";
        }

        String relatorio = String.format("Nome:" + inputNome + "\n" +
                "Idade: " + inputIdade + "\n" +
                "" + returnAposentadoria);

        ((TextView)findViewById(R.id.idRelatorio)).setText(relatorio);
    }

    //retorna "TRUE" ou "FALSE" a partir do genero e tempo de contribuicao
    public boolean podeAposentar(String genero, int tempoContribuicao) {

        int tempoMinimoMasculino = 35;
        int tempoMinimoFeminino = 35;

        if(genero.equalsIgnoreCase("masculino")) {
            return tempoContribuicao >= tempoMinimoMasculino;
        }  else if(genero.equalsIgnoreCase("feminino")) {
            return tempoContribuicao >= tempoMinimoFeminino;
        } else {
            throw new IllegalArgumentException("Genero Invalido");
        }
    }
}
