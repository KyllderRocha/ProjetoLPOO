package Classes;

import Modelo.Obra;

/**
 * Classe NormasTecnicas, implementado por obra
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public class NormasTecnicas implements Obra{
        /**Uma String que armazena o nome da Norma Tecnica*/
        private String nome;
        /**Uma String que armazena o assunto da Norma Tecnica*/
        private String assunto;
        /**Um inteiro que armazena o codigo da Norma Tecnica*/
        private final int codigo;
        /**Uma String que armazena o numero da Norma Tecnica*/
        private String numero;
        /**Um inteiro que armazena a quantidade de cópias da Norma Tecnica*/
        private int copias;
/**
 * Construtor da classe
 * @param nome o nome da Norma
 * @param assunto o assunto da Norma
 * @param numero o número da Norma
 * @param copias a quantidade de cópias da Norma
 * @param codigo ocódigo da Norma
 */
public NormasTecnicas(String nome, String assunto, String numero,int copias ,int codigo){
this.nome = nome;
this.assunto = assunto;
this.codigo = codigo;
this.numero = numero;
this.copias = copias;
}
/**
     * Metodo para retorno do nome da NormaTecnica
     * @return o nome 
     */
@Override
public String getNome() {
return nome;
}
/**
* Metodo para modificar o nome da NormaTecnica
* @param nome o novo nome
*/
@Override
public void setNome(String nome) {
this.nome=nome;
}
/**
     * Metodo para retorno do assunto da NormaTecnica
     * @return o assunto
     */
@Override
public String getAssunto() {
return assunto;
}
/**
* Metodo para modificar o assunto da NormaTecnica
* @param assunto o novo assunto
*/
@Override
public void setAssunto(String assunto) {
this.assunto=assunto;
}
/**
     * Metodo para retorno do numero de NormasTecnicas
     * @return o número 
     */
@Override
public String getNumero() {
return numero;
}
/** 
* Metodo para modificar o numero de NormasTecnicas
* @param numero o novo número
*/
@Override
public void setNumero(String numero) {
this.numero = numero;
}
/**
     * Metodo para retorno do Autor de NormasTecnicas
     * @return o autor
     */

    @Override
    public String getAutor() {
        return null;
    }
    /** 
* Metodo para modificar o Autor de NormasTecnicas
* @param autor o nome do novo autor
*/
    @Override
    public void setAutor(String autor) {
        
    }
    /**
     * Metodo para retorno do tipo 
     * @return o tipo de Obra
     */
    @Override
    public String getTipo() {
        return "NormasTecnicas";
    }
    /**
     * Metodo para retorno do codigo da NormaTecnica 
     * @return o código
     */
    @Override
    public int getCod() {
        return codigo;
    }
    /** 
* Metodo para modificar a  Editora de NormasTecnicas
* @param editora a nova editora
*/
    @Override
    public void setEditora(String editora) {
       
    }
    /**
     * Metodo para retorno da Editora da NormaTecnica 
     * @return a editora
     */

    @Override
    public String getEditora() {
         return null;
    }
    /** 
* Metodo para modificar o Genero de NormasTecnicas
* @param genero o novo gênero
*/
    @Override
    public void setGenero(String genero) {
       
    }
    /**
     * Metodo para retorno do Genero da NormaTecnica 
     * @return o gênero
     */
    @Override
    public String getGenero() {
         return null;
    }
/**
 *  Metodo para retorno das copias de NormasTecnicas 
     * @return a quantidade de cópias
 */
    @Override
    public int getCopias() {
        return copias;
    }
/**
 * Metodo para modificar o numero de copias das NormasTecnicas
 *  @param n a nova quantidade de cópias
 */
    @Override
    public void setCopias(int n) {
        this.copias=n;
    }
}

