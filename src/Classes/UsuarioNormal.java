package Classes;




import Modelo.Usuarios;




/**

 * Classe Ususario Normal, implementado por usuarios

 * @author Kyllder, Pedro e Thiago

 * @version 1.0

 */




public class UsuarioNormal extends UsuarioAbstrato{

    /**

     * Construtor da classe
    * @param nome nome do Usuario
     * @param cpf cpf do Usuario
     * @param rg rg do Usuario 
     * @param telefone telefone do Usuario
     * @param endereco endereço do Usuario
     */

   public UsuarioNormal(String nome,String cpf,String rg,String telefone,String endereco){
   	
   	super(nome,cpf,rg,telefone,endereco,"Normal", 2);
      
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

   public UsuarioNormal(String nome,String cpf,String rg,String telefone,String endereco, double divida){

   	super(nome,cpf,rg,telefone,endereco,divida,"Normal", 2);

   }


    @Override

    public Usuarios setTipo(String tipo) {

        if (tipo.equalsIgnoreCase("funcionario")) {

           Usuarios b=new UsuarioFunc(this.getNome(), this.getCPF(), this.getRG(), this.getTelefone(), this.getEndereco(),this.getDivida());

           return b;

        }else if (tipo.equalsIgnoreCase("Comerciario")) {

            Usuarios b=new UsuarioCom(this.getNome(), this.getCPF(), this.getRG(), this.getTelefone(), this.getEndereco(),this.getDivida());

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

        return 7;

    }

    /**

     * Metodo para retorno do preço de multa por dia de atraso

     * @return o preço de multa

     */

    @Override

    public double getPreco() {

        return 1;

    }

}


