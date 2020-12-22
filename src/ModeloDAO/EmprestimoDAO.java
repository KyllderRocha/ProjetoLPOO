
package ModeloDAO;

import Classes.Emprestimo;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *Interface que será implementada pela que classe que será responsável por alterar o Banco de Dados para as ações referentes aos Emprétimos
 * @author Kyllder, Pedro e Thiago
 */
public interface EmprestimoDAO {
    
    /**
     *Método que fará um Novo Empréstimo
     * @param u o novo Empréstimo
     */
    void NovoEmprestimo(Emprestimo u);
    /**
     * Método que fará a Devolução
     * @param u o emprestimo a ser devolvido
     * @param a a data do dia devolvido
     */
    void Devolucao(Emprestimo u,Calendar a );

    /**
     *Método que irá verificar se a determinada cópia está disponível
     * @param nome o nome do livro
     * @param copias o numero de copias do livro
     * @return boolean - Se a cópia está disponível
     */
    boolean CopiaDisponivel(String nome,int copias);
  
    /**
     *Procura um Empréstimo, a partir de uma pesquisa, que ainda não foi devolvido
     * @param pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    ArrayList<Emprestimo> BuscarEmprestimosN(String pesquisa);
    /**
     *Procura um ou mais Empréstimos, a partir de uma pesquisa, que já foi devolvido
     * @param pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    ArrayList<Emprestimo> BuscarEmprestimosD(String pesquisa);

    /**
     *Lista todos os Empréstimos que ainda não foram devolvidos
     * @return ArrayList
     */
    ArrayList<Emprestimo> ListaEmprestimosN();
    
    /**
     * Lista todos os Empréstimos que foram devolvidos
     * @return ArrayList
     */
    ArrayList<Emprestimo> ListaEmprestimosD();
}
