package com.example.spark.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spark.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterUserActivity extends AppCompatActivity {

    private TextInputLayout tilEmail, tilPassword, tilConfirmPassword;
    private TextInputEditText etEmail, etPassword, etConfirmPassword;
    private MaterialButton btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        // Activar el teclado automáticamente
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        // Inicializar vistas
        tilEmail = findViewById(R.id.tilEmail);
        tilPassword = findViewById(R.id.tilPassword);
        tilConfirmPassword = findViewById(R.id.tilConfirmPassword);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnContinuar = findViewById(R.id.btnContinuar);

        // Back Button
        ImageView backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> {
            finish(); // Volver a la pantalla anterior (MainActivity)
        });

        // Botón "Continuar"
        btnContinuar.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            String confirmPassword = etConfirmPassword.getText().toString().trim();

            if (validateEmail(email) && validatePassword(password, confirmPassword)) {
                // Navegar a la siguiente pantalla o realizar la acción necesaria
                Intent intent = new Intent(RegisterUserActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private boolean validateEmail(String email) {
        if (email.isEmpty()) {
            tilEmail.setError("El correo electrónico es obligatorio");
            return false;
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            tilEmail.setError("El correo electrónico no es válido");
            return false;
        }

        tilEmail.setError(null);
        return true;
    }

    private boolean validatePassword(String password, String confirmPassword) {
        if (password.isEmpty()) {
            tilPassword.setError("La contraseña es obligatoria");
            return false;
        }

        if (password.length() < 8) {
            tilPassword.setError("La contraseña debe tener al menos 8 caracteres");
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            tilPassword.setError("La contraseña debe contener al menos una mayúscula");
            return false;
        }

        if (!password.matches(".*[@#$%^&+=].*")) {
            tilPassword.setError("La contraseña debe contener al menos un símbolo");
            return false;
        }

        if (confirmPassword.isEmpty()) {
            tilConfirmPassword.setError("Confirma tu contraseña");
            return false;
        }

        if (!password.equals(confirmPassword)) {
            tilConfirmPassword.setError("Las contraseñas no coinciden");
            return false;
        }

        tilPassword.setError(null);
        tilConfirmPassword.setError(null);
        return true;
    }
}
