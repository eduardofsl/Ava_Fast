package com.example.tcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class cadastro extends AppCompatActivity {

    private EditText edit_email, edit_telefone, edit_senha;
    private Button btn_cadastrar;
    String[] messagens = {"Preencha todos os campos", "Cadastro realizado com sucesso"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        IniciarComponentes();
        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = edit_email.getText().toString();
                String telefone = edit_telefone.getText().toString();
                String senha = edit_senha.getText().toString();

                if (email.isEmpty() || telefone.isEmpty() || senha.isEmpty()){
                    Snackbar snackbar = Snackbar.make(v,messagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }else {
                    CadastrarUsuario(v);
                }

                                             }
                                         });

                // Encontra o botão "Ir para a próxima página"
                Button button = findViewById(R.id.btn_5);

        // Define um ouvinte de clique no botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cria um Intent com a atividade de destino definida para NextActivity.class
                Intent intent = new Intent(cadastro.this, login.class);

                // Chama o método startActivity() para iniciar a NextActivity
                startActivity(intent);
            }
        });
    }


        private void CadastrarUsuario(View v){
            String email = edit_email.getText().toString();
            String senha = edit_senha.getText().toString();
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){
                            Snackbar snackbar = Snackbar.make(v,messagens[1], Snackbar.LENGTH_SHORT);
                            snackbar.setBackgroundTint(Color.WHITE);
                            snackbar.setTextColor(Color.BLACK);
                            snackbar.show();
                        }
                }
            });

        }

        private void IniciarComponentes(){
            edit_email = findViewById(R.id.edit_email);
            edit_telefone = findViewById(R.id.edit_telefone);
            edit_senha = findViewById(R.id.edit_senha);
            btn_cadastrar = findViewById(R.id.btn_cadastrar);
        }

}
