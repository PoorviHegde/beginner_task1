package com.example.mahe.buttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pooButton = (Button)findViewById(R.id.poobutton);

        pooButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView pootext = (TextView) findViewById(R.id.pootext);
                        pootext.setText("Hello There!");
                    }
                }
        );
    }
}