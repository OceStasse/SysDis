package DataBaseUtilities;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import static java.sql.ResultSet.CONCUR_READ_ONLY;
import static java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseUtilities {

    public static int SQL = 2;
    
    private int typeConnection;
    private String nameConnection;
    private String login;
    private String motdepasse;
    private Connection con;
    private Statement instruc;
    
    public DataBaseUtilities(String plogin, String pmotdepasse, String ip, int port) throws ClassNotFoundException, Exception {
        String tmpCon;
        String nomDB = "prisedesang";
        this.typeConnection = SQL;
        
        //nameConnection = "org.gjt.mm.mysql.Driver";
        nameConnection = "com.mysql.jdbc.Driver";
        
        // Connexion
        login = plogin;
        motdepasse = pmotdepasse;
        
        tmpCon = "jdbc:mysql://"+ip+":"+port+"/"+nomDB;
        Class.forName(nameConnection);
        System.out.println("Driver loaded successfully!");
        con = DriverManager.getConnection(tmpCon, plogin, pmotdepasse);
        con.setAutoCommit(false);
        System.out.println("Connection established!");
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Query / update + Execute ">
    // Executer la requête
    public ResultSet query(String pquery) throws SQLException
    {
        return instruc.executeQuery(pquery);
    }
    
    // Mise à jour
    public int update(String pupdate) throws SQLException
    {
        return instruc.executeUpdate(pupdate);
    }
    
    public boolean execute(String pupdate) throws SQLException
    {
        return instruc.execute(pupdate);
    }
    //</editor-fold >
    
    // Avoir la liste des patients
    public <T> List getList(Class c){
        List<T> list = new LinkedList<>();
            
        try {
            int number = getNbr();
            int j=1;
            ResultSet rs;
            rs = query("SELECT * FROM patient");
            rs.next();
            for(int i=0; i<number; i++){
                T tmp = (T) c.newInstance();
                j=1;
                for(Field f : tmp.getClass().getFields()){
                    //System.out.println("t"+f.get(tmp));
                    f.set(tmp, rs.getObject(j));
                    j++;
                }
                rs.next();
                list.add(tmp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DataBaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DataBaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public <T> int getNbr(){
        int nbr=0;
        
        ResultSet rs;
        try {
            rs = query("SELECT count(*) FROM patient");
            rs.next();
            nbr = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nbr;
    }
    
    // Ferme la connection à la base de données.
    public synchronized void disconnect() {
        if(this.con != null){
            try{
                this.con.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        this.con = null;
    }
    
}
