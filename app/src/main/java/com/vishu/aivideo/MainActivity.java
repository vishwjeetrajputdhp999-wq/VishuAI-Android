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
        title.setTextSize(30);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 30);

        TextView subtitle = new TextView(this);
        subtitle.setText("Create videos from your text");
        subtitle.setTextSize(18);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 0, 0, 30);

        EditText prompt = new EditText(this);
        prompt.setHint("Write your video idea here...");
        prompt.setGravity(Gravity.TOP);
        prompt.setMinLines(6);
        prompt.setPadding(25, 25, 25, 25);

        Button create = new Button(this);
        create.setText("CREATE VIDEO");
        create.setTextSize(16);

        TextView status = new TextView(this);
        status.setText("");
        status.setTextSize(16);
        status.setPadding(0, 30, 0, 0);
        status.setGravity(Gravity.CENTER);

        create.setOnClickListener(v -> {
            String text = prompt.getText().toString().trim();

            if (text.isEmpty()) {
                status.setText("Please enter a video idea.");
            } else {
                status.setText(
                    "Your prompt is ready!\\n\\n" +
                    "AI video generation will be connected next."
                );
            }
        });

        root.addView(title);
        root.addView(subtitle);
        root.addView(prompt,
            new LinearLayout.LayoutParams(
                -1, 0, 1
            ));
        root.addView(create);
        root.addView(status);

        setContentView(root);
    }
}
