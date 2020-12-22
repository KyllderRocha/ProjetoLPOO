/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Obra;
import ModeloDAO.ObraDAOImp;
import View.TelaAddObra;
import View.TelaDeletarObra;
import View.TelaEditarO;
import View.TelaEditarObra;
import View.TelaVisualizarObras;
import java.util.ArrayList;

/**
 * O Controller serve como ligação entre o DAO e o View
 * @author Kyllder, Pedro e Thiago
 */
public class ControllerObra {
    /**
    * Atributo para usar as ações relacionadas ao Banco de Dados
    */
    private ObraDAOImp dao= new ObraDAOImp();
           /**
            * Método que irá editar uma Obra
            * @param o a Obra já alterada
            */ 
    public void Editar(Obra o){
        dao.UpdateObra(o);
    }
    /**
     * Método que irá adicionar uma Obra
     * @param o a Obra a ser adicionada
     */
    public void Adcionar(Obra o){
        dao.InsereObra(o);
    }/**
     * Método que irá Remover uma Obra
     * @param o  Obra a ser removida
     */
    public void Remover(Obra o){
        dao.DeletarObra(o);
    } /**
     * Método que irá mostrar uma Obra por meio de uma palavra-chave
     * @param pesquisa o texto a ser pesquisado
     * @return ArrayList
     */
    public ArrayList<Obra> Buscar(String pesquisa){
        return dao.BuscarObras(pesquisa);
    }/**
     *Método que irá mostrar todas as Obras cadastradas no Banco de Dados
     * @return ArrayList
     */
    public ArrayList<Obra> Listar(){
        return dao.ListaObras();
    }/**
     * Método que irá chama a TelaAddObra
     * @see TelaAddObra
     */
    public void TelaAdcionar(){
        TelaAddObra add = new TelaAddObra();
        add.setVisible(true);
    }/**
     * Método que irá chamar TelaDeletarObra
     * @see TelaDeletarObra
     */
    public void TelaRemover(){
        TelaDeletarObra deletar = new TelaDeletarObra();
        deletar.setVisible(true);
    }/**
     * Método que irá chamar a TelaEditarObra
     * @see TelaEditarObra
     */
    public void TelaEditar(){
        TelaEditarObra e = new TelaEditarObra();
        e.setVisible(true);
    }/**
     * Método que irá chamar a TelaEditar0
     * @param u a Obra que se quer alterar
     * @param model se quer continuar com o modelo  
     * @param pai o JFrame pai da tela
     * @see TelaEditarO
     */
    public void TelaO(Obra u,boolean model,java.awt.Frame pai){
        TelaEditarO editar = new TelaEditarO (pai, model,u);
        editar.setVisible(true);
        
    }/**
     * Método que irá chamar TelaVisualizarObras
     * @see TelaVisualizarObras
     * 
     */
    public void TelaVisualizar(){
        TelaVisualizarObras v = new TelaVisualizarObras();
        v.setVisible(true);
    }/**
     * Método que irá retornar o Cod para a Obra
     * @return Int - código da Obra
     */
    public int getCod(){
        return dao.getCod();
    }
    
}
