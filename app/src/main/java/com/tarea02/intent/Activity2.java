package com.tarea02.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import es.jcyl.educa.fray.pmdm.examen202412.R;

public class Activity2 extends AppCompatActivity {

    TextView returnTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Recuperar el nombre de usuario enviado desde MainActivity
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        // Mostrar el mensaje de bienvenida
        returnTextView = findViewById(R.id.returnText);
        returnTextView.setText("Adiós\n " + username);

        // Configurar el botón de regreso
        Button returnButton = findViewById(R.id.button2);
        returnButton.setOnClickListener(v -> {
            // Volver a la MainActivity
            Intent returnIntent = new Intent(Activity2.this, MainActivity.class);
            startActivity(returnIntent);
        });
    }
}