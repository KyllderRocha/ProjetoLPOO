
package Classes;




import Modelo.Obra;




/**
 * Classe Periodicos, implementado por obra
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */

public class Periodicos implements Obra{

        /**Uma String que armazena a editora do Periodico*/
        private String Editora;
        /**Uma String que armazena o nome do Periodico*/
        private String nome;
        /**Uma String que armazena o assunto do Periodico*/
        private String assunto;
        /**Um inteiro que armazena o codigo do Periodico*/
        private final int codigo;
        /**Uma String que armazena o número do Periodico*/
        private String numero;
        /**Um inteiro que armazena a quantidade de cópias do Periodico*/
        private int copias;

/**

* Construtor da classe
     * @param nome o nome do Periodico
     * @param editora a editora do Periodico
     * @param Assunto o assunto do Periodico
     * @param numero o numero do Periodico
     * @param copias a quantidade de copias do Periodico
     * @param cod o codigo do Periodico
*/

public Periodicos(String nome,String editora,String Assunto,String numero,int copias, int cod){

this.nome = nome;

this.numero = numero;

this.Editora=editora;

this.assunto=Assunto;

this.codigo= cod;

this.copias=copias;

}

/**

     * Metodo para retorno do nome do Periodico

     * @return o nome

     */
@Override
public String getNome() {

return nome;

}

/** 
* Metodo para modificar o nome do Periodico
* @param nome o novo nome
*/
@Override
public void setNome(String nome) {

this.nome = nome;

}

/**
     * Metodo para retorno do numero do Periodico
     * @return o numero
     */
@Override
public String getNumero() {

return numero;

}

/**

     * Metodo para retorno do autor do Periodico

     * @return o autor

     */

    @Override

    public String getAutor() {

       return null;

    }

    /**

     * Metodo para retorno do assunto do Periodico

     * @return o assunto

     */

    @Override

    public String getAssunto() {

        return assunto;

    }

    /** 

* Metodo para modificar o assunto do Periodico
* @param assunto o novo assunto

*/

    @Override

    public void setAssunto(String assunto) {

        this.assunto=assunto;

    }

    /**
     * Metodo para retorno do tipo 
     * @return o tipo de Obra
     */

    @Override

    public String getTipo() {

       return "Periodicos";

    }

    /**

     * Metodo para retorno do codigo do Periodico 

     * @return o codigo

     */

    @Override

    public int getCod() {

        return codigo;

    }

    /** 

* Metodo para modificar o autor do Periodico
* @param autor o nome do novo autor

*/

    @Override

    public void setAutor(String autor) {

        

    }

    /** 

* Metodo para modificar a editora do Periodico
* @param editora a nova editora

*/

    @Override

    public void setEditora(String editora) {
        this.Editora=editora;
    }

    /*
     * Metodo para retorno da editora do Periodico 
     * @return a editora
     */

    @Override

    public String getEditora() {

         return Editora;

    }

    /** 

* Metodo para modificar o genero do Periodico
* @param genero o novo gênero

*/

    @Override

    public void setGenero(String genero) {

        

    }

    /**
     * Metodo para retorno do genero do Periodico 
     * @return o gênero

     */

    @Override

    public String getGenero() {

         return null;

    }

    /** 

* Metodo para modificar o numero de Periodicoe
* @param numero o novo numero

*/

    @Override

    public void setNumero(String numero) {
         this.numero=numero;
    }

    /**

     * Metodo para retorno do numero de copias dos Periodicos 
     * @return a quantidade de cópias
     */

    @Override

    public int getCopias() {

        return copias;

    }

    /** 
* Metodo para modificar o numero de copias de Periodicoe
* @param n a nova quantidade de cópias

*/

    @Override

    public void setCopias(int n) {

        this.copias=n;

    }


}