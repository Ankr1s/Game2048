package com.example.game2048test;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.game2048test.dbScores.ScoreDbHelper;


public class Menu  extends AppCompatActivity {


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ScoreDbHelper scoreDbHelper = new ScoreDbHelper(this,"scoreDb",null,1);
        SQLiteDatabase db = scoreDbHelper.getReadableDatabase();
        db.close();
        scoreDbHelper.close();

        Button start = findViewById(R.id.start_game_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,GameActivity.class));
            }
        });

        Button scores = findViewById(R.id.scores_button);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,ScoreManagement.class));
            }
        });

    }

}
