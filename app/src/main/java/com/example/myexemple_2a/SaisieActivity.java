package com.example.myexemple_2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SaisieActivity extends AppCompatActivity {

    private EditText txtNewTaux;
    private EditText txtNewDevise;
    private Object btRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);

        this.txtNewDevise = (EditText) findViewById(R.id.newDevise);
        this.txtNewTaux = (EditText) findViewById(R.id.newTaux);
        this.btRetour = (Button) findViewById(R.id.btRetour);
    }
}