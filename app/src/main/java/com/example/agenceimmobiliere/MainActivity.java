package com.example.agenceimmobiliere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.agenceimmobiliere.databinding.ActivityMainBinding;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    private ActivityMainBinding binding;
    private Appartement appartement;
    private Vendeur vendeur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonValiderAppart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adresse = binding.mainTextAdresse.getText().toString();
                String cp = binding.mainTextCodePostal.getText().toString();
                String ville = binding.mainTextVille.getText().toString();
                String Etage = binding.mainTextEtage.getText().toString();
                vendeur = new Vendeur("Ismail", "Ndiaye", "ism.ndi@johndoe.fr", "06 12 34 56 78");
                appartement = new Appartement(adresse, ville, cp, vendeur, Etage);
                Intent myIntent = new Intent(getApplicationContext(), DetailActivity.class);
                //Toast.makeText(MainActivity.this, kitVoyage.toString(), Toast.LENGTH_LONG);
                myIntent.putExtra("appartement", (Serializable) appartement);
                startActivity(myIntent);
            }
        });
        });
    }
}