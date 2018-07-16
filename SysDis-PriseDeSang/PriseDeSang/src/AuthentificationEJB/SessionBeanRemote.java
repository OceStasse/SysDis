package AuthentificationEJB;

import javax.ejb.Remote;

@Remote
public interface SessionBeanRemote {

    boolean Authentification(String plogin);
    
}
