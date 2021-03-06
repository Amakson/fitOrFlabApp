package com.example.anthonymakanju.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_PRAISE = "Praise";
    public static final String EXERCISE_CARDIO = "Cardio";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout praiseBtn = (RelativeLayout)findViewById(R.id.praiseBtn);
        RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);

            }
        });

        praiseBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadDetailActivity(MainActivity.EXERCISE_PRAISE);

            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);

            }
        });

    }

    private void loadDetailActivity(String exerciseTitle){
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }
}
