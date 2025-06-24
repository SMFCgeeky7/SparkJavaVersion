package com.example.spark.views.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

import com.example.spark.R;
import com.example.spark.viewmodels.CategoryViewModel;
import com.example.spark.data.entity.Category;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.List;

public class ChooseYourInterestsActivity extends AppCompatActivity {
    private ChipGroup chipGroup;
    private CategoryViewModel categoryViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_interests);

        chipGroup = findViewById(R.id.ChipGroup);
        categoryViewModel = new ViewModelProvider(this).get(CategoryViewModel.class);
        // Sincroniza con el API al abrir la pantalla
        categoryViewModel.refreshCategoriesFromApi();
        categoryViewModel.getCategories().observe(this, categories -> {
            chipGroup.removeAllViews();
            for (Category category : categories) {
                Chip chip = new Chip(this);
                chip.setText(category.getCategoryName());
                chip.setCheckable(true);
                chip.setTag(category.getCategoryId());
                chipGroup.addView(chip);
            }
        });

        MaterialButton btnContinuar = findViewById(R.id.btn_continuar);
        btnContinuar.setOnClickListener(v -> {
            int selectedCount = 0;
            for (int i = 0; i < chipGroup.getChildCount(); i++) {
                Chip chip = (Chip) chipGroup.getChildAt(i);
                if (chip.isChecked()) {
                    selectedCount++;
                }
            }
            if (selectedCount < 3) {
                Toast.makeText(this, "Selecciona al menos 3 intereses", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, ForYouActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}


