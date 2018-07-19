
package ejb;

import javax.ejb.Remote;


@Remote
public interface MySessionBeanRemote {
    
    boolean ConnectMedecin(String login, String password);
    
    boolean ConnectLaborantin(String login, String password);

    void DemandeAnalyse(String patient, String[] analyses);

    String RecupererPatient();

    void AjouterPatient(String Nom, String Prenom);


    
}
