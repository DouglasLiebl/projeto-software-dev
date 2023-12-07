/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.pages;

import io.github.Main;
import io.github.pages.generalPopUp.Message;
import io.github.pages.generalPopUp.glass.GlassPanePopup;
import io.github.pages.textField.TextField;
import io.github.service.LoanService;
import io.github.service.impl.LoanServiceImpl;
import org.postgresql.util.PSQLException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.MonitorInfo;

/**
 *
 * @author dougl
 */
public class CreateLoanPage extends javax.swing.JFrame {

    /**
     * Creates new form CreateLoanPage
     */
    public CreateLoanPage() {
        initComponents();
        GlassPanePopup.install(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabelCadastrarFilme = new javax.swing.JLabel();
        buttonCancelar = new io.github.pages.button.Button();
        buttonSalvar = new io.github.pages.button.Button();
        buttonLimpar = new io.github.pages.button.Button();
        textFieldEmail = new io.github.pages.textField.TextField();
        textFieldID = new io.github.pages.textField.TextField();
        textFieldDevolver = new io.github.pages.textField.TextField();
        buttonDevolver = new io.github.pages.button.Button();
        buttonAlugar = new io.github.pages.button.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(760, 460));

        jLabelCadastrarFilme.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabelCadastrarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clapperboard.png"))); // NOI18N
        jLabelCadastrarFilme.setText("Alugar Filme");

        buttonCancelar.setText("Cancelar");
        buttonCancelar.setFocusPainted(false);
        buttonCancelar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.setFocusPainted(false);
        buttonSalvar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar Campos");
        buttonLimpar.setFocusPainted(false);
        buttonLimpar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        textFieldEmail.setEnabled(false);
        textFieldEmail.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldEmail.setLabelText("Email");

        textFieldID.setEnabled(false);
        textFieldID.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldID.setLabelText("Id Filme");

        textFieldDevolver.setEnabled(false);
        textFieldDevolver.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldDevolver.setLabelText("Código de devolução");

        buttonDevolver.setText("Devolver");
        buttonDevolver.setFocusPainted(false);
        buttonDevolver.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDevolverActionPerformed(evt);
            }
        });

        buttonAlugar.setText("Alugar");
        buttonAlugar.setFocusPainted(false);
        buttonAlugar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(textFieldDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCadastrarFilme))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelCadastrarFilme)
                .addGap(44, 44, 44)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
        mainPage.setVisible(true);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        try {



            if (textFieldEmail.isEnabled()) {
                if (textFieldEmail.getText().isBlank() || textFieldID.getText().isBlank()) throw new Exception("Os campos necessários não podem estar em branco.");
                if (!textFieldEmail.getText().contains("@") || textFieldEmail.getText().contains(" ")) throw new Exception("Email inválido.");;

                var email = textFieldEmail.getText();
                var id = Long.parseLong(textFieldID.getText());

                service.createLoan(id, email);
            }

            if (textFieldDevolver.isEnabled()) {
                if (textFieldDevolver.getText().isBlank()) throw new Exception("Os campos necessários não podem estar em branco.");
                var code = textFieldDevolver.getText();
                service.updateStatus(code);
            }

        } catch (Exception e) {
            if (e instanceof RuntimeException) showPopUp("Filme alugado com sucesso!" + e.getMessage(), "Operação bem sucedida:");
            else if (e instanceof PSQLException) showPopUp("Filme devolvido com sucesso!", "Operação bem sucedida.");
            else showPopUp(e.getMessage(), "Erro:");
            buttonLimparActionPerformed(evt);
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textFieldEmail.setText("");
        textFieldID.setText("");
        textFieldDevolver.setText("");
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlugarActionPerformed
        textFieldEmail.setEnabled(true);
        textFieldID.setEnabled(true);
        textFieldDevolver.setEnabled(false);
        buttonLimparActionPerformed(evt);
    }//GEN-LAST:event_buttonAlugarActionPerformed

    private void buttonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDevolverActionPerformed
        textFieldDevolver.setEnabled(true);
        textFieldEmail.setEnabled(false);
        textFieldID.setEnabled(false);
        buttonLimparActionPerformed(evt);
    }//GEN-LAST:event_buttonDevolverActionPerformed

    private void showPopUp(String message, String title) {
        Message obj = new Message();
        obj.setMessage(message);
        obj.setTitle(title);
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
    }
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
            java.util.logging.Logger.getLogger(CreateLoanPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateLoanPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateLoanPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateLoanPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateLoanPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.pages.button.Button buttonAlugar;
    private io.github.pages.button.Button buttonCancelar;
    private io.github.pages.button.Button buttonDevolver;
    private io.github.pages.button.Button buttonLimpar;
    private io.github.pages.button.Button buttonSalvar;
    private javax.swing.JLabel jLabelCadastrarFilme;
    private keeptoo.KGradientPanel kGradientPanel1;
    private io.github.pages.textField.TextField textFieldDevolver;
    private io.github.pages.textField.TextField textFieldEmail;
    private io.github.pages.textField.TextField textFieldID;
    // End of variables declaration//GEN-END:variables
    private TextField textField;
    private MainPage mainPage = new MainPage();
    private LoanService service = new LoanServiceImpl();
}
