package com.example.spark.views.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.spark.R;
import com.example.spark.views.dialogs.CheckoutFormBottomSheet;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // Configurar el botón "Comprar"
        findViewById(R.id.btn_comprar).setOnClickListener(v -> {
            // Mostrar el BottomSheetDialog con el formulario
            CheckoutFormBottomSheet dialog = new CheckoutFormBottomSheet();
            dialog.show(getSupportFragmentManager(), "checkout_form");
        });
    }
}
