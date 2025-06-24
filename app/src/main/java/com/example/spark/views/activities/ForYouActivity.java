// app/src/main/java/com/example/spark/views/activities/ForYouActivity.java
package com.example.spark.views.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.spark.R;

public class ForYouActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        View cartDot = findViewById(R.id.cart_dot);
        boolean hasCartItem = getSharedPreferences("cart_prefs", MODE_PRIVATE)
                .getBoolean("has_cart_item", false);
        cartDot.setVisibility(hasCartItem ? View.VISIBLE : View.GONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_you);
    }
}
