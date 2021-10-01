/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Entities.*;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface IService {
    void seConnecter();
    ArrayList<Classe> listerClasse();
    void ajouterClasse();
    void modifierClasse();
    void supprimerClasse();
    ArrayList listerClassesParProf();
    ArrayList<Professeur> listerProf();
    void ajouterProf();
    void affecterClasseProf();
    void affecterClasseEtudiant();    
    void listerEtudiantInscriParAnnee();
}
