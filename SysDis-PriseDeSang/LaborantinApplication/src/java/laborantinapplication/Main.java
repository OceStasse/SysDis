package laborantinapplication;

import ejb.MySessionBeanRemote;
import javax.ejb.EJB;

public class Main {

    @EJB
    private static MySessionBeanRemote mySessionBean;

    
    public static void main(String[] args) {
        boolean connect = mySessionBean.ConnectLaborantin("oceane", "tutu");
        System.out.println("[LABORANTIN] connect : " + connect);
    }

}
