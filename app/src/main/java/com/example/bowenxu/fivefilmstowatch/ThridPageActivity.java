package com.example.bowenxu.fivefilmstowatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThridPageActivity extends AppCompatActivity {
    private Button buttonNext3;
    private Button buttonPrevious3;
    private Button buttonTrailor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid_page);




            buttonNext3 = (Button) findViewById(R.id.buttonNext3);
    buttonNext3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent frameIntent = new Intent(getBaseContext(), ForthPageActivity.class);
            startActivity(frameIntent);
        }
    });

    buttonPrevious3 = (Button) findViewById(R.id.buttonPrevious3);
    buttonPrevious3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent frameIntent = new Intent(getBaseContext(),SecondPageActivity.class);
            startActivity(frameIntent);
        }
    });

    buttonTrailor3 = (Button) findViewById(R.id.buttonTrailor3);
    buttonTrailor3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri webpage1 = Uri.parse("http://www.imdb.com/title/tt1895587/?ref_=fn_al_tt_1");
            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage1);
            startActivity(webIntent);
        }
    });
}


    }

