package com.example.myexemple_2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btEuros, btAc, btDevise, btApropos, btTaux;
    private EditText txtMontant;
    private float taux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEuros = (Button) findViewById(R.id.btEuros);
        btAc = (Button) findViewById(R.id.btAC);
        btDevise = (Button) findViewById(R.id.btDevise);
        btApropos = (Button) findViewById(R.id.btAPropos);
        btTaux = (Button) findViewById(R.id.btTaux);

        txtMontant = (EditText) findViewById(R.id.Montant);


        this.btTaux.setOnClickListener(this);
        this.btEuros.setOnClickListener(this);
        this.btAc.setOnClickListener(this);
        this.btApropos.setOnClickListener(this);
        this.btDevise.setOnClickListener(this);

        this.taux = (float) 6.56;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btTaux:
                break;
            case R.id.btEuros:
                {
                    float mt = 0;
                    try
                    {
                        mt = Float.parseFloat(this.txtMontant.getText().toString());
                        mt /= this.taux;
                        this.txtMontant.setText("" + mt);
                    }
                    catch(NumberFormatException exp)
                    {
                        Toast.makeText(this, "Erreur de saisie", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.btDevise:
                {
                    float mt = 0;
                    try
                    {
                        mt = Float.parseFloat(this.txtMontant.getText().toString());
                        mt *= this.taux;
                        this.txtMontant.setText("" + mt);
                    }
                    catch(NumberFormatException exp)
                    {
                        Toast.makeText(this, "Erreur de saisie", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.btAC:
                this.txtMontant.setText("");
                break;
            case R.id.btAPropos:
                Toast.makeText(this, "Convertiseur", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}