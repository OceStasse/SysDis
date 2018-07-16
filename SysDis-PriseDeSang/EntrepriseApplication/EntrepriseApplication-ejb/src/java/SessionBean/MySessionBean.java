
package SessionBean;

import entities.Personne;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Windows10
 */
@Stateless
public class MySessionBean implements MySessionBeanRemote {

    @PersistenceContext(unitName = "EntrepriseApplication-ejbPU")
    private EntityManager em;

    @Override
    public String getPrenom(String Nom) {
        
        
        //em.getTransaction().begin();
        
        Query query = em.createNamedQuery("Personne.findByNom");
        query.setParameter("nom", Nom);
        Personne p = (Personne)query.getSingleResult();
        
        //emf.close();
        //em.close();
        
        return p.getPrenom();
    }   

    public void persist(Object object) {
        em.persist(object);
    }
    
}
