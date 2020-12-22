package Classes;
/**
 * Classe Manga, estendendo quadrinhos
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public class Manga extends Quadrinhos {
    
/**Uma String que armazena o gênero do Livro*/
        private String genero;
/**
 * Contrutor da Classe, utilizando o super pra chamar os atributos de quadrinhos
     * @param genero o gênero do Mangá 
     * @param nome o nome do Mangá 
     * @param assunto o assunto do Mangá 
     * @param editora a editora do Mangá 
     * @param autor o autor do Mangá 
     * @param copias a quantidade de cópias do Mangá 
     * @param cod o codigo do Mangá 
 */


public Manga(String genero,String nome, String assunto, String editora, String autor,int copias,int cod) {
super(nome, assunto, editora, autor,copias,cod);
this.genero = genero;
}
/**
     * Metodo para retorno do tipo 
     * @return o tipo de Obra
     */
@Override
        public String getTipo(){
            return "Manga";
        } 
/**
 * Metodo para retorno do Genero do Manga
 * @return o gênero do Mangá 
 */
@Override
public String getGenero() {
return genero;
}
/**
 * Metodo para modificar o genero do Manga
 * @param genero o novo gênero
 */
@Override
public void setGenero(String genero) {
this.genero = genero;
}
}
