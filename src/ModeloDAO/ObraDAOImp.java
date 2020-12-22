
package ModeloDAO;

import Classes.Artigo;
import Classes.Especificos;
import Classes.Livros;
import Classes.Manga;
import Classes.MidiasEletronicas;
import Classes.NormasTecnicas;
import Classes.Periodicos;
import Classes.Quadrinhos;
import Modelo.Obra;
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
 *Classe que implementa ObrasDAO e que irá executar os códigos relacionados com o Banco de Dados
 * @author Kyllder, Pedro e Thiago
 */
public class ObraDAOImp implements ObraDAO{
    /**
     * Atributo do pacote Utilitário referente a classe Connection
     * @see Conexao
     */
    Connection con;
    @Override
    /**
     * Método que irá inserir uma Obra no Banco de Dados
     * @param u
     */
    public void InsereObra(Obra u) {
        con=Conexao.getConnection();
        PreparedStatement stmt=null;
        try {
            stmt=con.prepareStatement("Insert into Obra (cod,nome,autor,assunto,editora,genero,numero,copias,tipo) values (?,?,?,?,?,?,?,?,?)");
             stmt.setInt(1,u.getCod());
             stmt.setString(2,u.getNome());
             stmt.setString(3,u.getAutor());
             stmt.setString(4,u.getAssunto());
             stmt.setString(5,u.getEditora());
             stmt.setString(6,u.getGenero());
             stmt.setString(7,u.getNumero());
             stmt.setInt(8,u.getCopias());
             stmt.setString(9,u.getTipo());
             stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }

    @Override
    /**
     * Método que irá deletar uma Obra no Banco de Dados
     * @param u
     */
    public void DeletarObra(Obra u) {
       con=Conexao.getConnection();
        PreparedStatement stmt=null;
        try {
            stmt=con.prepareStatement("DELETE FROM Obra WHERE cod ="+u.getCod());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    
    }

    @Override
    /**
     * Método que irá atualizar uma Obra no Banco de Dados
     * @param u
     */
    public void UpdateObra(Obra u) {
        con=Conexao.getConnection();
         PreparedStatement stmt=null;
         try {
            stmt=con.prepareStatement("UPDATE Obra SET nome = ?,autor = ?,assunto = ?,editora = ?,genero = ?,numero = ?,copias = ?,tipo = ? WHERE cod ="+u.getCod());
            
             stmt.setString(1,u.getNome());
             stmt.setString(2,u.getAutor());
             stmt.setString(3,u.getAssunto());
             stmt.setString(4,u.getEditora());
             stmt.setString(5,u.getGenero());
             stmt.setString(6,u.getNumero());
             stmt.setInt(7,u.getCopias());
             stmt.setString(8,u.getTipo());
             stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexao.closeConnection(con, stmt);
        }
    }

    @Override
    /**
     * Método que irá mostrar uma Obra por meio de uma palavra-chave
     * @param pesquisa
     * @return ArrayList
     */
    public ArrayList<Obra> BuscarObras(String pesquisa) {
        con =getConnection();
        ArrayList<Obra> array= new ArrayList();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Obra a=null;
        try {
            stmt = con.prepareStatement("SELECT * FROM Obra WHERE nome like '%"+pesquisa+"%' "
                            + "or autor like '%"+pesquisa+"%' "
                            + "or assunto like '%"+pesquisa+"%' "
                            + "or editora like '%"+pesquisa+"%'"
                            + "or tipo like '%"+pesquisa+"%'"
                            + "or genero like '%"+pesquisa+"%' ORDER BY nome ASC");
            rs = stmt.executeQuery();
            while (rs.next()) {                
                switch(rs.getString("tipo")){
                    case "Artigo":
                        a=new Artigo(rs.getString("nome"),rs.getString("assunto"),rs.getString("autor"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "Especificos":
                        a=new Especificos(rs.getString("nome"), rs.getString("assunto"), rs.getString("autor"),rs.getString("editora"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "Livro":
                        a=new Livros(rs.getString("nome"), rs.getString("assunto"), rs.getString("autor"),rs.getString("editora"), rs.getString("genero"),rs.getInt("copias"), rs.getInt("cod"));
                        break;    
                    case "Manga":
                        a=(Obra) new Manga( rs.getString("genero"),rs.getString("nome"), rs.getString("assunto"), rs.getString("editora"),rs.getString("autor"),rs.getInt("copias"), rs.getInt("cod"));
                        break;
                    case "Quadrinhos":
                        a= new Quadrinhos(rs.getString("nome"), rs.getString("assunto"), rs.getString("editora"),rs.getString("autor"),rs.getInt("copias"),rs.getInt("cod"));        
                        break;
                    case "DVD":
                        a = new MidiasEletronicas(rs.getString("nome"), rs.getString("autor"), rs.getString("assunto"),rs.getString("tipo"),rs.getInt("copias"),rs.getInt("cod"));         
                        break;
                    case "CD":
                         a = new MidiasEletronicas(rs.getString("nome"), rs.getString("autor"), rs.getString("assunto"),rs.getString("tipo"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "NormasTecnicas":
                        a = new NormasTecnicas(rs.getString("nome"),rs.getString("assunto"),rs.getString("numero"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "Periodicos":
                        a = new Periodicos(rs.getString("nome"), rs.getString("editora"), rs.getString("assunto"),rs.getString("numero"),rs.getInt("copias"),rs.getInt("cod"));
                        break;    
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
     *Método que irá mostrar todas as Obras cadastradas no Banco de Dados
     * @return ArrayList
     */
    public ArrayList<Obra> ListaObras() {
        con =getConnection();
        ArrayList<Obra> array= new ArrayList();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Obra a=null;
        try {
            stmt = con.prepareStatement("SELECT * FROM Obra ORDER BY nome ASC");
            rs = stmt.executeQuery();
            while (rs.next()) {                
                switch(rs.getString("tipo")){
                    case "Artigo":
                        a=new Artigo(rs.getString("nome"),rs.getString("assunto"),rs.getString("autor"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "Especificos":
                        a=new Especificos(rs.getString("nome"), rs.getString("assunto"), rs.getString("autor"),rs.getString("editora"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "Livro":
                        a=new Livros(rs.getString("nome"), rs.getString("assunto"), rs.getString("autor"),rs.getString("editora"),rs.getString("genero"),rs.getInt("copias"),rs.getInt("cod"));
                        break;    
                    case "Manga":
                        a=(Obra) new Manga( rs.getString("genero"),rs.getString("nome"), rs.getString("assunto"), rs.getString("editora"),rs.getString("autor"),rs.getInt("copias"), rs.getInt("cod"));
                        break;
                    case "Quadrinhos":
                        a= new Quadrinhos(rs.getString("nome"), rs.getString("assunto"), rs.getString("editora"),rs.getString("autor"),rs.getInt("copias"),rs.getInt("cod"));        
                        break;
                    case "DVD":
                        a = new MidiasEletronicas(rs.getString("nome"), rs.getString("autor"), rs.getString("assunto"),rs.getString("tipo"),rs.getInt("copias"),rs.getInt("cod"));         
                        break;
                    case "CD":
                         a = new MidiasEletronicas(rs.getString("nome"), rs.getString("autor"), rs.getString("assunto"),rs.getString("tipo"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "NormasTecnicas":
                        a = new NormasTecnicas(rs.getString("nome"),rs.getString("assunto"),rs.getString("numero"),rs.getInt("copias"),rs.getInt("cod"));
                        break;
                    case "Periodicos":
                        a = new Periodicos(rs.getString("nome"), rs.getString("editora"), rs.getString("assunto"),rs.getString("numero"),rs.getInt("copias"),rs.getInt("cod"));
                        break;    
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
     * Método que irá retornar o Cod para a Obra
     * @return Int - código da Obra
     */
    public int getCod() {
        con =getConnection();
        int cod=0;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT count(*) FROM Obra");
            rs = stmt.executeQuery();
            
            if (rs.next()) {
               cod=rs.getInt(1);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection(con, stmt, rs);
            return cod;
        }
    }
    
}
