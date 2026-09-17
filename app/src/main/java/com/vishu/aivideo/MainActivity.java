package com.vishu.aivideo;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(40, 50, 40, 40);
        root.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("Vishu AI Video");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        root.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Create videos from your text");
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);
        root.addView(subtitle);

        EditText prompt = new EditText(this);
        prompt.setHint("Write your video idea...");
        prompt.setTextSize(16);
        root.addView(prompt);

        Button createButton = new Button(this);
        createButton.setText("CREATE VIDEO");
        root.addView(createButton);

        TextView status = new TextView(this);
        status.setText("Enter your idea and press CREATE VIDEO");
        status.setTextSize(16);
        status.setPadding(0, 30, 0, 0);
        root.addView(status);

        createButton.setOnClickListener(v -> {
            String text = prompt.getText().toString().trim();

            if (text.isEmpty()) {
                status.setText("Please enter a video idea first.");
            } else {
                Toast.makeText(MainActivity.this, "Button is working!", Toast.LENGTH_SHORT).show();
            }
        });

        setContentView(root);
    }
}
