package br.com.alura.agenda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button botaoSalvar = findViewById(R.id.formulario_salvar);

        botaoSalvar.setOnClickListener(view -> {
            Toast.makeText(FormularioActivity.this, "Botão clicado", Toast.LENGTH_SHORT).show();

            finish();
        });
    }

}
