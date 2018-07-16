package applicationcli;

import SessionBean.MySessionBeanRemote;
import javax.ejb.EJB;

public class Main {

    @EJB
    private static MySessionBeanRemote mySessionBean;    
    
    public static void main(String[] args) {
        
        String prenom = null;
        prenom = mySessionBean.getPrenom("Madani");
        
        System.out.println("Votre prénom: " + prenom);
    }

}
