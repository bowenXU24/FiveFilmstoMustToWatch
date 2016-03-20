package com.example.bowenxu.fivefilmstowatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthPageActivity extends AppCompatActivity {


    private Button buttonNext5;
    private Button buttonPrevious5;
    private Button buttonTrailor5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);


        buttonNext5 = (Button) findViewById(R.id.buttonNext5);
        buttonNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(), CoverActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonPrevious5 = (Button) findViewById(R.id.buttonPrevious5);
        buttonPrevious5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(),ForthPageActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonTrailor5 = (Button) findViewById(R.id.buttonTrailor5);
        buttonTrailor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage1 = Uri.parse("http://www.imdb.com/title/tt1392190/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(webIntent);
            }
        });

    }




}
