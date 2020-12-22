package Modelo;
/*
 * Interface de Obras
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */

public interface Obra {

/*
* Metodo para retorno do nome da Obra
*/

    String getNome();

    /* 
     * Metodo para modificar o nome da Obra
     * @param String - nome
     */

    void setNome(String nome);

    /*
     * Metodo para retorno do Autor da Obra
     */

    String getAutor();

    /*
     * Metodo para modificar o Autor da Obra
     * @param String - autor
     */

    void setAutor(String autor);

    /*
     * Metodo para retorno do Assunto da Obra
     */

    String getAssunto();

    /*
     * Metodo para modificar o Assunto da Obra
     * @param String - assunto
     */

    void setAssunto(String assunto);

    /*
     * Metodo para retorno do tipo da Obra
     */

    String getTipo();

    /*
     * Metodo para modificar a Editora da Obra
     * @param String - editora
     */

    void setEditora(String editora);

    /*
     * Metodo para retorno da Editora da Obra
     */

    String getEditora();

    /*
     * Metodo para modificar o Genero da Obra
     * @param String - genero
     */

    void setGenero(String genero);

    /*
     * Metodo para retorno do Genero da Obra
     */

    String getGenero();

    /*
     * Metodo para modificar o numero de Obras
     * @param String - numero
     */

    void setNumero(String numero);

    /*
     *  Metodo para retorno do numero de Obras
     */

    String getNumero();

    /*
     *  Metodo para retorno das copias de Obras
     */

    int getCopias();

    /*
     * Metodo para modificar o numero de copias de Obras
     * @param int - n
     */

    void setCopias(int n);

    /*
     * Metodo para retorno do codigo de Obra
     */

    int getCod();

    

    

    

}