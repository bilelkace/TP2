/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

import java.util.List;

/**
 *
 * @author Bilel
 */
public class SystemeGestionEtudiants {
    
   
    
    
   private List<Etudiant> etudiants;

    public SystemeGestionEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
     public List<Etudiant> getList() {
        return this.etudiants;
}
     public void SetList(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
        
}
     
     public void ajouterEtudiant(String nom, String prenom, int Ninscrit, String email){
          Etudiant E1 = new Etudiant (nom ,prenom , Ninscrit ,email) ;
         
          
        etudiants.add(E1);
    }
     public void afficherEtudiant (){
         for (Etudiant E : etudiants) {
             System.out.println(E.toString() );
             
         }
     }
     public void modifierEmailEtudiant (int Ninscrit , String nouvelEmail) {
         for (Etudiant E : etudiants){
          if ( E.getNinscrit()== Ninscrit){ 
             E.setEmail(nouvelEmail);} 
                  }
         
     }
     public void supprimerEtudiant (int numeroInscription){
              for (Etudiant E : etudiants){
          if ( E.getNinscrit()== numeroInscription){
              etudiants.remove(E) ;
          }}
     }
  }

