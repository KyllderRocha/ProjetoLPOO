package Classes;


import Modelo.Obra;




/**

 * Classe Quadrinhos, implementando obra

 * @author Kyllder, Pedro e Thiago

 * @version 1.0

 */




public class Quadrinhos implements Obra {

        /**Uma String que armazena a editora do Quadrinho*/
        private String editora;
       /**Uma String que armazena o nome do Quadrinho*/
        private String nome;
        /**Uma String que armazena o assunto do Quadrinho*/
        private String assunto;
        /**Um inteiro que armazena o codigo do Quadrinho*/
        private final int codigo;
        /**Uma String que armazena o autor do Quadrinho*/
        private String autor;
        /**Um inteiro que armazena a quantidade de cópias do Quadrinho*/
        private int copias;

        /**

         * Construtor de quadrinhos
     * @param nome o nome do Quadrinho
     * @param assunto o assunto do Quadrinho
     * @param editora aeditora do Quadrinho
     * @param autor o autor do Quadrinho
     * @param copias a quantidade de cópias do Quadrinho
     * @param cod o código do Quadrinho
         */





public Quadrinhos(String nome, String assunto, String editora,String autor,int copias,int cod) {

this.nome = nome;

this.assunto = assunto;

this.editora = editora;

this.autor = autor;

                this.codigo=cod;

                this.copias=copias;

}

/**
     * Metodo para retorno da Editora dos Quadrinhos
     * @return a editora
     */

@Override
public String getEditora() {

return editora;

}

/**

* Metodo para modificar a Editora dos Quadrinhos
* @param editora a nova editora

*/
@Override
public void setEditora(String editora) {

this.editora = editora;

}

/**

     * Metodo para retorno do nome dos Quadrinhos

     * @return o nome

     */

@Override

public String getNome() {
    
return this.nome;

}

/** 

* Metodo para modificar o nome dos Quadrinhos
* @param nome o novo nome

*/

@Override

public void setNome(String nome) {

this.nome = nome;

}

/**
     * Metodo para retorno do assunto dos Quadrinhos
     * @return o assunto
     */

@Override

public String getAssunto() {

return this.assunto;

}

/** 

* Metodo para modificar o assunto dos Quadrinhos
* @param assunto o novo assunto

*/

@Override

public void setAssunto(String assunto) {

this.assunto = assunto;




}

/**
     * Metodo para retorno do codigo dos Quadrinhos
     * @return o código
     */

@Override

public int getCod() {

// TODO Auto-generated method stub

return this.codigo;

}

/** 

* Metodo para modificar o Autor dos Quadrinhos
* @param autor o novo autor

*/




@Override

public void setAutor(String autor) {

this.autor = autor;


}

/**

     * Metodo para retorno do Autor dos Quadrinhos

     * @return String - autor

     */

@Override

public String getAutor() {

return this.autor;

}

/**

     * Metodo para retorno do tipo 

     * @return o tipo de Obra

     */

    @Override

    public String getTipo() {

        return "Quadrinhos";

    }

    /** 

* Metodo para modificar o Genero dos Quadrinhos
* @param genero o novo gênero

*/

    @Override

    public void setGenero(String genero) {

    }

    /**
     * Metodo para retorno do Genero
     * @return o gênero 
     */

    @Override

    public String getGenero() {

        return null;

    }

    /** 
    * Metodo para modificar o numero de Quadrinhos
    * @param numero o novo numero
    */

    @Override

    public void setNumero(String numero) {
        
    }

    /**
     * Metodo para retorno do Numero de Quadrinhos
     * @return o numero
     */

    @Override

    public String getNumero() {

         return null;

    }

    /**
     * Metodo para retorno do Numero de copias de Quadrinhos
     * @return a quantidade de cópias
     */

    @Override

    public int getCopias() {

        return copias;

    }

    /** 

    * Metodo para modificar o numero de copoias de Quadrinhos
    * @param n a nova quantidade de cópias
    */

    @Override

    public void setCopias(int n) {

        this.copias=n;

    }


}

