package com.company;

public class GnomeJardin extends NainJardin implements Superpouvoir {

    public GnomeJardin(String nom, int solidité) {
        super(nom, solidité);
    }

    public double sort(){
        return -Math.random()*this.hardness;
    }

    public int subitCharme(int damage){
        return this.sort()>damage ? -damage:-1;
    }

}