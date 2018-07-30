/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyse;

import javax.ejb.Local;

/**
 *
 * @author Windows10
 */
@Local
public interface SessionBeanAnalyseLocal {
    
    int getReference();
    void AddAnalyse(Analyse a);
   // void ConnectTopic();

    
}
