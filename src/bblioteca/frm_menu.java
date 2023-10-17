/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bblioteca;
import bblioteca.frm_livros;
import bblioteca.frm_usuarios;


/**
 *
 * @author will
 */
public class frm_menu extends javax.swing.JFrame {

    /**
     * Creates new form frm_menu
     */
    public frm_menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_add_livros = new javax.swing.JLabel();
        lbl_funcionarios = new javax.swing.JLabel();
        lbl_cad_usuarios = new javax.swing.JLabel();
        lbl_ver_livros = new javax.swing.JLabel();
        lbl_emprestimos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Biblioteca");

        lbl_add_livros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_add_livros.setText("Adicionar livro");
        lbl_add_livros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add_livrosMouseClicked(evt);
            }
        });

        lbl_funcionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_funcionarios.setText("Cadastrar funcionarios");
        lbl_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_funcionariosMouseClicked(evt);
            }
        });

        lbl_cad_usuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_cad_usuarios.setText("Cadastrar usuarios");
        lbl_cad_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cad_usuariosMouseClicked(evt);
            }
        });

        lbl_ver_livros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ver_livros.setText("Ver livros");
        lbl_ver_livros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ver_livrosMouseClicked(evt);
            }
        });

        lbl_emprestimos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_emprestimos.setText("Emprestimos");
        lbl_emprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_emprestimosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cad_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_add_livros, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_ver_livros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_emprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)
                        .addComponent(lbl_add_livros))
                    .addComponent(lbl_ver_livros))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_funcionarios)
                    .addComponent(lbl_emprestimos))
                .addGap(18, 18, 18)
                .addComponent(lbl_cad_usuarios)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_add_livrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_add_livrosMouseClicked
        // TODO add your handling code here:
        
        frm_livros objfrm_livros = new frm_livros();
         objfrm_livros.setVisible(true);
                
                dispose();
                
    }//GEN-LAST:event_lbl_add_livrosMouseClicked

    private void lbl_funcionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_funcionariosMouseClicked
        // TODO add your handling code here:
        
        frm_funcionarios objfrm_funcionarios = new frm_funcionarios();
         objfrm_funcionarios.setVisible(true);
         
         dispose();
         
    }//GEN-LAST:event_lbl_funcionariosMouseClicked

    private void lbl_cad_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cad_usuariosMouseClicked
        // TODO add your handling code here:
        
        frm_usuarios objfrm_usuarios = new frm_usuarios();
         objfrm_usuarios.setVisible(true);
         
         dispose();
         
    }//GEN-LAST:event_lbl_cad_usuariosMouseClicked

    private void lbl_ver_livrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ver_livrosMouseClicked
        // TODO add your handling code here:
        
        frm_ver_livros objfrm_ver_livros = new frm_ver_livros();
         objfrm_ver_livros.setVisible(true);
         
         dispose();
         
    }//GEN-LAST:event_lbl_ver_livrosMouseClicked

    private void lbl_emprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_emprestimosMouseClicked
        // TODO add your handling code here:
        
        frm_emprestimos objfrm_emprestimos  = new frm_emprestimos ();
         objfrm_emprestimos .setVisible(true);
         
         dispose();
         
    }//GEN-LAST:event_lbl_emprestimosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_add_livros;
    private javax.swing.JLabel lbl_cad_usuarios;
    private javax.swing.JLabel lbl_emprestimos;
    private javax.swing.JLabel lbl_funcionarios;
    private javax.swing.JLabel lbl_ver_livros;
    // End of variables declaration//GEN-END:variables
}
