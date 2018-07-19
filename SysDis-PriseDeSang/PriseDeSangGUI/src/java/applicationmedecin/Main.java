package applicationmedecin;

import ejb.MySessionBeanRemote;
import javax.ejb.EJB;

public class Main {

    @EJB
    private static MySessionBeanRemote mySessionBean1;
    
    public static void main(String[] args) {
        
        boolean connect = mySessionBean1.ConnectMedecin("oceane", "tutu");
        
        System.out.println("Connection : " + connect);
        
        
    }

}
