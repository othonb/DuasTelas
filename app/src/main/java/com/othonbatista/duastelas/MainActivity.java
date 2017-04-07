package com.othonbatista.duastelas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void buttonPrincipalClick (View v) {
        setContentView(R.layout.activity_secondary);
    }

    public void buttonSecundarioClick (View v) {
        setContentView(R.layout.activity_main);
    }
}
