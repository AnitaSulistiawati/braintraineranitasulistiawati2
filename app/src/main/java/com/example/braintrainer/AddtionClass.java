package com.example.braintrainer;

import android.widget.Button;
import android.widget.TextView;

@SuppressWarnings("ALL")
public class AddtionClass extends MainActivity{

    TextView question;
    TextView score;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    public Button playButton;

    @Override
    protected void onCreate(Budle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition_layout);
    }

    public Button getPlayButton() {
        return playButton;
    }

    public void setPlayButton(Button playButton) {
        this.playButton = playButton;
    }
}

