package es.jcyl.educa.fray.pmdm.examen202412;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Configurar el botón de login
        findViewById(R.id.inputPassword).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = findViewById(R.id.inputPassword).getText().toString();
                String password = findViewById(R.id.inputPassword).getText().toString();

                // Verificar las credenciales
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingrese nombre de usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else if (username.equals("Berto") && password.equals("bakar")) {
                    Intent intent = new Intent(MainActivity.this, Activity3.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void doLogin(View view) {
        String username = ((EditText) findViewById(R.id.inputPassword)).getText().toString();
        String password = ((EditText) findViewById(R.id.inputUsuario)).getText().toString();
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(getApplicationContext(), "El nombre del Usuario y la Contraseña no deben estar vacíos", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.putExtra("user", username);
            intent.putExtra("contraseña", password);
            startActivity(intent);
        }
    }
    public void doExit(View view) {
        finish();
    }
}