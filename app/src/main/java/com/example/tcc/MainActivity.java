package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encontra o botão "Ir para a próxima página"
        Button button = findViewById(R.id.btn_1);

        // Define um ouvinte de clique no botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cria um Intent com a atividade de destino definida para NextActivity.class
                Intent intent = new Intent(MainActivity.this, iniciodois.class);

                // Chama o método startActivity() para iniciar a NextActivity
                startActivity(intent);
            }
        });
    }
}
