package com.company;

public abstract class Personnage implements Victime{
    protected String name;
    protected int hp;

    public Personnage(String nom,int points_de_vie){
        this.name = nom;
        this.hp = points_de_vie;
    }

    public String toString() {
        return hp > 0 ? "Je m'appelle " + this.name + " et j'ai " + this.hp + " points de vie." : this.name + " est mort.";
    }

    public String getName() {
        return this.name;
    }

    public int getVie() {
        return this.hp;
    }

    public boolean mort() {
        return this.hp <= 0;
    }

    public void addVie(int ajouter) {
        this.hp+= ajouter;
    }

    public abstract void attaque(Victime cible);

    public abstract int subitFrappe(int damage);

    public abstract int subitCharme(int damage);
}
