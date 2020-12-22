
package ModeloDAO;

import Classes.Administradores;
import Utilitario.Conexao;
import static Utilitario.Conexao.closeConnection;
import static Utilitario.Conexao.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Classe que implementa AdministradoresDao e que irá executar os códigos relacionados com o Banco de Dados
 * @author Kyllder, Pedro e Thiago
 */
public class AdministradoresDAOImp implements AdministradoresDao {
    /**
     * Atributo do pacote Utilitário referente a classe Connection
     * @see Conexao
     */
    Connection con;
    @Override
    /**
     * Insere no Banco de Dados um Administrador
     * @param u 
     */
    public void InsereAdmin(Administradores u) {
        con=Conexao.getConnection();
        PreparedStatement stmt=null;
        try {
            stmt=con.prepareStatement("Insert into Admin (nome,cpf,rg,telefone,endereco,tipo,senha,users) values (?,?,?,?,?,?,?,?)");
            stmt.setString(1,u.getNome());
             stmt.setString(2,u.getCPF());
             stmt.setString(3,u.getRG());
             stmt.setString(4,u.getTelefone());
             stmt.setString(5,u.getEndereco());
             stmt.setString(6,u.getTipo());
             stmt.setString(7,u.getSenha());
             stmt.setString(8,u.getUser());
             stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }    
    }

    @Override
    /**
     * Deleta no Banco de Dados as informações de um Administrador
     * @param u 
     */
    public void DeletarAdmin(Administradores u) {
         con=Conexao.getConnection();
        PreparedStatement stmt=null;
        try {
            stmt=con.prepareStatement("DELETE FROM Admin WHERE cpf like '"+u.getCPF()+"'");
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }

    @Override
     /**
     * Atualiza no Banco de Dados as informações de um Administrador
     * @param u
     * @param cpf
     */
    public void UpdateAdmin(Administradores u, String cpf) {
         con=Conexao.getConnection();
         PreparedStatement stmt=null;
         try {
            stmt=con.prepareStatement("UPDATE Admin SET nome = ?,cpf = ?,rg = ?,telefone = ?,endereco = ?,tipo =?,senha=?,users=? WHERE cpf like '"+cpf+"'");
                 stmt.setString(1,u.getNome());
                 stmt.setString(2,u.getCPF());
                 stmt.setString(3,u.getRG());
                 stmt.setString(4,u.getTelefone());
                 stmt.setString(5,u.getEndereco());
                 stmt.setString(6,u.getTipo());
                 stmt.setString(7,u.getSenha());
                 stmt.setString(8,u.getUser());
                
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }

    @Override
    /**
    * Pesquisa um ou mais administradores através de uma palavra-chave
    * @param pesquisa
    * @return ArrayList
    */
    public ArrayList<Administradores> BuscarAdministradores(String pesquisa) {
        con =getConnection();
        ArrayList<Administradores> array= new ArrayList();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String aux;
        Administradores a=null;
        try {
            stmt = con.prepareStatement("SELECT * FROM Admin WHERE nome like '%"+pesquisa+"%' "
                            + "or cpf like '%"+pesquisa+"%' "
                            + "or rg like '%"+pesquisa+"%' "
                            + "or endereco like '%"+pesquisa+"%'"
                            + "or tipo like '%"+pesquisa+"%' ORDER BY nome ASC");
            rs = stmt.executeQuery();
            while (rs.next()) {                
                
                    a=new Administradores(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getString("senha"),rs.getString("users"),rs.getString("tipo"));
                
                
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
     * Mostra todos o Administradores registrados no Banco de Dados
     * @return  ArrayList
     */
    public ArrayList<Administradores> ListaAdministradores() {
       con=getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        ArrayList<Administradores> array=new ArrayList();
        Administradores a=null;
        try {
            
            stmt=con.prepareStatement("SELECT * FROM Admin ORDER BY nome ASC");
           rs= stmt.executeQuery();
           
            while (rs.next()) {    
                a=new Administradores(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getString("senha"),rs.getString("users"),rs.getString("tipo"));
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
     * Verifica se as credencias do Administrador estão corretas e criando um objeto do tipo Administradores
     * @param nome
     * @param senha
     * @return Administradores
     */
    public Administradores VerificarAdmin(String nome, String senha) {
       con =getConnection();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String aux;
        Administradores a=null;
        try {
            stmt = con.prepareStatement("SELECT * FROM Admin WHERE users like '"+nome+"' "
                            + "and senha like '"+senha+"' ");
            rs = stmt.executeQuery();
           
                
            if (rs.next()) {
               a=new Administradores(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getString("senha"),rs.getString("users"),rs.getString("tipo"));
            }else{
             a=new Administradores("n", "n", "n", "n", "n", "n", "n", "n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return a;
        }
    }
    
}
