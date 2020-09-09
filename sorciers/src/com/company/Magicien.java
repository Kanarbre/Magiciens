package com.company;

public class Magicien extends Sorcier implements Superpouvoir{

    public Magicien(String nom,int points_de_vie,double pouvoir){
        super(nom,points_de_vie,pouvoir);
    }

    public double getPouvoir(){
        return this.power*this.extra;
    }

    public double sort(){
        return Math.random()*this.getPouvoir();
    }

    public int subitCharme(int damage){
        return (int)this.sort()*damage;
    }
}


