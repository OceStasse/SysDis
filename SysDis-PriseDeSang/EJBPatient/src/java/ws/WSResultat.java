package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "WSResultat")
@Stateless()
public class WSResultat 
{
    /**
     * Récupère l'analyse demandé par le patient
     * @param reference
     * @return 
     */
    @WebMethod(operationName = "getAnalyse")
    public String getAnalyse(@WebParam(name = "reference") int reference) {
        //TODO write your implementation code here:
        return null;
    }
}
