
package Utilitario;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.microsoft.*;
/**
 * Classe onde se faz a conexão com o Banco de Dados(postgresql) e onde também fecha a mesma
 * @author Kyllder, Pedro e Thiago
 */
public class Conexao {
/**
 * Método que retorna uma conexão
 * @return Connection
 */
    public static Connection getConnection() {
        try {
        	String ConectionString="jdbc:sqlserver://lpo-serve.database.windows.net:1433;database=lpo-biblioteca;user=kyllder-admin@lpo-serve;password={your_password_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            Connection con = DriverManager.getConnection("jdbc:sqlserver://lpo-serve.database.windows.net:1433;database=lpo-biblioteca;user=kyllder-admin@lpo-serve;password=lpoteste@123;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
            return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }/**
     * Método que fecha somente a connection
     * @param con a Connection a ser fechada
     */
    public static void closeConnection(Connection con){
        
          
               
                    try {
                         if (con!=null) {
                             con.close();
                         }
                    } catch (SQLException ex) {
                        Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            
      }
    /**
     * Método que fecha a connection e o Statement
     * @param con a Connection a ser fechada
     * @param stm o Statement a ser fechado
     */
    public static void closeConnection(Connection con,Statement stm){
        closeConnection(con);
        try {
            if (stm!=null) {
                stm.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * Método que fecha a connection,o Statement e o ResultSet
     * @param con a Connection a ser fechada
     * @param stm o Statement a ser fechado
     * @param rs o ResultSet a ser fechado
     */
    public static void closeConnection(Connection con,Statement stm,ResultSet rs){
        closeConnection(con,stm);
        try {
            if (rs!=null) {
                rs.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}