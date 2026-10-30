package com.example.practicalfive;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvCityTitle = findViewById(R.id.tvCityTitle);
        ImageView ivCityImage = findViewById(R.id.ivCityImage);
        TextView tvCityDesc = findViewById(R.id.tvCityDesc);
        Button btnShare = findViewById(R.id.btnShare);

        String cityName = getIntent().getStringExtra("CITY_NAME");
        if (cityName != null) {
            tvCityTitle.setText(cityName);
            ivCityImage.setImageResource(TextProcessor.getImageResId(cityName));
            String description = TextProcessor.getDescription(cityName, this);
            tvCityDesc.setText(description);

            btnShare.setOnClickListener(v -> {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out " + cityName + "\n" + description);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            });
        }
    }
}
