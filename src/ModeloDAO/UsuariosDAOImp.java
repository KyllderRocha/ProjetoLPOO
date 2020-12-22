package ModeloDAO;

import Classes.UsuarioCom;
import Classes.UsuarioFunc;
import Classes.UsuarioNormal;
import Modelo.Usuarios;
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
 *Classe que implementa UsuariosDAO e que irá executar os códigos relacionados com o Banco de Dados
 * @author Kyllder, Pedro e Thiago
 */
public class UsuariosDAOImp implements UsuariosDAO{
     /**
     * Atributo do pacote Utilitário referente a classe Connection
     * @see Conexao
     */
    private Connection con=null;
    
   
    @Override
     /**
     *Método que irá inserir um Usuário no Banco de Dados
     * @param u
     */
    public void InsereUsuario(Usuarios u) {
        con=Conexao.getConnection();
        PreparedStatement stmt=null;
        try {
            stmt=con.prepareStatement("Insert into cliente (nome,cpf,rg,telefone,endereco,tipo,divida) values (?,?,?,?,?,?,?)");
            stmt.setString(1,u.getNome());
             stmt.setString(2,u.getCPF());
             stmt.setString(3,u.getRG());
             stmt.setString(4,u.getTelefone());
             stmt.setString(5,u.getEndereco());
             stmt.setString(6,u.getTipo());
             stmt.setDouble(7,u.getDivida());
             stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
        
    }

    @Override
    /**
     *Método que irá deletar um Usuário no Banco de Dados
     * @param u
     */
    public void DeletarUsuario(Usuarios u) {
        con=Conexao.getConnection();
        PreparedStatement stmt=null;
        try {
            stmt=con.prepareStatement("DELETE FROM cliente WHERE cpf like '"+u.getCPF()+"'");
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }

    @Override
    /**
     *Método que irá atualizar um Usuário no Banco de Dados
     * @param u
     * @param cpf
     */
    public void UpdateUsuario(Usuarios u,String cpf) {
         con=Conexao.getConnection();
         PreparedStatement stmt=null;
         try {
            stmt=con.prepareStatement("UPDATE cliente SET nome = ?,cpf = ?,rg = ?,telefone = ?,endereco = ?,tipo =?,divida=? WHERE cpf like '"+cpf+"'");
            stmt.setString(1,u.getNome());
                 stmt.setString(2,u.getCPF());
                 stmt.setString(3,u.getRG());
                 stmt.setString(4,u.getTelefone());
                 stmt.setString(5,u.getEndereco());
                 stmt.setString(6,u.getTipo());
                 stmt.setDouble(7,u.getDivida());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }

    
    @Override
    /**
     * Método que irá mostrar um ou mais Usuários por meio de uma palavra-chave
     * @param pesquisa
     * @return ArrayList
     */
    public ArrayList<Usuarios> BuscarUsuarios(String pesquisa) {
        con =getConnection();
        ArrayList<Usuarios> array= new ArrayList();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String aux;
        Usuarios a=null;
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome like '%"+pesquisa+"%' "
                            + "or cpf like '%"+pesquisa+"%' "
                            + "or rg like '%"+pesquisa+"%' "
                            + "or endereco like '%"+pesquisa+"%'"
                            + "or tipo like '%"+pesquisa+"%' ORDER BY nome ASC");
            rs = stmt.executeQuery();
            while (rs.next()) {                
                aux=rs.getString("tipo");
                if (aux.equals("Normal")) {
                    a=new UsuarioNormal(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getDouble("divida"));
                }else if(aux.equals("Comerciario")){
                    a=new UsuarioCom(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getDouble("divida"));
                }else if(aux.equals("Funcionario")){
                    a=new UsuarioFunc(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getDouble("divida"));
                }
                
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
     *Método que irá mostrar todas os Usuários cadastrados no Banco de Dados
     * @return ArrayList
     */
    public ArrayList<Usuarios> ListaUsuarios() {
        con=getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        String aux;
        ArrayList<Usuarios> array=new ArrayList();
        Usuarios a=null;
        try {
            
            stmt=con.prepareStatement("SELECT * FROM cliente ORDER BY nome ASC");
           rs= stmt.executeQuery();
           
            while (rs.next()) {    
                
                aux=rs.getString("tipo");
                if (aux.equals("Normal")) {
                    a=new UsuarioNormal(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getDouble("divida"));
                }else if(aux.equals("Comerciario")){
                    a=new UsuarioCom(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getDouble("divida"));
                }else if(aux.equals("Funcionario")){
                    a=new UsuarioFunc(rs.getString("nome"),rs.getString("cpf"),rs.getString("rg"),rs.getString("telefone"),rs.getString("endereco"),rs.getDouble("divida"));
                }
                
                array.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return array;
        }
    }

    
    }
    
    

