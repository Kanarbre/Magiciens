package com.company;

public class Sorcier extends Personnage {

    protected double power;

    public Sorcier(String nom,int points_de_vie,double pouvoir){
        super(nom,points_de_vie);
        this.power = pouvoir;
    }

    public void attaque(Victime cible){
            if (!this.mort()){
                this.addVie(cible.subitCharme(this.getVie()/2));
            }
        }

    public double getPouvoir(){
        return this.power;
    }


    public int subitFrappe(int damage){
        this.addVie(-damage);
        return this.mort()? 0:(int) (-this.getVie()*this.getPouvoir());

    }

    public int subitCharme(int damage){
        return 0;
    }
}


