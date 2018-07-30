/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyse;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Connection;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.Topic;


@Stateless
public class SessionBeanAnalyse implements SessionBeanAnalyseLocal {

    @Resource(mappedName = "jms/myTopic")
    private Topic myTopic;

    @Inject
    @JMSConnectionFactory("java:comp/myTopicFactory")
    private JMSContext contextTopic;

    @Resource(mappedName = "jms/myQueue")
    private Queue myQueue;

    @Inject
    @JMSConnectionFactory("java:comp/myQueueFactory")
    private JMSContext contextQueue;

    
       
    @Override
    public int getReference()
    {
        
        return 0;
    }
    
    @Override
    public void AddAnalyse(Analyse a)
    {
        
    }

    private void sendJMSMessageToMyQueue(String messageData) {
        contextQueue.createProducer().send(myQueue, messageData);
    }

    private void sendJMSMessageToMyTopic(String messageData) {
        contextTopic.createProducer().send(myTopic, messageData);
    }

}
