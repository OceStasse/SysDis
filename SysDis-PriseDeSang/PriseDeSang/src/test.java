import entities.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class test {
 public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PriseDeSangPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        try
        {
            // Ajout d'un nouveau tuple dans la DB
            Patient p = new Patient();
            p.setNomPatient("Madani");
            p.setPrenomPatient("Mounawar");
            
            em.persist(p);
            
            Patient p2 = new Patient();
            p2.setNomPatient("Wagner");
            p2.setPrenomPatient("Jean-Marc");
            
            em.persist(p2);
              
            
            // Recherche d'une personne dans la BD
//            Patient p3 = em.find(Patient.class, 1);
//            
//            System.out.println("Nom: " + p3.getNomPatient());
//            
            em.getTransaction().commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally
        {
            em.close();
        }
    }
}
