package com.example.apprenti.checkpoint1cozart98;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button send = (Button) findViewById(R.id.buttonEnvoyer);
        final EditText nom = (EditText) findViewById(R.id.editNom);
        final EditText prenom = (EditText) findViewById(R.id.editPrenom);
        final EditText ecole = (EditText) findViewById(R.id.editEcole);
        final EditText langage = (EditText) findViewById(R.id.editLangage);



        final Intent intent = new Intent(MainActivity.this, StudentActivity.class);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nom.getText().toString().isEmpty() ||
                    prenom.getText().toString().isEmpty() ||
                    ecole.getText().toString().isEmpty() ||
                    langage.getText().toString().isEmpty()){


                    Toast.makeText(MainActivity.this, getResources().getString
                            (R.string.toast_champ_vide), Toast.LENGTH_SHORT).show();

                }else {

                    StudentModel studentModel = new StudentModel(nom.getText().toString(),
                            prenom.getText().toString(), ecole.getText().toString(),langage.getText().toString());
                    intent.putExtra("nom", studentModel.getNom());
                    intent.putExtra("prenom",studentModel.getPrenom() );
                    intent.putExtra("ecole", studentModel.getEcole());
                    intent.putExtra("langage", studentModel.getLangage());
                    startActivity(intent);
                }
            }
        });
    }
}