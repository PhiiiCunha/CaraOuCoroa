package com.example.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.caraoucoroa.activity.ResultadoActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = findViewById(R.id.jogarButton);

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
                int numero = new Random().nextInt(2);
                intent.putExtra("numero", numero);
                startActivity(intent);
            }
        });
    }
}
