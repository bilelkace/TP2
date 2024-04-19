/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bilel
 */
public class TP2 {
    public static void main(String[]args ){
        

        List<Etudiant> etudiants = new ArrayList<>(); 
        
        SystemeGestionEtudiants G1 = new SystemeGestionEtudiants(etudiants) ;
        G1.ajouterEtudiant("ali", "bob", 0, "gmg@gmail.com");
        G1.ajouterEtudiant("ABdou", "KH", 0,"email" );
        G1.afficherEtudiant();
        
        G1.modifierEmailEtudiant(0, "a@a.com");
        G1.supprimerEtudiant(0);
    
    
    Livre L1 = new Livre ();
    Livre L2 = new Livre ("Titre" , "auteur" , "2002" , 225);
    Livre L3 = new Livre ("Titre3" , "auteur3");
    Livre L4 = new Livre ("Titre4" , "auteur4" , "2022" );
    
    System.out.println(L1.toString()) ;
    System.out.println(L2.toString()) ;
    System.out.println(L3.toString());
    System.out.println(L4.toString());
    
    }
}