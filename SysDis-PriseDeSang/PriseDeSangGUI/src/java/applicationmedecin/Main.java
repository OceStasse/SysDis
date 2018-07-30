package applicationmedecin;

import ejb.MySessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

public class Main {

    @Resource(mappedName = "jms/myTopic")
    private static Topic myTopic;

    @Resource(mappedName = "jms/myTopicFactory")
    private static ConnectionFactory myTopicFactory;

    @Resource(mappedName = "jms/myQueue")
    private static Queue myQueue;

    @Resource(mappedName = "jms/myQueueFactory")
    private static ConnectionFactory myQueueFactory;

    
    @EJB
    private static MySessionBeanRemote mySessionBean1;
    
    public static void main(String[] args) {
        
        boolean connect = mySessionBean1.ConnectMedecin("oceane", "tutu");
        
        System.out.println("Connection : " + connect);
        
    }

    private Message createJMSMessageForjmsMyQueue(Session session, Object messageData) throws JMSException {
        // TODO create and populate message to send
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.toString());
        return tm;
    }

    private void sendJMSMessageToMyQueue(Object messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = myQueueFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(myQueue);
            messageProducer.send(createJMSMessageForjmsMyQueue(session, messageData));
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    private Message createJMSMessageForjmsMyTopic(Session session, Object messageData) throws JMSException {
        // TODO create and populate message to send
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.toString());
        return tm;
    }

    private void sendJMSMessageToMyTopic(Object messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = myTopicFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(myTopic);
            messageProducer.send(createJMSMessageForjmsMyTopic(session, messageData));
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

}
