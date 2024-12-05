package com.example.listwithdetails;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleView = findViewById(R.id.detailTitle);
        TextView descriptionView = findViewById(R.id.detailDescription);

        // Получаем данные из Intent
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");

        // Устанавливаем данные в TextView
        titleView.setText(title);
        descriptionView.setText(description);
    }
}
