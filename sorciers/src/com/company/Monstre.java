package com.company;

public class Monstre extends Personnage{

    public Monstre(String nom,int points_de_vie){
        super(nom,points_de_vie);
    }

    public void attaque(Victime cible){
        if (!this.mort()){
            this.addVie(cible.subitFrappe(this.getVie()/2));
            }
        }


    public int subitFrappe(int damage){
        this.addVie(-damage);
        return this.mort()? 0:-this.getVie()/2;

    }

    public int subitCharme(int damage){
        this.addVie(-damage);
        return this.mort()? 0:+this.getVie()/2;
    }
}

