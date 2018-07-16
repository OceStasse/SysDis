
package ejb;

import javax.ejb.Remote;


@Remote
public interface MySessionBeanRemote {

    void DemandeAnalyse(String patient, String[] analyses);

    String RecupererPatient();

    void AjouterPatient(String Nom, String Prenom);


    
}
