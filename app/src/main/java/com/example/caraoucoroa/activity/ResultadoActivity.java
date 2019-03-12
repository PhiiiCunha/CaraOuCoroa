package com.example.caraoucoroa.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.caraoucoroa.R;

public class ResultadoActivity extends AppCompatActivity {

    private Button voltar;
    private ImageView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        voltar = findViewById(R.id.voltarButton);
        resultado = findViewById(R.id.resultadoImageView);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0){
            resultado.setImageResource(R.drawable.moeda_cara);
        } else {
            resultado.setImageResource(R.drawable.moeda_coroa);
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
