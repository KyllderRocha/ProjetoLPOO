
package ModeloDAO;

import Modelo.Usuarios;
import java.util.ArrayList;

/**
 *Interface que será implementada pela que classe que será responsável por alterar o Banco de Dados para as ações referentes ao Usuário
 * @author Kyllder, Pedro e Thiago
 */
public interface UsuariosDAO {

    /**
     *Método que irá inserir um Usuário no Banco de Dados
     * @param u o Usuário a ser adicionado
     */
    void InsereUsuario(Usuarios u);

   /**
     *Método que irá deletar um Usuário no Banco de Dados
     * @param u o Usuário a ser removido
     */
    void DeletarUsuario(Usuarios u);

    /**
     *Método que irá atualizar um Usuário no Banco de Dados
     * @param u o Usuário depois de ser alterado
     * @param cpf o cpf antes de ser alterado
     */
    void UpdateUsuario(Usuarios u,String cpf);
   /**
     * Método que irá mostrar um ou mais Usuários por meio de uma palavra-chave
     * @param Pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    ArrayList<Usuarios> BuscarUsuarios(String Pesquisa);
    /**
     *Método que irá mostrar todas os Usuários cadastrados no Banco de Dados
     * @return ArrayList
     */
    ArrayList<Usuarios> ListaUsuarios();      
}
