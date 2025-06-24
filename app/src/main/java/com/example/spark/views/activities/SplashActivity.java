package com.example.spark.views.activities;

import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.spark.R;
import com.example.spark.views.activities.MainActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView logoSvg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logoSvg = findViewById(R.id.logo_svg);

        // Ocultar la ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Crear la animación de rotación
        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(logoSvg, "rotation", 0f, 360f);
        rotateAnimation.setDuration(700);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());

        // Iniciar la animación
        rotateAnimation.start();

        // Después de la animación, navegar a la siguiente actividad
        rotateAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                navigateToMainActivity();
            }
        });
    }

    private void navigateToMainActivity() {
        // Navegar a MainActivity después de la animación
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Cierra la SplashActivity
        }, 500); // Ajusta el tiempo si es necesario
    }
}