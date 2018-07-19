
package ejb;

import entities.Analyse;
import entities.Patient;
import static java.lang.System.exit;
import java.security.Principal;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Connection;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.jms.Topic;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


@Stateless
@DeclareRoles("arole")
public class MySessionBean implements MySessionBeanRemote {

//    @Resource(mappedName = "jms/AnalyseQueue")
//    private Topic myTestTopic;
//
//    @Inject
//    @JMSConnectionFactory("java:comp/myQueueConnectionFactory")
//    private JMSContext context;
    
    private static Connection connection = null;
    private static Session session = null;
    
    @Resource SessionContext ctx;
    
    private MessageProducer producer = null;
    private MessageConsumer consumer = null;

    @Override
    public void DemandeAnalyse(String patient, String[] analyses) {
        System.out.println("Patient: " + patient);
        System.out.println("analyses: " + analyses.toString());
        
        if(patient == null ){
            javax.swing.JOptionPane.showMessageDialog(null,"Le patient n'a pas été selectione! ");
            return;
        }
        
        if(analyses.length < 1){
            javax.swing.JOptionPane.showMessageDialog(null,"Il faut au moins une analyse! "); 
            return;
        }
        
        // ANALYSE
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EJBRemoteInterfacePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Analyse analyse = new Analyse();

        // if null => à checker 
        int i=0;
        while(i < analyses.length)
        {
            analyse.setItemAnalyse(analyses[i]);
            analyse.setValeur(3);

            em.persist(analyse);
            em.getTransaction().commit();
        }
        
        // récupérer l'id à communiquer + envoie sur la queue au laborantin
        
//        try {
//            connection = myQueueConnectionFactory.createConnection();
//            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//            connection.start();
//            
//        } catch (JMSException ex) {
//            Logger.getLogger(MySessionBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        

        em.close();
        emf.close();
           
    }

    @Override
    public String RecupererPatient() {
        
        String PatientList = null;
                
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EJBRemoteInterfacePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Query query = em.createNamedQuery("Patient.findAll");
        List<Patient> patients = query.getResultList();
       
        Iterator<Patient> iteratorPatient = patients.iterator();
        
        while(iteratorPatient.hasNext())
        {
            String Patient = iteratorPatient.next().toString();
            PatientList += Patient + "|";
            System.out.println("PatientList: " + PatientList);
                    
            
        }
        
        em.close();
        emf.close();
        
        return PatientList;
        
    }

    @Override
    public void AjouterPatient(String Nom, String Prenom) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EJBRemoteInterfacePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Patient patient = new Patient();

        patient.setNomPatient(Nom);
        patient.setPrenomPatient(Prenom);
        patient.setLoginPatient(Nom);

        em.persist(patient);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    @Override
    @RolesAllowed("arole")
    public boolean ConnectMedecin(String login, String password) 
    {
        if(ctx.isCallerInRole("arole"))
        {
            Principal callerPrincipal = ctx.getCallerPrincipal();
            if(callerPrincipal.getName().equals(login))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    @RolesAllowed("arole")
    public boolean ConnectLaborantin(String login, String password) 
    {
        return true;
    }
    
}
