package com.example.braintrainer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button AdditionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdditionButton =  findViewById(R.id.butAddition);
    }

    public void goToAddition(View view){

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("chose difficulty");
        builder.setMessage("Chose your diffuculy");
        builder.setPositiveButton("Easy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent MyIntent = new Intent (MainActivity.this, AddtionClass.class);
                startActivity(MyIntent);
            }
        });
        builder.setNegativeButton("Easy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent2 = new Intent(MainActivity.this, AdditionHardClass.class);
                startActivity(intent2);
            }
        });

    }

    protected void onCreate(Budle savedInstanceState) {
    }
}