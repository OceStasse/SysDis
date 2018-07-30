/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Windows10
 */
@Stateless
public class EJBPatient implements EJBPatientLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public List<Patient> getPatients()
    {
        return null;
    }
    
    @Override
    public void AddPatient(Patient p)
    {
        
    }
    @Override
    public void UpdatePatient(Patient p)
    {
        
    }
}
