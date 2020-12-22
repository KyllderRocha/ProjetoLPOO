package Modelo;
/*
 * Interface de Administradores
 * @author Kyllder, Pedro e Thiago
 * @version 1.0
 */
public interface Administrador {
/*
 * Metodo para retorno do nome do Administrador
 */
    String getNome();
/* 
* Metodo para modificar o nome do Administrador
* @param String - nome
*/
    void setNome(String nome);
/*
     * Metodo para retorno do cpf do Administrador
     */
    String getCPF();
/* 
* Metodo para modificar o cpf do Administrador
* @param String - cpf
*/
    void setCPF(String cpf);
/*
     * Metodo para retorno do RG do Administrador
     */
    String getRG();
/* 
* Metodo para modificar o RG do Administrador
* @param String - rg
*/
    void setRG(String rg);
/*
    * Metodo para retorno do tipo do Administrador
    */
    String getTipo();
/* 
* Metodo para modificar o tipo do Administrador
* @param String - tipo
*/
    void setTipo(String tipo);
/*
    * Metodo para retorno do telefone do Administrador
    */
    String getTelefone();
/* 
* Metodo para modificar o telefone do Administrador
* @param String - telefone
*/
    void setTelefone(String telefone);
/*
    * Metodo para retorno do endereço do Administrador
    */
    String getEndereco();
/* 
* Metodo para modificar o endereço do Administrador
* @param String - endereco
*/
    void setEndereco(String endereco);
/*
    * Metodo para retorno da senha do Administrador
    */
    String getSenha();
/* 
* Metodo para modificar a senha do Administrador
* @param String - senha
*/
    void setSenha(String senha);
/*
    * Metodo para retorno do user do Administrador
    */
    String getUser();
  /* 
* Metodo para modificar o user do Administrador
* @param String - user
*/
    void setUser(String user);
}

