package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tcc.databinding.ActivityWelcomeBinding;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;

public class welcome extends AppCompatActivity {

    ActivityWelcomeBinding binding;
    GoogleSignInClient googleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();

        setContentView(R.layout.activity_welcome);

        // Encontra o botão "Ir para a próxima página"
        Button button = findViewById(R.id.btn_5);

        // Define um ouvinte de clique no botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cria um Intent com a atividade de destino definida para NextActivity.class
                Intent intent = new Intent(welcome.this, cadastro.class);

                // Chama o método startActivity() para iniciar a NextActivity
                startActivity(intent);
            }
        });
    }
}
