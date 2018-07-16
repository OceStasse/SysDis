
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Session;
import javax.jms.Topic;

public class Main {

    @Resource(mappedName = "jms/myTestTopic")
    private static Topic myTestTopic;

    @Resource(mappedName = "jms/myTestTopicFactory")
    private static ConnectionFactory myTestTopicFactory;

    //@EJB
   // private static SessionBeanTestRemoteRemote sessionBeanTestRemote;
    
    private static Connection connection = null;
    private static Session session = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }

}
