package Controller;

import Classes.Emprestimo;
import Modelo.Usuarios;
import ModeloDAO.EmprestimoDAOImp;
import View.TelaAddEmprestimo;
import View.TelaDevedores;
import View.TelaDevolucao;
import View.TelaDivida;
import View.TelaVisualizarEmprestimos;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * O Controller irá servir como ligação entre o DAO e a View
 * @author Kyllder, Pedro e Thiago
 */
public class ControllerEmprestimo {
    /**
    * Atributo para usar as ações relacionadas ao Banco de Dados
    */
    private EmprestimoDAOImp dao = new EmprestimoDAOImp();
   /**
     *Método que fará um Novo Empréstimo
     * @param e o Emprestimo a ser inserido
     */
    public void Adcionar(Emprestimo e){
        dao.NovoEmprestimo(e);
    }/**
     * Método que fará a Devolução
     * @param e o Emprestimo a ser removido 
     * @param c a data da devolução
     */
    public void Remover(Emprestimo e,Calendar c){
        dao.Devolucao(e,c);
    }
  /**
     *Procura um Empréstimo, a partir de uma pesquisa, que ainda não foi devolvido
     * @param pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    public ArrayList<Emprestimo> BuscarN(String pesquisa){
        return dao.BuscarEmprestimosN(pesquisa);
    }
    /**
     *Procura um ou mais Empréstimos, a partir de uma pesquisa, que já foi devolvido
     * @param pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    public ArrayList<Emprestimo> BuscarD(String pesquisa){
        return dao.BuscarEmprestimosD(pesquisa);
    }
    /**
     *Lista todos os Empréstimos que ainda não foram devolvidos
     * @return ArrayList 
     */
    public ArrayList<Emprestimo> ListarN(){
        return dao.ListaEmprestimosN();
    }
     /**
     * Lista todos os Empréstimos que foram devolvidos
     * @return ArrayList
     */
    public ArrayList<Emprestimo> ListarD(){
        return dao.ListaEmprestimosD();
    }
    /**
     *Método que irá verificar se a determinada cópia está disponível
     * @param nome da Obra
     * @param copias copias da Obra
     * @return boolean - Se a cópia está disponível
     */
    public boolean CopiaDisponivel(String nome, int copias){
        return dao.CopiaDisponivel(nome,copias);
    }
    /**
     * Método que irá chamar a TelaAddEmprestimo
     * @param Admin o nome do Administrador ue esta realizando o Emprestimo
     * @see TelaAddEmprestimo
     */
    public void TelaAdcionar(String Admin){
        TelaAddEmprestimo add = new TelaAddEmprestimo(Admin);
        add.setVisible(true);
    }
    /**
     * Método que irá chamar a TelaDevolução
     * @see TelaDevolucao
     */
    public void TelaRemover(){
        TelaDevolucao deletar = new TelaDevolucao();
        deletar.setVisible(true);
    }
   /**
    * Método que irá chamar a TelaVisualizar
    * @see TelaVisualizarEmprestimos
    */
    public void TelaVisualizar(){
        TelaVisualizarEmprestimos v = new TelaVisualizarEmprestimos();
        v.setVisible(true);
    }
    /**
     * Método que irá chamar TelaDívida
     * @param parent o JFrame pai da nova Tela
     * @param modal se quer continuar com o modelo
     * @param divida a divida dele
     * @param u o Usuário que esta devendo
     * @see TelaDivida
     */
    public void TelaDivida(java.awt.Frame parent, boolean modal,double divida,Usuarios u){
        TelaDivida td = new TelaDivida(parent,modal,divida, u);
        td.setVisible(true);
    }
    /**
     * Método que irá chamar a TelaDevedores
     * @see TelaDevedores
     */
    public void TelaDevedores(){
        TelaDevedores td = new TelaDevedores();
        td.setVisible(true);
    }
}
