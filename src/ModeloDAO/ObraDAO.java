
package ModeloDAO;

import Modelo.Obra;
import java.util.ArrayList;

/**
 *Interface que será implementada pela que classe que será responsável por alterar o Banco de Dados para as ações referentes as Obras
 * @author Kyllder, Pedro e Thiago
 */
public interface ObraDAO {
    
    /**
     * Método que irá inserir uma Obra no Banco de Dados
     * @param u a obra a ser adicionadaco de Dados
     */
    void InsereObra(Obra u);

    /**
     * Método que irá deletar uma Obra no Banco de Dados
     * @param u a obra a ser removida de Dados
     */
    void DeletarObra(Obra u);

    /**
     * Método que irá atualizar uma Obra no Banco de Dados
     * @param u a Obra depois de ser alterado
     */
    void UpdateObra(Obra u);

    /**
     * Método que irá retornar o Cod para a Obra
     * @return Int - código da Obra
     */
    int getCod();
   
    /**
     * Método que irá mostrar uma Obra por meio de uma palavra-chave
     * @param pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    ArrayList<Obra> BuscarObras(String pesquisa);

    /**
     *Método que irá mostrar todas as Obras cadastradas no Banco de Dados
     * @return ArrayList
     */
    ArrayList<Obra> ListaObras();  
}
