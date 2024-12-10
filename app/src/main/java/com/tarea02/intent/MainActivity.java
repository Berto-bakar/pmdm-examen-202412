package com.tarea02.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import es.jcyl.educa.fray.pmdm.examen202412.R;

public class MainActivity extends AppCompatActivity {

    EditText userNameEditText, userPasswordEditText;
    Button loginButton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar las vistas
        userNameEditText = findViewById(R.id.userNameTest);
        userPasswordEditText = findViewById(R.id.userPasswordTest);
        loginButton = findViewById(R.id.button1);
        exitButton = findViewById(R.id.exitButton);  // Botón de salir

        // Configurar el botón de login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userNameEditText.getText().toString();
                String password = userPasswordEditText.getText().toString();

                // Verificar las credenciales
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingrese nombre de usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else if (username.equals("Berto") && password.equals("bakar")) {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Configurar el botón de salir
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cerrar todas las actividades y salir de la aplicación
                finishAffinity();
            }
        });
    }
}