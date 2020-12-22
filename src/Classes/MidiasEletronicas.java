package Classes;

import Modelo.Obra;

/**
 * Classe MidiasEletronicas, implementado por obra
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public class MidiasEletronicas implements Obra{

        /**Uma String que armazena o nome da Midia Eletronica*/
        private String nome;
        /**Uma String que armazena o assunto da Midia Eletronica*/
        private String assunto;
        /**Um inteiro que armazena o codigo da Midia Eletronicav*/
        private final int codigo;
        /**Uma String que armazena o autor da Midia Eletronica*/
        private String autor;
        /**Um inteiro que armazena a quantidade de cópias da Midia Eletronica*/
        private int copias;
        /**Uma String que armazena o tipo de Midia Eletronica*/
        private final String tipo;
/**
* Construtor da classe
     * @param nome o nome da Midia
     * @param autor o autor da Midia
     * @param assunto o assunto da Midia
     * @param tipo o tipo da Midia
     * @param copias a quantidade de copias da Midia
     * @param codigoMidia o código da Midia
*/

public MidiasEletronicas(String nome,String autor, String assunto, String tipo,int copias, int codigoMidia){
this.nome = nome;
this.autor = autor;
this.assunto = assunto;
this.tipo = tipo; 
this.codigo= codigoMidia;
this.copias=copias;
}
/**
* Metodo para retorno do nome da MidiaEletronica
* @return o nome 
*/
@Override
public String getNome() {
return nome;
}
/**
* Metodo para modificar o nome da MidiaEletronica
* @param nome o novo nome
*/
@Override
public void setNome(String nome) {
this.nome = nome;
}
/**
     * Metodo para retorno do Autor da MidiaEletronica
     * @return o autor
     */
@Override
public String getAutor() {
return autor;
}
/** 
* Metodo para modificar o Autor da MidiaEletronica
* @param autor novo nome do autor
*/
@Override
public void setAutor(String autor) {
this.autor = autor;
}
/**
     * Metodo para retorno do Assunto da MidiaEletronica
     * @return o assunto
     */
@Override
public String getAssunto() {
return assunto;
}
/** 
* Metodo para modificar o Assunto da MidiaEletronica
* @param assunto novo assunto
*/
@Override
public void setAssunto(String assunto) {
this.assunto = assunto;
}
/**
     * Metodo para retorno do tipo da MidiaEletronica
     * @return o tipo
     */
@Override
public String getTipo() {
return tipo;
}
/**
     * Metodo para retorno do codigo da MidiaEletronica
     * @return o código
     */
@Override
public int getCod() {
return codigo;
}
/** 
* Metodo para modificar a Editora da MidiaEletronica
* @param editora nova editora
*/
    @Override
    public void setEditora(String editora) {
    }
    /**
     * Metodo para retorno da Editora da MidiaEletronica
     * @return a editora
     */
    @Override
    public String getEditora() {
        return null;
    }
    /** 
* Metodo para modificar o Genero da MidiaEletronica
* @param genero o novo gênero
*/
    @Override
    public void setGenero(String genero) {
        
    }
    /**
     * Metodo para retorno do Genero da MidiaEletronica
     * @return o gênero
     */
    @Override
    public String getGenero() {
         return null;
    }
    /** 
* Metodo para modificar o numero das MidiaEletronicas
* @param numero novo numero
*/
    @Override
    public void setNumero(String numero) {
       
    }
    /**
     * Metodo para retorno do numero das MidiaEletronicas
     * @return o numero
     */
    @Override
    public String getNumero() {
         return null;
    }
    /**
     * Metodo para retorno das copias das MidiaEletronicas
     * @return a quantidade de cópias
     */
    @Override
    public int getCopias() {
        return copias;
    }
    /**
* Metodo para modificar o numero de copias das MidiaEletronicas
* @param n nova quantidade de cópias
*/

    @Override
    public void setCopias(int n) {
        this.copias=n;
    }

}