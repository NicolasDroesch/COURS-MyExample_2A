package com.example.myexemple_2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SaisieActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNewTaux;
    private EditText txtNewDevise;
    private Button btRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);

        //correspondance entre objets prog et graphiques
        this.txtNewDevise = (EditText) findViewById(R.id.newDevise);
        this.txtNewTaux = (EditText) findViewById(R.id.newTaux);
        this.btRetour = (Button) findViewById(R.id.btRetour);

        //rendre le bouton cliquable
        this.btRetour.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btRetour)
        {
            String devise = this.txtNewDevise.getText().toString();
            String taux = this.txtNewTaux.getText().toString();
            //transfert des données à la page principale

            Intent unIntent = new Intent(this, MainActivity.class);
            unIntent.putExtra("taux", taux);
            unIntent.putExtra("devise", devise);

            this.startActivity(unIntent);
        }
    }
}