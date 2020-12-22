package Classes;

import Modelo.Emprestimos;
import java.util.Calendar;

/**
 * Classe Emprestimos, implementado por Emprestimos
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public class Emprestimo implements Emprestimos{
    /** Uma String que armazena o nome do Usuario que pediu o Emprestimo*/
    private final String NomeUser;
    /** Uma String que armazena o nome do Administrador que fez o Emprestimo*/
    private final String NomeAdmin;
    /** Uma String que armazena o nome da Obra que foi Emprestada*/
    private final String NomeObra;
    /** Um Calendar que armazena a data limite da entrega do Emprestimo*/
    private Calendar dtPrevista=null;
    /** Um Calendar que armazena a data da entrega do Emprestimo*/
    private Calendar dtReal=null;
    /** Um Calendar que armazena a data do Emprestimo*/
    private Calendar dtEmp=null;
    /**
     * Construtor da classe
     * @param NomeUser o nome do Usuario que está pedio o Emprestimo
     * @param NomeAdmin o nome do Administrador que está fez o Emprestimo
     * @param NomeObra o nome da Obra emprestada
     * @param dtPrevista a data que é para ele entregar
     * @param dtReal a data que ele entregou
     * @param dtEmp a data que foi feito o Emprestimo
     */
    public Emprestimo(String NomeUser,String NomeAdmin,String NomeObra, Calendar dtPrevista,Calendar dtReal, Calendar dtEmp){
        this.NomeUser=NomeUser;
        this.NomeAdmin=NomeAdmin;
        this.NomeObra=NomeObra;
        this.dtPrevista=dtPrevista;
        this.dtReal=dtReal;
        this.dtEmp=dtEmp;
}
    /**
     * Metodo para retorno do nome do User
     * @return o nome do Usuario
     * 
     */

    @Override
    public String getNomeUser() {
        return NomeUser;
    }

    /**
     * Metodo para retorno do nome do Administrador
     * @return o nome do Administrador
     * 
     */

    @Override
    public String getNomeAdmin() {
        return NomeAdmin;
    }

    /**
     * Metodo para retorno do nome da Obra
     * @return o nome da Obra
     * 
     */


    @Override
    public String getNomeObra() {
        return NomeObra;
    }

    /**
     * Metodo para retorno da data de previsão
     * @return a data de prevista
     * 
     */

    @Override
    public Calendar getDtPrevista() {
        return dtPrevista;
    }
    /**
     * Metodo para retorno da data real
     * @return a data que foi entrege
     * 
     */
    @Override
    public Calendar getDtReal() {
        return dtReal;
    }
    /**
     * Metodo para retorno da data do emprestimo
     * @return a data do emprestimo
     * 
     */
    @Override
    public Calendar getDtEmp() {
        return dtEmp;
    }
}