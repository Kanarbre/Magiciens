package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Victime m1 = new Monstre("Monstre 1",84);
        Victime m2 = new Monstre("Monstre 2",56);
        Victime m3 = new Monstre("Monstre 3",77);
        Victime m4 = new Monstre("Monstre 4",69);
        Victime m5 = new GnomeJardin("Gnome",19);
        Victime s1 = new NainJardin("Nain",24);
        Victime s2 = new Sorcier("Sorcier 2",40,Math.random());
        Victime s3 = new Sorcier("Sorcier 3",33,Math.random());
        Victime s4 = new Sorcier("Sorcier 4",49,Math.random());
        Victime s5 = new Magicien("Magicien",42,Math.random());

        Victime[] characterlist = {m1,m2,m3,m4,m5,s1,s2,s3,s4,s5};

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5+"\n");

        
        for(int i=0;i<100;i++){
            int index1 = (int) (Math.random()*10);
            while (index1==4||index1==5){
                index1 = (int) (Math.random()*10);
            };
            int index2 = (int) (Math.random()*10);
            while (index1==index2){
                index2 = (int) (Math.random()*10);
            }
            ((Personnage)characterlist[index1]).attaque(characterlist[index2]);
            System.out.println(characterlist[index1].getName()+" attaque "+characterlist[index2].getName()+"\n");
        }

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5+"\n");

    }
}
