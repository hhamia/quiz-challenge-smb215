package com.example.skynete10.quiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView title=(TextView)findViewById(R.id.welcome);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "Jonquilles.ttf");
        title.setTypeface(custom_font);
    }
}
