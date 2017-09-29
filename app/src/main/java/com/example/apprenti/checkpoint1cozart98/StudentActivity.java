package com.example.apprenti.checkpoint1cozart98;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        TextView nom = (TextView) findViewById(R.id.textViewNom);
        TextView prenom = (TextView) findViewById(R.id.textViewPrenom);
        TextView ecole = (TextView) findViewById(R.id.textViewEcole);
        TextView langage = (TextView) findViewById(R.id.textViewLanguage);


        String firstName = getIntent().getStringExtra("nom");
        String name = getIntent().getStringExtra("prenom");
        String school = getIntent().getStringExtra("ecole");
        String language = getIntent().getStringExtra("langage");

        nom.setText(firstName);
        prenom.setText(name);
        ecole.setText(school);
        langage.setText(language);
    }
}

