package com.example.apprenti.checkpoint1cozart98;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by apprenti on 29/09/17.
 */

public class StudentModel implements Parcelable {
    //attributs ci-dessous.

    private String nom;
    private String prenom;
    private String ecole;
    private String langage;

    //constructeur à portée public ci-dessous.

    public StudentModel(String nom, String prenom, String ecole,String langage ) {

        //intialisation des attributs ci-dessous.

        this.nom = nom;
        this.prenom = prenom;
        this.ecole = ecole;
        this.langage = langage;
    }

    // Getter ci-dessous.

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEcole() {
        return ecole;
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
        dest.writeString(ecole);
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
        this.ecole = in.readString();
        this.langage = in.readString();


    }
}
