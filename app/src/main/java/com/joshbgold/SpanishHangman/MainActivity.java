package com.joshbgold.SpanishHangman;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

/**
 * Created by JoshG on 4/28/2015.
 */
public class MainActivity extends Activity{

    private Button verbsButton;
    private Button commonWordsButton;
    private Button statsButton;
    private Button exitButton;

    private int wordListChoice = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        verbsButton = (Button) findViewById(R.id.verbsButton);
        commonWordsButton = (Button) findViewById(R.id.commonWordsButton);
        statsButton = (Button) findViewById(R.id.statsButton);
        exitButton = (Button) findViewById(R.id.exitButton);


        //start game with verbs
        View.OnClickListener verbs = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGameWithVerbs();
            }
        };

        //start game with common words
        View.OnClickListener commonWords = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGameWithCommonWords();
            }
        };

        View.OnClickListener estadisticas = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openStats();
            }
        };

        //exit the application when exit button is pressed
        View.OnClickListener salida = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        };

        verbsButton.setOnClickListener(verbs);
        commonWordsButton.setOnClickListener(commonWords);
        statsButton.setOnClickListener(estadisticas);
        exitButton.setOnClickListener(salida);

    }


    void startGameWithVerbs() {
        //value of zero means to use verb word list
        wordListChoice = 0;
        savePrefs("choice", wordListChoice);
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);
    }

    void startGameWithCommonWords(){
        //value of one means to use common words list
        wordListChoice = 1;
        savePrefs("choice", wordListChoice);
        Intent intent = new Intent(MainActivity.this, GameActivity.class);
        startActivity(intent);
    }

    void openStats(){
        Intent intent = new Intent (MainActivity.this, statsActivity.class);
        startActivity(intent);
    }

    //save prefs
    public void savePrefs(String key, int value){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }
}
