package es.jcyl.educa.fray.pmdm.examen202412;

import android.content.Intent;
import android.content.Intent;
import android.content.IntentBuilder;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toast;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recuperar el nombre de usuario enviado desde MainActivity
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        if (!username.isEmpty() && !password.isEmpty()) {
            if (username.equalsIgnoreCase(password)) {
                startActivity(new Intent(this, Activity7.class));
            } else {
                Toast.makeText(getApplicationContext(), "Credenciales Incorrectas", Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, MainActivity.class));
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Login en Pausa", Toast.LENGTH_LONG).show();
    }
}
