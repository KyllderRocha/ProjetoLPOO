package View;

import Controller.ControllerAdmin;
import Controller.ControllerEmprestimo;
import Controller.ControllerObra;
import Controller.ControllerPrincipal;
import Controller.ControllerUsuario;
import Modelo.Administrador;


/** Classe para a tela de menu, onde será possível acessa todas as outras telas.
 * @author Kyllder
 * @author Thiago
 * @author Pedro
 * @version 1.0
 */
public class TelaMenu extends javax.swing.JFrame {
    
    /**Um objeto do Controller de Admiministradores
     *@see ControllerAdmin*/
    
    private ControllerAdmin ca =new ControllerAdmin();
    
    /**Um objeto do Controller de Usuário.
     *@see ControllerUsuario*/
    
    private ControllerUsuario cobre =new ControllerUsuario();
    
    /**Um objeto do Controller de Obras.
     *@see ControllerObra*/
    
    private ControllerObra co =new ControllerObra(); 
    
    /**Um objeto do Controller de Emprestimos.
     *@see ControllerEmprestimo*/
    
    private ControllerEmprestimo ce =new ControllerEmprestimo();
    
    /**Um objeto do Controller Principal.
     *@see ControllerPrincipal*/
    
    private ControllerPrincipal cp = new ControllerPrincipal();
    
    /**Uma Objeto Administrador que vai armazenar o Administrador que fez o Login*/
    
    private Administrador Admin;

