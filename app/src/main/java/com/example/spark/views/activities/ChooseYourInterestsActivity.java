package com.example.spark.views.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

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

        chipGroup = findViewById(R.id.chip_group);
        categoryViewModel = new ViewModelProvider(this).get(CategoryViewModel.class);
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
    }
}

