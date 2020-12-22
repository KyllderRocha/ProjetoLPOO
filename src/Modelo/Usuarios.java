package Modelo;




/*

 * Interface de Usuarios

 * @author Kyllder, Pedro e Thiago

 * @version 1.0

 */

public interface Usuarios {

/*

*  Metodo para retorno do nome do Usuario

*/

String getNome();

/*

* Metodo para modificar o nome do Usuario

* * @param String - nome

*/

void setNome(String nome);

/*

* Metodo para retorno do cpf do Usuario 

*/

String getCPF();

/*

* Metodo para modificar o cpf do Usuario

* * @param String - cpf

*/

void setCPF(String cpf);

/*

* Metodo para retorno do rg do Usuario

*/

String getRG();

/*

* Metodo para modificar o rg do Usuario

* * @param String - rg

*/

void setRG(String rg);

/*

* Metodo para retorno do tipo do Usuario

*/

String getTipo();

/*

* Metodo para modificar o tipo do Usuario

* * @param String - tipo

*/

Usuarios setTipo(String tipo);

/*

* Metodo para retorno do telefone do Usuario

*/

String getTelefone();

/*

* Metodo para modificar o telefone do Usuario

* * @param String - telefone

*/

void setTelefone(String telefone);

/*

* Metodo para retorno do Endereco do Usuario

*/

String getEndereco();

/*

* Metodo para modificar o Endereco do Usuario

* * @param String - endereco

*/

void setEndereco(String Endereco);

/*

* Metodo para retorno da qunatidade de obras do Usuario

*/

        int getQtdObras();

        /*

    * Metodo para retorno dos dias do Usuario

    */

        int getDias();

        /*

    * Metodo para retorno se o Usuario está devendo ou não

    */

        boolean isDevendo();

        /*

    * Metodo para retorno sobre a divida do Usuario

    */

        double getDivida();

        /*

    * Metodo para modificar a divida do Usuario

    * * @param double - divida

    */

        void setDivida(double divida);

        /*

    * Metodo para retorno do preco 

    */

        double getPreco();

}