package com.example.spark.views.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.spark.R;

public class ProductDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        ImageView backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> finish());

        ImageView saveIcon = findViewById(R.id.save_icon);
        ImageView savedIcon = findViewById(R.id.saved_icon);

        // Inicialmente muestra solo uno (por ejemplo, save_icon)
        saveIcon.setVisibility(View.VISIBLE);
        savedIcon.setVisibility(View.GONE);

        saveIcon.setOnClickListener(v -> {
            saveIcon.setVisibility(View.GONE);
            savedIcon.setVisibility(View.VISIBLE);
        });

        savedIcon.setOnClickListener(v -> {
            savedIcon.setVisibility(View.GONE);
            saveIcon.setVisibility(View.VISIBLE);
        });

        findViewById(R.id.btn_agregar_carrito).setOnClickListener(v -> {
            getSharedPreferences("cart_prefs", MODE_PRIVATE)
                    .edit()
                    .putBoolean("has_cart_item", true)
                    .apply();
            // Puedes mostrar un Toast si quieres
        });
    }
}