package com.example.skynete10.quiz;

import android.content.Intent;
import android.graphics.Typeface;
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
        TextView title=(TextView)findViewById(R.id.welcome);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "Jonquilles.ttf");
        title.setTypeface(custom_font);
        Button signButton=(Button)findViewById(R.id.signup);
        Button loginButton=(Button)findViewById(R.id.login);
        signButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {

                Intent i1 = new Intent(getApplicationContext(),Login.class);
                startActivity(i1);
            }
        });
    }
}
