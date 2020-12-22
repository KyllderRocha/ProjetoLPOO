
package ModeloDAO;

import Classes.Administradores;
import java.util.ArrayList;

/**
 *Interface que será implementada pela que classe que será responsável por alterar o Banco de Dados para as ações referentes ao Administrador
 * @author Kyllder, Pedro e Thiago
 */
public interface AdministradoresDao {
    /**
     * Insere no Banco de Dados um Administrador
     * @param u , o Administrador que será inserido
     */
    void InsereAdmin(Administradores u);
    /**
     * Deleta no Banco de Dados as informações de um Administrador
     * @param u ,Administrador que será deletado
     */
    void DeletarAdmin(Administradores u);  /**
     * Atualiza no Banco de Dados as informações de um Administrador
     * @param u , o Administrador depois de ser alterado
     * @param cpf, o cpf dele antes de ser alterado
     */
    
    void UpdateAdmin(Administradores u,String cpf);
    /**
     * Verifica se as credencias do Administrador estão corretas e cria um objeto do tipo Administradores
     * @param nome , o nome do Administrador
     * @param senha , a senha do Administrador
     * @return Administradores
     */
    Administradores VerificarAdmin(String nome,String senha);
    
    
   /**
    * Pesquisa um ou mais administradores através de uma palavra-chave
    * @param pesquisa , o que vai ser pesquisado
    * @return ArrayList o resultado da busaca de Administradores
    */
    ArrayList<Administradores> BuscarAdministradores(String pesquisa);
    /**
     * Mostra todos o Administradores registrados no Banco
     * @return  ArrayList A lista de Administradores
     */
    ArrayList<Administradores> ListaAdministradores();  
}