package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class inicioquatro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicioquatro);

        // Encontra o botão "Ir para a próxima página"
        Button button = findViewById(R.id.btn_4);

        // Define um ouvinte de clique no botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cria um Intent com a atividade de destino definida para NextActivity.class
                Intent intent = new Intent(inicioquatro.this, cadastro.class);

                // Chama o método startActivity() para iniciar a NextActivity
                startActivity(intent);
            }
        });
    }
}
