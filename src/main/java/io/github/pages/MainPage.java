/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.pages;

import io.github.entities.Client;

/**
 *
 * @author dougl
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
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

        kGradientPanel6 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemFilme = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemDadosCliente = new javax.swing.JMenuItem();
        jMenuItemDisponibilidade = new javax.swing.JMenuItem();
        jMenuAtualizar = new javax.swing.JMenu();
        jMenuFilme = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAlugar = new javax.swing.JMenu();
        jMenuItemAlugar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        kGradientPanel6.setkEndColor(new java.awt.Color(153, 153, 255));
        kGradientPanel6.setkStartColor(new java.awt.Color(0, 204, 204));

        jTable1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar1.setNextFocusableComponent(jMenuBar1);

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clapperboard.png"))); // NOI18N
        jMenuCadastro.setText("Cadastrar");
        jMenuCadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jMenuItemFilme.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuItemFilme.setText("Filme");
        jMenuItemFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFilmeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFilme);

        jMenuItemCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFuncionario);

        jMenuBar1.add(jMenuCadastro);

        jMenu1.setText("Consultar");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jMenuItemDadosCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemDadosCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuItemDadosCliente.setText("Dados Cliente");
        jMenu1.add(jMenuItemDadosCliente);

        jMenuItemDisponibilidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemDisponibilidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuItemDisponibilidade.setText("Disponibilidade");
        jMenu1.add(jMenuItemDisponibilidade);

        jMenuBar1.add(jMenu1);

        jMenuAtualizar.setText("Atualizar");
        jMenuAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuAtualizar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jMenuFilme.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuFilme.setText("Filme");
        jMenuFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFilmeActionPerformed(evt);
            }
        });
        jMenuAtualizar.add(jMenuFilme);

        jMenuCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenuAtualizar.add(jMenuCliente);

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAtualizar.add(jMenuItem1);

        jMenuBar1.add(jMenuAtualizar);

        jMenuAlugar.setText("Alugar");
        jMenuAlugar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jMenuAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlugarActionPerformed(evt);
            }
        });

        jMenuItemAlugar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemAlugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seta-pequena-direita.png"))); // NOI18N
        jMenuItemAlugar.setText("Alugar");
        jMenuItemAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlugarActionPerformed(evt);
            }
        });
        jMenuAlugar.add(jMenuItemAlugar);

        jMenuBar1.add(jMenuAlugar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFilmeActionPerformed
        MovieRegisterPage registerPage = new MovieRegisterPage();
        registerPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemFilmeActionPerformed

    private void jMenuFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFilmeActionPerformed
        MovieEditPage editPage = new MovieEditPage();
        editPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuFilmeActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        ClientRegisterPage registerPage = new ClientRegisterPage();
        registerPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAlugarActionPerformed

    private void jMenuItemAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlugarActionPerformed
        CreateLoanPage loanPage = new CreateLoanPage();
        loanPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemAlugarActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        CreateEmployeePage employeePage = new CreateEmployeePage();
        employeePage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        EditClientPage editClientPage = new EditClientPage();
        editClientPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        EditEmployeePage employeePage = new EditEmployeePage();
        employeePage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAlugar;
    private javax.swing.JMenu jMenuAtualizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuFilme;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAlugar;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemDadosCliente;
    private javax.swing.JMenuItem jMenuItemDisponibilidade;
    private javax.swing.JMenuItem jMenuItemFilme;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel6;
    // End of variables declaration//GEN-END:variables
}
