package com.company;

public class NainJardin implements Victime{
    protected String name;
    protected int hardness;
    protected boolean broken;

    public NainJardin(String nom,int solidité){
        this.name = nom;
        this.hardness = solidité;
        this.broken = false;
    }

    public String toString() {
        return broken ? this.name + " est cassé." : this.name + " est intact.";
    }

    public String getName() {
        return this.name;
    }

    public int subitFrappe(int damage){
        if (damage>=hardness){
            this.broken = true;
            return -hardness;
        }
        else{
            return -damage;
        }
    }

    public int subitCharme(int damage){
        return -1;
    };
}
