package com.example.aposentadoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText idNome, idTempoContribuicao, idIdade, idGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idNome = findViewById(R.id.idNome);
        idTempoContribuicao = findViewById(R.id.idTempoContribuicao);
        idIdade = findViewById(R.id.idIdade);
        idGenero = findViewById(R.id.idGenero);

    }

    public void calcularAposentadoria(View view) {
        Intent intent = new Intent(getApplicationContext(), RelatorioActivity.class);
        intent.putExtra("nome", ((EditText)findViewById(R.id.idNome)).getText().toString());
        intent.putExtra("idade", ((EditText)findViewById(R.id.idIdade)).getText().toString());
        intent.putExtra("genero", ((EditText)findViewById(R.id.idGenero)).getText().toString());
        intent.putExtra("tempoContribuicao", ((EditText)findViewById(R.id.idTempoContribuicao)).getText().toString());
        startActivity(intent);
    }
}