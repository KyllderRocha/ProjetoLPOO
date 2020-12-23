
package Classes;
import Modelo.Usuarios;

/**

 * Classe Ususario Comerciario, implementado por usuarios

 * @author Kyllder, Pedro e Thiago

 * @version 1.0

 */




public class UsuarioFunc extends UsuarioAbstrato {

    /**

     * Construtor da classe
    * @param nome nome do Usuario
     * @param cpf cpf do Usuario
     * @param rg rg do Usuario 
     * @param telefone telefone do Usuario
     * @param endereco endereço do Usuario
     */

   public UsuarioFunc(String nome,String cpf,String rg,String telefone,String endereco){
   	
   	super(nome,cpf,rg,telefone,endereco,"Funcionario", 5);
      
   }

   /**

    * Construtor da classe, com divida e quantidade de obras
      *@param nome nome do Usuario
     * @param cpf cpf do Usuario
     * @param rg rg do Usuario 
     * @param telefone telefone do Usuario
     * @param endereco endereço do Usuario
    * @param divida divida do Usuario
     */

   public UsuarioFunc(String nome,String cpf,String rg,String telefone,String endereco, double divida){

   	super(nome,cpf,rg,telefone,endereco,divida,"Funcionario", 5);

   }


    /** 

    * Metodo para modificar o tipo do Usuario, podendo ir para Usuario funcionario ou Usuario normal

    * @return Usuarios o novo usuario formado

    * @param tipo o novo tipo

    */

    @Override

    public Usuarios setTipo(String tipo) {

        if (tipo.equalsIgnoreCase("comerciario")) {

            Usuarios b=new UsuarioCom(this.getNome(), this.getCPF(), this.getRG(), this.getTelefone(), this.getEndereco(),this.getDivida());

           return b;

        }else if (tipo.equalsIgnoreCase("normal")) {

             Usuarios b=new UsuarioNormal(this.getNome(), this.getCPF(), this.getRG(), this.getTelefone(), this.getEndereco(),this.getDivida());

           return b;

        }

        return null;

    }

    /**

     * Metodo para retorno dos dias que pode ficar com uma obra

     * @return os dias que o Usuario pode ficar com uma obra

     */

    @Override

    public int getDias() {

        return 14;

    }

    /**

     * Metodo para retorno do preço de multa por dia de atraso

     * @return o preço de multa

     */

    @Override

    public double getPreco() {

        return 0.25;

    }


}
