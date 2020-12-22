package Classes;

import Modelo.Obra;

/**
 * Classe Livros, implementado por obra
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public class Livros implements Obra{

        /**Uma String que armazena a editora do Livro*/
        private String editora;
        /**Uma String que armazena o nome do Livro*/
        private String nome;
        /**Uma String que armazena o assunto do Livro*/
        private String assunto;
        /**Um inteiro que armazena o codigo do Livro*/
        private final int codigo;
        /**Uma String que armazena o autor do Livro*/
        private String autor;
        /**Um inteiro que armazena a quantidade de cópias do Livro*/
        private int copias;
        /**Uma String que armazena o gênero do Livro*/
        private String genero;
/**
 * Construtor da classe
     * @param nome o Nome do Livro
     * @param assunto o assunto do Livro
     * @param autor o autor do Livro
     * @param editora a editora do Livro
     * @param genero o gênero do Livro
     * @param copias a quantidade de copias do Livro
     * @param cod o código do Livro
 */
public Livros(String nome,String assunto, String autor, String editora, String genero,int copias, int cod){
this.autor = autor;
this.nome = nome;
this.editora = editora;
this.genero = genero;
this.codigo = cod;
this.assunto=assunto;
this.copias=copias;
}
/**
* Metodo para retorno do Autor do Livro
* @return o autor
*/
@Override
public String getAutor() {
return autor;
}
/**
* Metodo para modificar o Autor do Livro
* @param autor o novo nome do autor
*/
@Override
public void setAutor(String autor) {
this.autor = autor;
}
/**
* Metodo para retorno do nome do Livro
     * @return o nome
*/
@Override
public String getNome() {
return nome;
}
/**
* Metodo para modificar o nome do Livro
* @param nome o novo Nome
*/
@Override
public void setNome(String nome) {
this.nome = nome;
}
/**
* Metodo para retorno da Editora do Livro
     * @return a editora
*/
@Override
public String getEditora() {
return editora;
}
/**
* Metodo para modificar a editora do Livro
* @param editora a nova editora
*/
@Override
public void setEditora(String editora) {
this.editora = editora;
}
/**
* Metodo para retorno do Genero do Livro
* @return o gênero
*/
@Override
public String getGenero() {
return genero;
}
/**
* Metodo para modificar o genero do Livro
* @param genero o novo gênero
*/
@Override
public void setGenero(String genero) {
this.genero = genero;
}
/**
* Metodo para retorno do codigo do Livro
     * @return int - codigo
*/
@Override
public int getCod() {
return codigo;
}
/**
* Metodo para retorno do assunto do Livro
     * @return o assunto
*/
    @Override
    public String getAssunto() {
        return assunto;
    }
    /**
* Metodo para modificar o assunto do Livro
* @param assunto o novo assunto
*/
    @Override
    public void setAssunto(String assunto) {
        this.assunto=assunto;
    }
    /**
* Metodo para retorno do tipo
* @return o tipo
*/
    @Override
    public String getTipo() {
        return "Livro";
    }
    /**
* Metodo para modificar o numero de Livros
* @param numero o novo número
*/
    @Override
    public void setNumero(String numero) {
        
    }
    /**
* Metodo para retorno do numero de livros
     * @return o número do livro
*/
    @Override
    public String getNumero() {
    return null;
    }
    /**
* Metodo para retorno do numero de copias 
     * @return a quantidade de copias
*/
    @Override
    public int getCopias() {
        return copias;
    }
    /** 
* Metodo para modificar o numero de copias de Livros
* @param n a nova quantidade de cópias
*/
    @Override
    public void setCopias(int n) {
        this.copias=n;
    }
}


