package com.example.spark.views.activities;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.spark.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.spark.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cambiar el color de la StatusBar
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.black));
        }

        // Aquí puedes inicializar la navegación, bottom navigation, etc.

        // Botón Registrate lleva a RegisterUserActivity
        findViewById(R.id.btnRegistrate).setOnClickListener(v -> {
            startActivity(new android.content.Intent(this, RegisterUserActivity.class));
        });

        // Botón Registrate lleva a RegisterUserActivity
        findViewById(R.id.btnCorreo).setOnClickListener(v -> {
            startActivity(new android.content.Intent(this, LoginUserActivity.class));
        });
    }
}