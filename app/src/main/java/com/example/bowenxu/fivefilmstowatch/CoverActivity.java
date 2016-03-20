package com.example.bowenxu.fivefilmstowatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoverActivity extends AppCompatActivity {
    private Button buttonCover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);

        buttonCover  = (Button) findViewById(R.id.buttonCover);
        buttonCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(), FristPageActivity.class);
                startActivity(frameIntent);
            }
        });
    }
}