    /**
     * Construtor, onde eu chamo o Controller Principal para abrir a Tela de Login,
     * para pegar o Administrador que fez o Login e também para verificar o tipo de dele.
     */
    public TelaMenu() {  
        initComponents();
        cp.TelaLogin(this, true);
        Admin=cp.getAdmin();

        if (!Admin.getTipo().equals("Gerente")) {
            MenuAdmin.setVisible(false);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Novo = new javax.swing.JMenu();
        NovoObra = new javax.swing.JMenuItem();
        DeletarObra = new javax.swing.JMenuItem();
        EditarObra = new javax.swing.JMenuItem();
        VisualizarObra = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        NovoUsuario = new javax.swing.JMenuItem();
        DeletarUsuario = new javax.swing.JMenuItem();
        EditarUsuario = new javax.swing.JMenuItem();
        VisualizarUsuario = new javax.swing.JMenuItem();
        Visualizar = new javax.swing.JMenu();
        NovoEmpres = new javax.swing.JMenuItem();
        Devolucao = new javax.swing.JMenuItem();
        Divida = new javax.swing.JMenuItem();
        VisualizarEmpres = new javax.swing.JMenuItem();
        MenuAdmin = new javax.swing.JMenu();
        NovoAdmin = new javax.swing.JMenuItem();
        DeletarAdmin = new javax.swing.JMenuItem();
        EditarAdmin = new javax.swing.JMenuItem();
        VisualizarAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new java.awt.Dimension(940, 640));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/depositphotos_71411393-stock-illustration-books-library-seamless-pattern-reading.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-70, -420, 1020, 1030);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book.png"))); // NOI18N
        Novo.setText("Obra");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        NovoObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_add.png"))); // NOI18N
        NovoObra.setText("Novo");
        NovoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoObraActionPerformed(evt);
            }
        });
        Novo.add(NovoObra);

        DeletarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_delete.png"))); // NOI18N
        DeletarObra.setText("Deletar");
        DeletarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarObraActionPerformed(evt);
            }
        });
        Novo.add(DeletarObra);

        EditarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_edit.png"))); // NOI18N
        EditarObra.setText("Editar");
        EditarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarObraActionPerformed(evt);
            }
        });
        Novo.add(EditarObra);

        VisualizarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_addresses.png"))); // NOI18N
        VisualizarObra.setText("Visualizar");
        VisualizarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarObraActionPerformed(evt);
            }
        });
        Novo.add(VisualizarObra);

        jMenuBar1.add(Novo);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jMenu2.setText("Usuários");

        NovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_add.png"))); // NOI18N
        NovoUsuario.setText("Novo");
        NovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(NovoUsuario);

        DeletarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_delete.png"))); // NOI18N
        DeletarUsuario.setText("Deletar");
        DeletarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(DeletarUsuario);

        EditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_edit.png"))); // NOI18N
        EditarUsuario.setText("Editar");
        EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(EditarUsuario);

        VisualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group.png"))); // NOI18N
        VisualizarUsuario.setText("Visualizar");
        VisualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(VisualizarUsuario);

        jMenuBar1.add(jMenu2);

        Visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_open.png"))); // NOI18N
        Visualizar.setText("Emprestimo");

        NovoEmpres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_next.png"))); // NOI18N
        NovoEmpres.setText("Novo");
        NovoEmpres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoEmpresActionPerformed(evt);
            }
        });
        Visualizar.add(NovoEmpres);

        Devolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_previous.png"))); // NOI18N
        Devolucao.setText("Devolução");
        Devolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolucaoActionPerformed(evt);
            }
        });
        Visualizar.add(Devolucao);

        Divida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/money.png"))); // NOI18N
        Divida.setText("Divida");
        Divida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividaActionPerformed(evt);
            }
        });
        Visualizar.add(Divida);

        VisualizarEmpres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/box.png"))); // NOI18N
        VisualizarEmpres.setText("Visualizar");
        VisualizarEmpres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarEmpresActionPerformed(evt);
            }
        });
        Visualizar.add(VisualizarEmpres);

        jMenuBar1.add(Visualizar);

        MenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_gray.png"))); // NOI18N
        MenuAdmin.setText("Administradores");

        NovoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_add.png"))); // NOI18N
        NovoAdmin.setText("Novo");
        NovoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoAdminActionPerformed(evt);
            }
        });
        MenuAdmin.add(NovoAdmin);

        DeletarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_delete.png"))); // NOI18N
        DeletarAdmin.setText("Deletar");
        DeletarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarAdminActionPerformed(evt);
            }
        });
        MenuAdmin.add(DeletarAdmin);

        EditarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_edit.png"))); // NOI18N
        EditarAdmin.setText("Editar");
        EditarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarAdminActionPerformed(evt);
            }
        });
        MenuAdmin.add(EditarAdmin);

        VisualizarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group.png"))); // NOI18N
        VisualizarAdmin.setText("Visualizar");
        VisualizarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarAdminActionPerformed(evt);
            }
        });
        MenuAdmin.add(VisualizarAdmin);

        jMenuBar1.add(MenuAdmin);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     /** Método que ao clicar na opção Editar do menu de Obras, é acionado, e chama o método TelaEditar do Controller de Obras
      * @see ControllerObras
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void EditarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarObraActionPerformed
        co.TelaEditar();
    }//GEN-LAST:event_EditarObraActionPerformed
    
    /** Método que ao clicar na opção Visualizar do menu de Obras, é acionado, e chama o método TelaVisualizar do Controller de Obras
      * @see ControllerObras
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
                                           
    private void VisualizarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarObraActionPerformed
        co.TelaVisualizar();
       
    }//GEN-LAST:event_VisualizarObraActionPerformed

    /** Método que ao clicar na opção Novo do menu de Emprestimo, é acionado, e chama o método TelaAdcionar do Controller de Emprestimos
      * @see ControllerEmprestimo
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void NovoEmpresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoEmpresActionPerformed
         ce.TelaAdcionar(Admin.getNome());
    }//GEN-LAST:event_NovoEmpresActionPerformed

    /** Método que ao clicar na opção Visualizar do menu de Emprestimo, é acionado, e chama o método TelaVisualizar do Controller de Emprestimos
      * @see ControllerEmprestimo
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void VisualizarEmpresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarEmpresActionPerformed
        ce.TelaVisualizar();           
    }//GEN-LAST:event_VisualizarEmpresActionPerformed
    
    /** Método que ao clicar na opção Devolucao do menu de Emprestimo, é acionado, e chama o método TelaRemover do Controller de Emprestimos
      * @see ControllerEmprestimo
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void DevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolucaoActionPerformed
        ce.TelaRemover();
    }//GEN-LAST:event_DevolucaoActionPerformed

    /** Método que ao clicar na opção Novo do menu de Usuarios, é acionado, e chama o método TelaAdcionar do Controller de Usuarios
      * @see ControllerUsuario
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void NovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoUsuarioActionPerformed
        cobre.TelaAdcionar();
    }//GEN-LAST:event_NovoUsuarioActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        
    }//GEN-LAST:event_NovoActionPerformed

    /** Método que ao clicar na opção Novo do menu de Admnistradores, é acionado, e chama o método TelaAdcionar do Controller de Admnistradores
      * @see ControllerAdmin
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void NovoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoAdminActionPerformed
        ca.TelaAdcionar();
    }//GEN-LAST:event_NovoAdminActionPerformed
    
    /** Método que ao clicar na opção Novo do menu de Obras, é acionado, e chama o método TelaAdcionar do Controller de Obras
      * @see ControllerObras
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void NovoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoObraActionPerformed
       co.TelaAdcionar();
    }//GEN-LAST:event_NovoObraActionPerformed

    /** Método que ao clicar na opção Deletar do menu de Obras, é acionado, e chama o método TelaRemover do Controller de Obras
      * @see ControllerObras
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void DeletarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarObraActionPerformed
       co.TelaRemover();
    }//GEN-LAST:event_DeletarObraActionPerformed
    
    /** Método que ao clicar na opção Deletar do menu de Usuarios, é acionado, e chama o método TelaRemover do Controller de Usuarios
      * @see ControllerUsuario
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void DeletarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarUsuarioActionPerformed
        cobre.TelaRemover();
    }//GEN-LAST:event_DeletarUsuarioActionPerformed

    /** Método que ao clicar na opção Deletar do menu de Admnistradores, é acionado, e chama o método TelaAdcionar do TelaRemover de Admnistradores
      * @see ControllerAdmin
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void DeletarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarAdminActionPerformed
        ca.TelaRemover();
    }//GEN-LAST:event_DeletarAdminActionPerformed

    /** Método que ao clicar na opção Editar do menu de Admnistradores, é acionado, e chama o método TelaEditar do TelaRemover de Admnistradores
      * @see ControllerAdmin
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void EditarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarAdminActionPerformed
       ca.TelaEditar();
    }//GEN-LAST:event_EditarAdminActionPerformed

    /** Método que ao clicar na opção Visualizar do menu de Admnistradores, é acionado, e chama o método TelaVisualizar do TelaRemover de Admnistradores
      * @see ControllerAdmin
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void VisualizarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarAdminActionPerformed
        ca.TelaVisualizar();
    }//GEN-LAST:event_VisualizarAdminActionPerformed
    
    /** Método que ao clicar na opção Editar do menu de Usuarios, é acionado, e chama o método TelaEditar do Controller de Usuarios
      * @see ControllerUsuario
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarUsuarioActionPerformed
        cobre.TelaEditar();
    }//GEN-LAST:event_EditarUsuarioActionPerformed

    /** Método que ao clicar na opção Visualizar do menu de Usuarios, é acionado, e chama o método TelaVisualizar do Controller de Usuarios
      * @see ControllerUsuario
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void VisualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarUsuarioActionPerformed
        cobre.TelaVisualizar();
    }//GEN-LAST:event_VisualizarUsuarioActionPerformed
    
    /** Método que ao clicar na opção Divida do menu de Emprestimo, é acionado, e chama o método TelaDevedores do Controller de Emprestimos
      * @see ControllerEmprestimo
      * @param evt ActionEvent - Ação do botão sendo clicado
      */
    
    private void DividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividaActionPerformed
        ce.TelaDevedores();
    }//GEN-LAST:event_DividaActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeletarAdmin;
    private javax.swing.JMenuItem DeletarObra;
    private javax.swing.JMenuItem DeletarUsuario;
    private javax.swing.JMenuItem Devolucao;
    private javax.swing.JMenuItem Divida;
    private javax.swing.JMenuItem EditarAdmin;
    private javax.swing.JMenuItem EditarObra;
    private javax.swing.JMenuItem EditarUsuario;
    private javax.swing.JMenu MenuAdmin;
    private javax.swing.JMenu Novo;
    private javax.swing.JMenuItem NovoAdmin;
    private javax.swing.JMenuItem NovoEmpres;
    private javax.swing.JMenuItem NovoObra;
    private javax.swing.JMenuItem NovoUsuario;
    private javax.swing.JMenu Visualizar;
    private javax.swing.JMenuItem VisualizarAdmin;
    private javax.swing.JMenuItem VisualizarEmpres;
    private javax.swing.JMenuItem VisualizarObra;
    private javax.swing.JMenuItem VisualizarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
