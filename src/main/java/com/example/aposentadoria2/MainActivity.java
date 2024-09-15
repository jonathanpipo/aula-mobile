package com.example.aposentadoria2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        findViewById(R.id.btCalcular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelatorioActivity.class);
                intent.putExtra("nome", idNome.getText().toString());
                intent.putExtra("genero", idGenero.getText().toString());
                intent.putExtra("idade", idIdade.getText().toString());
                intent.putExtra("tempoContribuicao", idTempoContribuicao.getText().toString());
                startActivity(intent);
            }
        });
    }
}
