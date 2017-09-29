package com.example.apprenti.checkpoint1cozart98;

import android.content.Intent;
import android.os.Parcelable;
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

        Button bouton = (Button) findViewById(R.id.buttonEnvoyer);
        final EditText editNom = (EditText) findViewById(R.id.editNom);
        final EditText editPrenom = (EditText) findViewById(R.id.editPrenom);
        final EditText editEcole = (EditText) findViewById(R.id.editEcole);
        final EditText editLangage = (EditText) findViewById(R.id.editLangage);



        if(editNom.equals("") || (editPrenom.equals("")) ||
                editEcole.equals("") || editLangage.equals("")){

            Toast.makeText(getApplicationContext(), getResources().getString
                    (R.string.toast_champ_vide), Toast.LENGTH_SHORT).show();

        }else{

            editNom.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                }
            });



           editPrenom.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public void onFocusChange(View view, boolean b) {


           editEcole.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                                @Override
                                public void onFocusChange(View view, boolean b) {

            editLangage.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                                        @Override
                                        public void onFocusChange(View view, boolean b) {


            bouton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                    startActivity(intent);

                    String nom = editNom.getText().toString();
                    String prenom = editPrenom.getText().toString();
                    String ecole = editEcole.getText().toString();
                    String langage = editLangage.getText().toString();

                    intent = new Intent();
                    intent.putExtra("nom", nom);
                    intent.putExtra("prenom", prenom);
                    intent.putExtra("ecole", ecole);
                    intent.putExtra("langage", langage);

                    StudentModel model = new StudentModel(
                    editNom.getText().toString(),editPrenom.getText().toString(),
                            editEcole.getText().toString(),editLangage.getText().toString());

                    intent.putExtra("parcel", (Parcelable) model);







                }
            });
        }




    }
}
