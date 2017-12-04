package com.example.luishi.cancionero;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class cancionActivity extends AppCompatActivity
{
    private String nom;
    private MediaPlayer mp;
    private TextView cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cancion);

        nom = getIntent().getExtras().getString("cate");
        selecLetra();
    }

    public void selecLetra()
    {
         cambio = findViewById(R.id.letra);

        switch (nom)
        {
            case "Bolivia":
                cambio.setText(R.string.himnoNacional);
                break;
            case "laPaz":
                cambio.setText(R.string.laPaz);
                break;
            case "cocha":
                cambio.setText(R.string.cocha);
                break;
            case "santaCruz":
                cambio.setText(R.string.santaCruz);
                break;
            case "laPatria":
                cambio.setText(R.string.laPatria);
                break;
            case "colorados":
                cambio.setText(R.string.colorados);
        }

    }

    public void play(View view)
    {
        mp = MediaPlayer.create(this, R.raw.bolivia);
        switch (nom)
        {
            case "Bolivia":
                mp =  MediaPlayer.create(this, R.raw.bolivia);
                break;
            case "laPaz":
                mp =  MediaPlayer.create(this, R.raw.lapaz);
                break;
            case "cocha":
                mp =  MediaPlayer.create(this, R.raw.cocha);
                break;
            case "santaCruz":
                mp =  MediaPlayer.create(this, R.raw.santacruz);
                break;
            case "laPatria":
                mp =  MediaPlayer.create(this, R.raw.lapatria);
                break;
            case "colorados":
                mp =  MediaPlayer.create(this, R.raw.colorados);
        }
        mp.start();
    }
    public void pause(View view)
    {
        mp.pause();
    }
}
