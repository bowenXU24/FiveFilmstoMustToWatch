package com.example.bowenxu.fivefilmstowatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondPageActivity extends AppCompatActivity {



    private Button buttonNext2;
    private Button buttonPrevious2;
    private Button buttonTrailor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);


        buttonNext2 = (Button) findViewById(R.id.buttonNext2);
        buttonNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(), ThridPageActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonPrevious2 = (Button) findViewById(R.id.buttonPrevious2);
        buttonPrevious2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frameIntent = new Intent(getBaseContext(),FristPageActivity.class);
                startActivity(frameIntent);
            }
        });

        buttonTrailor2 = (Button) findViewById(R.id.buttonTrailor2);
        buttonTrailor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage1 = Uri.parse("www.imdb.com/title/tt3011894/?ref_=nv_sr_1");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage1);
                startActivity(webIntent);
            }
        });
    }
}
