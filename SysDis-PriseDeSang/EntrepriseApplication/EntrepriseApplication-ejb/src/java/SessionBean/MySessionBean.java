
package SessionBean;

import entities.Personne;
import java.security.Principal;
import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
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
    
    @Resource SessionContext ctx;
    
    @Override
    @RolesAllowed("arole")
    public String doIt (String p)
    {
        StringBuilder sb = new StringBuilder();
        if(ctx.isCallerInRole("arole"))
        {
            Principal callerPrincipal = ctx.getCallerPrincipal();
            if(callerPrincipal.getName().equals("oceane"))
            {
                sb.append("DEAR " + callerPrincipal.getName());
            }
        }
        
        sb.append("task done");
        return sb.toString();
    }

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
