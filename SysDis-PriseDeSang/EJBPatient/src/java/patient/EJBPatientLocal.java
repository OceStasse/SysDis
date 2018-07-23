package patient;

import java.util.List;
import javax.ejb.Local;


@Local
public interface EJBPatientLocal {
    List<Patient> getPatients();
    void AddPatient(Patient p);
    void UpdatePatient(Patient p);
}
