
package Controller;

import Classes.Administradores;
import ModeloDAO.AdministradoresDAOImp;
import View.TelaAddAdmin;
import View.TelaDeletarAdmin;
import View.TelaEditarA;
import View.TelaEditarAdmin;
import View.TelaVisualizarAdmin;
import java.util.ArrayList;

/**
 * O Controller irá servir como ligação entre o DAO e o View
 * @author Kyllder, Pedro e Thiago
 */
public class ControllerAdmin {
   /**
    * Atributo para usar as ações relacionadas ao Banco de Dados
    */
    private AdministradoresDAOImp dao= new AdministradoresDAOImp();
    /**
     * Método para Atualizar um Administrador no Banco de Dados
     * @param a o Administrador depois de ser alterado
     * @param cpf  o cpf do Administrador antes de ser alterado
     */
    public void Editar(Administradores a,String cpf){
        dao.UpdateAdmin(a, cpf);
    }/**
     * Método para inserir um Administrador no Banco de Dados
     * @param a  o Administrador a ser inserido
     */
    public void Adcionar(Administradores a){
        dao.InsereAdmin(a);
    }
    /**
     * Método para deletar um Administrador no Banco de Dados
     * @param a o Administrador a ser removido
     */
    public void Remover(Administradores a){
        dao.DeletarAdmin(a);
    }
    /**
     * Método que verifica se as credencias do Administrador estão corretas e cria um objeto do tipo Administradores
     * @param nome o nme do Administrador
     * @param senha  senha do Administrador
     * @return o Administrador verificado
     */
    public Administradores Verificar(String nome,String senha){
       return dao.VerificarAdmin(nome, senha);
    }
    /**
    * Pesquisa um ou mais administradores através de uma palavra-chave
    * @param pesquisa o texto a ser pesquisado
    * @return ArrayList - Contendo o resultado dessa pesquisa
    */
    public ArrayList<Administradores> Buscar(String pesquisa){
        return dao.BuscarAdministradores(pesquisa);
    }/**
     * Mostra todos o Administradores registrados no Banco
     * @return  ArrayList - Contendo todos os Administradores registrados no Banco de Dados
     */
    public ArrayList<Administradores> Listar(){
        return dao.ListaAdministradores();
    }/**
     * Método que chama a tela "TelaAddAdmin"
     * @see TelaAddAdmin
     */
    public void TelaAdcionar(){
        TelaAddAdmin add = new TelaAddAdmin();
        add.setVisible(true);
    }/**
     * Método que chama a tela "TelaDeletarAdmin"
     * @see TelaDeletarAdmin
     */
    public void TelaRemover(){
        TelaDeletarAdmin deletar = new TelaDeletarAdmin();
        deletar.setVisible(true);
    }/**
     * Método que chama a tela "TelaEditarAdmin"
     * @see TelaEditarAdmin
     */
    public void TelaEditar(){
        TelaEditarAdmin e = new TelaEditarAdmin();
        e.setVisible(true);
    }
    
    /**
     * Método que chama a tela "TelaEditarA"
     * @param a o Administrador a ser alterado
     * @param model se quer continuar com model
     * @param pai o JFrame pai da janela
     * @see TelaEditarA
     */
    public void TelaA(Administradores a,boolean model,java.awt.Frame pai){
        TelaEditarA editar = new TelaEditarA(pai, model,a);
        editar.setVisible(true);
        
    }/**
     * Método que chama a tela "TelaVisualizarAdmin"
     * @see TelaVisualizarAdmin
     */
    public void TelaVisualizar(){
        TelaVisualizarAdmin v = new TelaVisualizarAdmin();
        v.setVisible(true);
    }
    
}
