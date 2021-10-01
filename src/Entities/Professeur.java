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
public class Professeur extends User{
    private String nci;
    private String grade;

    public Professeur() {
        this.role="ROLE_PROFESSEUR";
    }

    public Professeur(String nci, String grade, String nomComplet) {
        super(nomComplet);
        this.nci = nci;
        this.grade = grade;
        this.role="ROLE_PROFESSEUR";
    }

    public Professeur(String nci, String grade, int id, String nomComplet) {
        super(id, nomComplet);
        this.nci = nci;
        this.grade = grade;
        this.role="ROLE_PROFESSEUR";
    }

    public String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
    
}
