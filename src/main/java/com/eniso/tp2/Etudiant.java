/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author Bilel
 */
public class Etudiant {

    private String nom;
    private String prenom;
    private int Ninscrit;
    private String email;

    public Etudiant(String nom, String prenom, int Ninscrit, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.Ninscrit = Ninscrit;
        this.email = email;
        
        
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNinscrit() {
        return Ninscrit;
    }

    public void setNinscrit(int Ninscrit) {
        this.Ninscrit = Ninscrit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
          return "Nom=" + this.nom + "prenom="+this.prenom + "NumInscript="+this.Ninscrit +"Email="+this.email ;
         
       }
}   

