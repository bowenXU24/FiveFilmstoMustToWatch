package com.example.bowenxu.fivefilmstowatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForthPageActivity extends AppCompatActivity {

    private Button buttonNext4;
    private Button buttonPrevious4;
    private Button buttonTrailor4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_page);

        buttonNext4 = (Button) findViewById(R.id.buttonNext4);
        buttonNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(), FifthPageActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonPrevious4 = (Button) findViewById(R.id.buttonPrevious4);
        buttonPrevious4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(),ThridPageActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonTrailor4 = (Button) findViewById(R.id.buttonTrailor4);
        buttonTrailor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage1 = Uri.parse("http://www.imdb.com/title/tt2402927/?ref_=nv_sr_1");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(webIntent);
            }
        });



    }
}
