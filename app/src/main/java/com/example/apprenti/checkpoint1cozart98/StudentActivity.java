package com.example.apprenti.checkpoint1cozart98;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.DatePickerDialog;


public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        TextView tvNom = (TextView) findViewById(R.id.textViewNom);
        TextView tvPrenom = (TextView) findViewById(R.id.textViewPrenom);
        TextView tvEcole = (TextView) findViewById(R.id.textViewEcole);
        TextView tvLanguage = (TextView) findViewById(R.id.textViewLanguage);

        String nom = getIntent().getStringExtra("nom");
        String prenom = getIntent().getStringExtra("prenom");
        String ecole = getIntent().getStringExtra("ecole");
        String langage = getIntent().getStringExtra("langage");

        StudentModel model = getIntent().getExtras().getParcelable("parcel");







    }
}

