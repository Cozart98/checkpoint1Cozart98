package com.example.apprenti.checkpoint1cozart98;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by apprenti on 29/09/17.
 */

public class StudentModel implements Parcelable {
    //attributs ci-dessous.

    private String nom;
    private String prenom;
    private String classe;
    private String langage;

    //constructeur à portée public ci-dessous.

    public StudentModel(String toString, String s, String nom, String prenom) {

        //intialisation des attributs ci-dessous.

        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.langage = langage;
    }

    // Getter ci-dessous.

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getClasse() {
        return classe;
    }

    public String getLangage() {
        return langage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i)  {

        dest.writeString(nom);
        dest.writeString(prenom);
        dest.writeString(classe);
        dest.writeString(langage);

    }

    public static final Parcelable.Creator<StudentModel> CREATOR = new Parcelable.Creator<StudentModel>() {

        @Override
        public StudentModel createFromParcel(Parcel source) {
            return new StudentModel(source);
        }

        @Override
        public StudentModel[] newArray(int i) {
            return new StudentModel[0];
        }

    };

    public StudentModel(Parcel in) {
        this.nom = in.readString();
        this.prenom = in.readString();
        this.classe = in.readString();
        this.langage = in.readString();


    }
}
