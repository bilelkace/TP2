/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author Bilel
 */
public class Livre {
     private String Titre ;
     private String Auteur ;
     public String AnnéePub ;
     public int ISBN ;

    
    public String toString() {
        return "Livre{" + "Titre=" + Titre + ", Auteur=" + Auteur + ", Ann\u00e9ePub=" + AnnéePub + ", ISBN=" + ISBN + '}';
    }

    public Livre(String Titre, String Auteur, String AnnéePub, int ISBN) {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.AnnéePub = AnnéePub;
        this.ISBN = ISBN;
    }

    public Livre(String Titre, String Auteur) {
        this.Titre = Titre;
        this.Auteur = Auteur;
    }

    public Livre(String Titre, String Auteur, String AnnéePub) {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.AnnéePub = AnnéePub;
    }
    public Livre() {
        this.Titre = "Titre";
        this.Auteur = "Auteur";
        this.AnnéePub = "AnnéePub";
    }
    
     
     
    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }

    public void setAnnéePub(String AnnéePub) {
        this.AnnéePub = AnnéePub;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
     
     
    public String getTitre() {
        return Titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public String getAnnéePub() {
        return AnnéePub;
    }

    public int getISBN() {
        return ISBN;
    }
     
     
     
     
     
}
