package com.example.pz9_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (Button)findViewById(R.id.button2);
        sw.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        Intent in = new Intent(this, MainActivity2.class);
        startActivity(in);
    }
}