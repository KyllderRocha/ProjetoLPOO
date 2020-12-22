
package Controller;

import Modelo.Administrador;
import View.TelaLogin;
import View.TelaMenu;

/** Classe para o Controller Principal.
 * @author Kyllder
 * @author Thiago
 * @author Pedro
 * @version 1.0
 */

public class ControllerPrincipal {
    private TelaLogin tl=null;
    /**
     * Método Inicia a tela de Menu.
     */
    public void TelaMenu(){
     TelaMenu tm= new TelaMenu();
     tm.setVisible(true);
    }
    /**
     * Método Inicia a tela de login.
     * @param pai a JFrame pai da tela
     * @param modal se quer cntinuar com o modelo
     */
    public void TelaLogin(java.awt.Frame pai, boolean modal){
     tl = new TelaLogin(pai,modal);
     tl.setVisible(true);
    }
    /**
     * Método pega o Administador que fez o login.
     * @return Administrador,que fez o login
     */
    public Administrador getAdmin(){
        return tl.getAdmin();
    }
}
