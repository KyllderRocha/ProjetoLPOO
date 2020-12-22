package Modelo;

import java.util.Calendar;

/**
 * Interface de Emprestimos
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public interface Emprestimos {
/*
* Metodo para retorno do nome do User
*/
    String getNomeUser();
    /*
* Metodo para retorno do nome do Admin
*/
    String getNomeAdmin();
    /*
* Metodo para retorno do nome da obra
*/
    String getNomeObra();
    /*
* Metodo para retorno da data de previsão
*/
    Calendar getDtPrevista();
    /*
* Metodo para retorno da data real 
*/
    Calendar getDtReal();
    /*
     * Metodo para retorno da data de Emprestimo
     */
    Calendar getDtEmp();


}