
package View;

import Classes.Administradores;
import Controller.ControllerAdmin;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**Classe para a criação da tela que edita Administradores.
 * @author Kyllder
 * @author Thiago
 * @author Pedro
 * @version 1.0
 */
public class TelaEditarAdmin extends javax.swing.JFrame {
    /**Um objeto do Controller de Administrador.
     *@see ControllerAdmin*/
    private ControllerAdmin ca =new ControllerAdmin();
    /**Um ArrayList onde vai ser armazenados os Administradores.*/
    private ArrayList<Administradores> array= new ArrayList();
    /**Um objeto do default table model, relacionado a tabela.
     *@see DefaultTableModel*/
    private DefaultTableModel dtm;
    /**
     * Construtor da classe, onde são inicializados todos os componentes da tela
     * e onde são adicionados os dados da tabela 
     */
    public TelaEditarAdmin() {
        initComponents();
        
        dtm = (DefaultTableModel)Tabela.getModel();    
        array=ca.Listar();
        if (!array.isEmpty()) {     
            for (Administradores aux: array) {
            String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),aux.getUser(),aux.getSenha(),aux.getTipo()};
            dtm.addRow(a);
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Telefone", "Endereço", "User", "Senha", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TabelaMouseMoved(evt);
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela);

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        jLabel1.setText("Procurar");

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_edit.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Editar)
                        .addGap(27, 27, 27)
                        .addComponent(Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar)
                    .addComponent(Cancelar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/** Método Não faz nada foi, gerado sem querer*/
    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked

    }//GEN-LAST:event_TabelaMouseClicked
/**
     * Método que cancela a operação e fecha a fecha a tela 
     * @param evt ActionEvent, Ação do botão sendo clicado
     */
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed
/**
     * Método que edita um Administrador.
     * @param evt ActionEvent, Ação do botão sendo clicado
     */
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        if (Tabela.getSelectedRow()>=0) {
            for (Administradores aux : array) {
                if (aux.getCPF().equals(Tabela.getValueAt(Tabela.getSelectedRow(),1))) {
                    ca.TelaA(aux,true,this);
                }
            }
            dtm.setNumRows(0);       
            array=ca.Listar();
            
            for (Administradores aux: array) {
            String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),aux.getUser(),aux.getSenha(),aux.getTipo()};
            dtm.addRow(a);
            }
        }
        
       
       
    }//GEN-LAST:event_EditarActionPerformed
/** Método Não faz nada foi, gerado sem querer*/
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed
/**
     * Método que atualiza a tabela de Administradores a cada vez que o campo de texto é alterado
     * @param evt KeyEvent, Ação do Campo de texto ao ser digitado ou apagado algo
     */
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        dtm =  (DefaultTableModel)Tabela.getModel();
        if (!txtBuscar.getText().equals("")) {
            dtm.setNumRows(0);
            ArrayList<Administradores> array1=ca.Buscar(txtBuscar.getText());
            for (Administradores aux : array1) {
                String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),aux.getTipo()};
                dtm.addRow(a);
            }

        }else{
            dtm.setNumRows(0);
            for (Administradores aux : array) {
                String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),aux.getTipo()};
                dtm.addRow(a);
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased
/**
     * Método que cria o comentario dos valores da tabela de Administradores
     * @param evt MouseEvent, ação de mover o mouse pela tabela
     */
    private void TabelaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseMoved
        Point p = evt.getPoint(); 
        int row = Tabela.rowAtPoint(p);
        int column = Tabela.columnAtPoint(p);
        Tabela.setToolTipText(String.valueOf(dtm.getValueAt(row,column)));
    }//GEN-LAST:event_TabelaMouseMoved

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Editar;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
