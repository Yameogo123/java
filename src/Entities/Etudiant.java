/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author user
 */
public class Etudiant extends User{
    private String matricule;
    private String tuteur;

    public Etudiant() {
        this.role="ROLE_ETUDIANT";
    }

    public Etudiant(String matricule, String tuteur, String nomComplet) {
        super(nomComplet);
        this.matricule = matricule;
        this.tuteur = tuteur;
        this.role="ROLE_ETUDIANT";
    }

    public Etudiant(String matricule, String tuteur, int id, String nomComplet) {
        super(id, nomComplet);
        this.matricule = matricule;
        this.tuteur = tuteur;
        this.role="ROLE_ETUDIANT";
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
    
    
}
