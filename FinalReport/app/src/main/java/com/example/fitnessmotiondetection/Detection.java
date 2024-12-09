package com.example.fitnessmotiondetection;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Detection extends AppCompatActivity {

    Button back_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detection);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        back_D = (Button) findViewById(R.id.back_D);
        // 接收來源標記
        String source = getIntent().getStringExtra("source");
        back_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("ExamplePicture1".equals(source)) {
                    finish(); // 返回 AActivity
                } else if ("ExamplePicture2".equals(source)) {
                    finish(); // 返回 CActivity
                } else {
                    finish(); // 默認返回
                }
            }
        });
    }
}