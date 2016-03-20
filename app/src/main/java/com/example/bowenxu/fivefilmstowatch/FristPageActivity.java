package com.example.bowenxu.fivefilmstowatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FristPageActivity extends AppCompatActivity {

    private Button buttonNext1;
    private Button buttonPrevious1;
    private Button buttonTrailor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist_page);

        buttonNext1 = (Button) findViewById(R.id.buttonNext1);
        buttonNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(), SecondPageActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonPrevious1 = (Button) findViewById(R.id.buttonPrevious1);
        buttonPrevious1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(), CoverActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonTrailor1 = (Button) findViewById(R.id.buttonTrailor1);
        buttonTrailor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage1 = Uri.parse("http://www.imdb.com/title/tt2080374/?ref_=nv_sr_1");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(webIntent);
            }
        });
    }
}
