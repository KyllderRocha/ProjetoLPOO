package Controller;

import Modelo.Usuarios;
import ModeloDAO.UsuariosDAOImp;
import View.TelaAddUsuario;
import View.TelaDeletarUsuarios;
import View.TelaEditarU;
import View.TelaEditarUsuario;
import View.TelaVisualizarUsuarios;
import java.util.ArrayList;
   
/**
 * O Controller serve como ligação entre o DAO e o View
 * @author Kyllder, Pedro e Thiago
 */
public class ControllerUsuario {
    /**
    * Atributo para usar as ações relacionadas ao Banco de Dados
    */
    private UsuariosDAOImp dao= new UsuariosDAOImp();
    /**
     *Método que irá atualizar um Usuário no Banco de Dados
     * @param u o Usuário já alterado
     * @param cpf o cpf do Usuário antes de alterar
     */
    public void Editar(Usuarios u,String cpf){
        dao.UpdateUsuario(u, cpf);
    }
    /**
     *Método que irá inserir um Usuário no Banco de Dados
     * @param u o Usuário a ser adicionado
     */
    public void Adcionar(Usuarios u){
        dao.InsereUsuario(u);
    }
    /**
     *Método que irá deletar um Usuário no Banco de Dados
     * @param u Usuário a ser deletado
     */
    public void Remover(Usuarios u){
        dao.DeletarUsuario(u);
    }
    /**
     * Método que irá mostrar um ou mais Usuários por meio de uma palavra-chave
     * @param pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    public ArrayList<Usuarios> Buscar(String pesquisa){
        return dao.BuscarUsuarios(pesquisa);
    }
    /**
     *Método que irá mostrar todas os Usuários cadastrados no Banco de Dados
     * @return ArrayList
     */
    public ArrayList<Usuarios> Listar(){
        return dao.ListaUsuarios();
    }/**
     * Método que irá chamar a TelaAddUsuario
     * @see TelaAddUsuario
     */
    public void TelaAdcionar(){
        TelaAddUsuario add = new TelaAddUsuario();
        add.setVisible(true);
    }/**
     * Método que irá chamar a TelaDeletarUsuarios
     * @see TelaDeletarUsuarios
     */
    public void TelaRemover(){
        TelaDeletarUsuarios deletar = new TelaDeletarUsuarios();
        deletar.setVisible(true);
    }/**
     * Método que irá chamar a TelaEditarUsuario
     * @see TelaEditarUsuario
     */
    public void TelaEditar(){
        TelaEditarUsuario e = new TelaEditarUsuario();
        e.setVisible(true);
    }/**
     * Método que irá chamar TelaU
     * @param u o Usuário que se quer alterar
     * @param model se quer continuar com o modelo
     * @param pai a JFrame pai da tela
     * @see TelaEditarU
     */
    public void TelaU(Usuarios u,boolean model,java.awt.Frame pai){
        TelaEditarU editar = new TelaEditarU (pai, model,u);
        editar.setVisible(true);
        
    }/**
     * Método que irá chamar TelaVisualizarUsuarios
     * @see TelaVisualizarUsuarios
     */
    public void TelaVisualizar(){
        TelaVisualizarUsuarios v = new TelaVisualizarUsuarios();
        v.setVisible(true);
    }
}
