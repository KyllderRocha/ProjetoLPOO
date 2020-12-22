
package ModeloDAO;


import Classes.Emprestimo;
import Utilitario.Conexao;
import static Utilitario.Conexao.closeConnection;
import static Utilitario.Conexao.getConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *Classe que implementa EmpretimosDao e que irá executar os códigos relacionados com o Banco de Dados
 * @author Kyllder, Pedro e Thiago
 */
public class EmprestimoDAOImp implements EmprestimoDAO {
    /**
     * Atributo do pacote Utilitário referente a classe Connection
     * @see Conexao
     */
    Connection con;
    
    @Override
    /**
     *Método que fará um Novo Empréstimo
     * @param u
     */
    public void NovoEmprestimo(Emprestimo u) {
        con=Conexao.getConnection();
        PreparedStatement stmt=null;
        Date a=null;
        try {
            stmt=con.prepareStatement("Insert into Emprestimo (NomeUser,NomeAdmin,NomeObra,dtPrevista,dtEmp) values (?,?,?,?,?)");
             stmt.setString(1,u.getNomeUser());
             stmt.setString(2,u.getNomeAdmin());
             stmt.setString(3,u.getNomeObra());
             a = new Date(u.getDtPrevista().getTimeInMillis());
             stmt.setDate(4,a);
              a = new Date(u.getDtEmp().getTimeInMillis());
             stmt.setDate(5,a);
             stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }    
    }
    @Override
    /**
     * Método que fará o registro da Devolução
     * @param u
     * @param a
     */
    public void Devolucao(Emprestimo u,Calendar b) {
        con=Conexao.getConnection();
        PreparedStatement stmt=null;
        Date a=null;
        try {
            stmt=con.prepareStatement("Insert into EmprestimoD (NomeUser,NomeAdmin,NomeObra,dtPrevista,dtReal,dtEmp) values (?,?,?,?,?,?)");
             stmt.setString(1,u.getNomeUser());
             stmt.setString(2,u.getNomeAdmin());
             stmt.setString(3,u.getNomeObra());
             a = new Date(u.getDtPrevista().getTimeInMillis());
             stmt.setDate(4,a);
             a = new Date(b.getTimeInMillis());
             stmt.setDate(5,a);
              a = new Date(u.getDtEmp().getTimeInMillis());
             stmt.setDate(6,a);
             stmt.executeUpdate();
            stmt=con.prepareStatement("DELETE FROM Emprestimo WHERE NomeUser like '"+u.getNomeUser()+"' and NomeAdmin like '"+u.getNomeAdmin()+"' and NomeObra like '"+u.getNomeObra()+"'"); 
             stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }

    @Override
    /**
     *Procura um ou mais Empréstimos, a partir de uma pesquisa, que ainda não foi devolvido
     * @param pesquisa
     * @return ArrayList
     */
    public ArrayList<Emprestimo> BuscarEmprestimosN(String pesquisa) {
        
        con=getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        ArrayList<Emprestimo> array=new ArrayList();
        Emprestimo a=null;
        Calendar b=null,c=null,d=null;
        try {
            
           stmt=con.prepareStatement("SELECT * FROM Emprestimo WHERE NomeUser like '%"+pesquisa+"%' or NomeAdmin like '%"+pesquisa+"%' or NomeObra like '%"+pesquisa+"%' ORDER BY NomeUser ASC");
           rs= stmt.executeQuery();
           
            while (rs.next()) {    
                Date date = rs.getDate("dtPrevista");
                Calendar cal = new GregorianCalendar();
                cal.setTime(date);
                b=cal;
                date = rs.getDate("dtEmp");
                cal = new GregorianCalendar();
                cal.setTime(date);
                d=cal;
                a = new Emprestimo(rs.getString("NomeUser"),rs.getString("NomeAdmin") , rs.getString("NomeObra"),b,c,d);
                array.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return array;
        }       
    }

    @Override
    /**
     *Procura um Empréstimo, a partir de uma pesquisa, que já foi devolvido
     * @param pesquisa
     * @return ArrayList
     */
    public ArrayList<Emprestimo> BuscarEmprestimosD(String pesquisa) {
       con=getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        ArrayList<Emprestimo> array=new ArrayList();
        Emprestimo a=null;
        Calendar b=null,c=null,d=null;
        try {
            
            stmt=con.prepareStatement("SELECT * FROM EmprestimoD WHERE NomeUser like '%"+pesquisa+"%' or NomeAdmin like '%"+pesquisa+"%'or NomeObra like '%"+pesquisa+"%' ORDER BY NomeUser ASC");
           rs= stmt.executeQuery();
           
            while (rs.next()) {    
                Date date = rs.getDate("dtPrevista");
                Calendar cal = new GregorianCalendar();
                cal.setTime(date);
                b=cal;
                date = rs.getDate("dtReal");
                cal = new GregorianCalendar();
                cal.setTime(date);
                c=cal;
                date = rs.getDate("dtEmp");
                cal = new GregorianCalendar();
                cal.setTime(date);
                d=cal;
                a = new Emprestimo(rs.getString("NomeUser"),rs.getString("NomeAdmin") , rs.getString("NomeObra"),b,c,d);
                array.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return array;
        }       
    
    }

    
    @Override
     /**
     *Lista todos os Empréstimos que ainda não foram devolvidos
     * @return ArrayList
     */
    public ArrayList<Emprestimo> ListaEmprestimosN() {
        con=getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        ArrayList<Emprestimo> array=new ArrayList(); 
        Calendar b = null,c = null,d = null;
        Emprestimo a =null;
        try {
            
            stmt=con.prepareStatement("SELECT * FROM Emprestimo ORDER BY NomeUser ASC");
           rs= stmt.executeQuery();
           
            while (rs.next()) {
                Date date = rs.getDate("dtPrevista");
                Calendar cal = new GregorianCalendar();
                cal.setTime(date);
                b=cal;
                date = rs.getDate("dtEmp");
                cal = new GregorianCalendar();
                cal.setTime(date);
                d=cal;
                a = new Emprestimo(rs.getString("NomeUser"),rs.getString("NomeAdmin") , rs.getString("NomeObra"),b,c,d);
                array.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return array;
        }
    }
    
        @Override
        /**
     * Lista todos os Empréstimos que foram devolvidos
     * @return ArrayList
     */
        public ArrayList<Emprestimo> ListaEmprestimosD() {
        con=getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        ArrayList<Emprestimo> array=new ArrayList();
        Emprestimo a=null;
        Calendar b=null,c=null,d=null;
        try {
            
            stmt=con.prepareStatement("SELECT * FROM EmprestimoD ORDER BY NomeUser ASC");
           rs= stmt.executeQuery();
           
            while (rs.next()) {    
                Date date = rs.getDate("dtPrevista");
                Calendar cal = new GregorianCalendar();
                cal.setTime(date);
                b=cal;
                date = rs.getDate("dtReal");
                cal = new GregorianCalendar();
                cal.setTime(date);
                c=cal;
                date = rs.getDate("dtEmp");
                cal = new GregorianCalendar();
                cal.setTime(date);
                d=cal;
                a = new Emprestimo(rs.getString("NomeUser"),rs.getString("NomeAdmin") , rs.getString("NomeObra"),b,c,d);
                array.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return array;
        }       
    }   

    @Override
     /**
     *Método que irá verificar se a determinada cópia está disponível
     * @param nome
     * @param copias
     * @return boolean - Se a cópia está disponível
     */
    public boolean CopiaDisponivel(String nome, int copias) {
        con=getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        boolean a=true;
        try {
            
            stmt=con.prepareStatement("SELECT count(*) as copias FROM Emprestimo Where NomeObra like '"+nome+"'");
           rs= stmt.executeQuery();
            if (rs.next()) {
                if (rs.getInt(1)==copias) {
                a=false;
            }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return a;
        }
    }
}
