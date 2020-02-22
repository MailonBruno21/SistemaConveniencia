package view;

/*
*   Balcao->fechar conta->tela com valor e itens consumidos,opcao de zerar item, opcao de lancar item, painel receber(dinheiro/cartao)dinheiro faca, receber valor, mostrar troco
*        |->efetuar venda->
 */

import controller.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author pedri
 */
public class LoginView extends javax.swing.JFrame {

    private LoginController controller;

    public LoginView() {
        //INICIALIAZA A TELA DE LOGIN
        initComponents();
        //INICIALIZA UMA VARIAVEL PARA CONTROLE DO LOGIN
        controller = new LoginController(this);

    }

    /*
    * CONFIGURACOES DE INICIALIZACAO DA TELA DE LOGIN
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundJPanel = new javax.swing.JPanel();
        recuperarSenhaJButton = new javax.swing.JButton();
        usuarioJTextField = new javax.swing.JTextField();
        senhaJPasswordField = new javax.swing.JPasswordField();
        entrarJButton = new javax.swing.JButton();
        fecharJButton = new javax.swing.JButton();
        loginJLabel = new javax.swing.JLabel();
        recuperarSenhaJLabel = new javax.swing.JLabel();
        senhaJLabel = new javax.swing.JLabel();
        backgroundSenhaJLabel = new javax.swing.JLabel();
        backgroundUsuarioJLabel = new javax.swing.JLabel();
        backgroundPainelLoginJLabel = new javax.swing.JLabel();
        backgroundJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Conveniencia");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundJPanel.setToolTipText("");
        backgroundJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recuperarSenhaJButton.setBorder(null);
        recuperarSenhaJButton.setContentAreaFilled(false);
        recuperarSenhaJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundJPanel.add(recuperarSenhaJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 364, 130, 13));

        usuarioJTextField.requestFocus(false);
        usuarioJTextField.setBackground(new java.awt.Color(255, 0, 51, 1));
        usuarioJTextField.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        usuarioJTextField.setForeground(new java.awt.Color(255, 255, 255));
        usuarioJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuarioJTextField.setText("Nome de Usuario");
        usuarioJTextField.setToolTipText("");
        usuarioJTextField.setAutoscrolls(false);
        usuarioJTextField.setBorder(null);
        usuarioJTextField.setFocusTraversalPolicyProvider(false);
        usuarioJTextField.setOpaque(false);
        usuarioJTextField.setSelectionColor(new java.awt.Color(0, 0, 0));
        usuarioJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioJTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioJTextFieldFocusLost(evt);
            }
        });
        usuarioJTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioJTextFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuarioJTextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuarioJTextFieldMouseExited(evt);
            }
        });
        usuarioJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioJTextFieldActionPerformed(evt);
            }
        });
        backgroundJPanel.add(usuarioJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 226, 150, 15));

        senhaJPasswordField.setBackground(new java.awt.Color(102, 204, 0, 1));
        senhaJPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        senhaJPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaJPasswordField.setBorder(null);
        senhaJPasswordField.setOpaque(false);
        senhaJPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaJPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaJPasswordFieldFocusLost(evt);
            }
        });
        senhaJPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhaJPasswordFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                senhaJPasswordFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                senhaJPasswordFieldMouseExited(evt);
            }
        });
        senhaJPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaJPasswordFieldActionPerformed(evt);
            }
        });
        backgroundJPanel.add(senhaJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 266, 150, 15));

        entrarJButton.setBackground(new java.awt.Color(255, 255, 255, 1));
        entrarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Entrar.png"))); // NOI18N
        entrarJButton.setBorder(null);
        entrarJButton.setBorderPainted(false);
        entrarJButton.setContentAreaFilled(false);
        entrarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarJButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarJButtonMouseExited(evt);
            }
        });
        entrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarJButtonActionPerformed(evt);
            }
        });
        backgroundJPanel.add(entrarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 305, 233, -1));

        fecharJButton.setBackground(new java.awt.Color(153, 153, 153));
        fecharJButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fecharJButton.setForeground(new java.awt.Color(204, 204, 204));
        fecharJButton.setText("X");
        fecharJButton.setToolTipText("");
        fecharJButton.setBorder(null);
        fecharJButton.setContentAreaFilled(false);
        fecharJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fecharJButton.setRequestFocusEnabled(false);
        fecharJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharJButtonActionPerformed(evt);
            }
        });
        backgroundJPanel.add(fecharJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 0, 26, 25));

        loginJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LoginLogo.png"))); // NOI18N
        backgroundJPanel.add(loginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 172, -1, -1));

        recuperarSenhaJLabel.setFont(new java.awt.Font("Lucida Console", 1, 11)); // NOI18N
        recuperarSenhaJLabel.setForeground(new java.awt.Color(255, 255, 255));
        recuperarSenhaJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recuperarSenhaJLabel.setText("Recuperar senha?");
        recuperarSenhaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundJPanel.add(recuperarSenhaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 365, -1, -1));

        senhaJLabel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        senhaJLabel.setForeground(new java.awt.Color(255, 255, 255));
        senhaJLabel.setText("Senha");
        backgroundJPanel.add(senhaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 268, -1, -1));

        backgroundSenhaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png"))); // NOI18N
        backgroundSenhaJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        backgroundSenhaJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundSenhaJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundSenhaJLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backgroundSenhaJLabelMouseExited(evt);
            }
        });
        backgroundJPanel.add(backgroundSenhaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 260, 240, 28));

        backgroundUsuarioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png"))); // NOI18N
        backgroundUsuarioJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        backgroundUsuarioJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundUsuarioJLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundUsuarioJLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backgroundUsuarioJLabelMouseExited(evt);
            }
        });
        backgroundJPanel.add(backgroundUsuarioJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 220, 240, 28));

        backgroundPainelLoginJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        backgroundPainelLoginJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Plano de Fundo Transparente Login.png"))); // NOI18N
        backgroundPainelLoginJLabel.setToolTipText("");
        backgroundPainelLoginJLabel.setAlignmentY(0.0F);
        backgroundPainelLoginJLabel.setAutoscrolls(true);
        backgroundPainelLoginJLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backgroundPainelLoginJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundPainelLoginJLabelMouseClicked(evt);
            }
        });
        backgroundJPanel.add(backgroundPainelLoginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 168, 256, 212));

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Plano de Fundo Login.png"))); // NOI18N
        backgroundJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundJLabelMouseClicked(evt);
            }
        });
        backgroundJPanel.add(backgroundJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 331, 470));

        getContentPane().add(backgroundJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
        PARTE DEDICADA AO CAMPO USUARIO DA TELA DE LOGIN
     */
    //FAZ COM QUE A IMAGEM SOFRA UM EFEITO DE FICAR MAIS CLARA
    private void backgroundUsuarioJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundUsuarioJLabelMouseEntered
        //QUANDO O MOUSE PASSA POR CIMA DA  CAIXA DO USUARIO É ADICIONADO UMA IMAGEM MAIS CLARA NO BACKGROUND 
        backgroundUsuarioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/UsuarioEfeito.png")));
    }//GEN-LAST:event_backgroundUsuarioJLabelMouseEntered

    private void backgroundUsuarioJLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundUsuarioJLabelMouseExited
        //AQUI VOLTA A IMAGEM NORMAL ASSIM QUE O MOUSE SAI DE CIMA DA CAIXA DE USUARIO
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

        backgroundUsuarioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png")));
    }//GEN-LAST:event_backgroundUsuarioJLabelMouseExited

    private void usuarioJTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioJTextFieldMouseEntered
        backgroundUsuarioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/UsuarioEfeito.png")));/**/
    }//GEN-LAST:event_usuarioJTextFieldMouseEntered

    private void usuarioJTextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioJTextFieldMouseExited
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

        backgroundUsuarioJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png")));
    }//GEN-LAST:event_usuarioJTextFieldMouseExited

    private void usuarioJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioJTextFieldActionPerformed

    private void usuarioJTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioJTextFieldMouseClicked
           usuarioJTextField.setText("");
           
           usuarioJTextField.requestFocus(true);
           
        String text = senhaJPasswordField.getText();

        if ("".equals(text)) {
            senhaJLabel.setText("Senha");
            
        }
    }//GEN-LAST:event_usuarioJTextFieldMouseClicked

    /*
    PARTE DEDICADA AO CAMPO SENHA
     */

    private void backgroundSenhaJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundSenhaJLabelMouseEntered
        backgroundSenhaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/UsuarioEfeito.png")));/**/
    }//GEN-LAST:event_backgroundSenhaJLabelMouseEntered

    private void backgroundSenhaJLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundSenhaJLabelMouseExited
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

        backgroundSenhaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png")));


    }//GEN-LAST:event_backgroundSenhaJLabelMouseExited

    private void senhaJPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaJPasswordFieldActionPerformed

    }//GEN-LAST:event_senhaJPasswordFieldActionPerformed

    private void senhaJPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaJPasswordFieldMouseClicked
        senhaJLabel.setText("");
        senhaJPasswordField.requestFocus(true);
        
        String text = usuarioJTextField.getText();

        if ("".equals(text)) {
            usuarioJTextField.setText("Nome de Usuario");
            
        }
        
        
                      
    }//GEN-LAST:event_senhaJPasswordFieldMouseClicked

    private void senhaJPasswordFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaJPasswordFieldMouseEntered
        backgroundSenhaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/UsuarioEfeito.png")));/**/
    }//GEN-LAST:event_senhaJPasswordFieldMouseEntered

    private void senhaJPasswordFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaJPasswordFieldMouseExited
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

        backgroundSenhaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png")));
    }//GEN-LAST:event_senhaJPasswordFieldMouseExited

    /*
    CRIANDO EFEITOS DO MOUSE NO LOGIN E SENHA
     */

    
    private void backgroundPainelLoginJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundPainelLoginJLabelMouseClicked
                        
        String text = usuarioJTextField.getText();
        

        if ("".equals(text)) {
            usuarioJTextField.setText("Nome de Usuario");
            
        }
        
        text = senhaJPasswordField.getText();

        if ("".equals(text)) {
            senhaJLabel.setText("Senha");
            usuarioJTextField.requestFocus(false);
        }
        
        usuarioJTextField.requestFocus(false);
       
    }//GEN-LAST:event_backgroundPainelLoginJLabelMouseClicked

    private void backgroundJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundJLabelMouseClicked
        
        String text = usuarioJTextField.getText();
        

        if ("".equals(text)) {
            usuarioJTextField.setText("Nome de Usuario");
            
        }
        
        text = senhaJPasswordField.getText();

        if ("".equals(text)) {
            senhaJLabel.setText("Senha");
            usuarioJTextField.requestFocus(false);
        }
        
        usuarioJTextField.requestFocus(false);
    }//GEN-LAST:event_backgroundJLabelMouseClicked


    private void entrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarJButtonActionPerformed
        try {
            controller.autenticarLogin();
        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_entrarJButtonActionPerformed

 
 
    private void entrarJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseExited
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

        entrarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Entrar.png")));
    }//GEN-LAST:event_entrarJButtonMouseExited

    private void entrarJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseEntered
        entrarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EntrarEfeito.png")));/**/
    }//GEN-LAST:event_entrarJButtonMouseEntered

    private void entrarJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarJButtonMouseClicked

        entrarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EntrarEfeitoClick.png")));

        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_entrarJButtonMouseClicked
    /*
    POSSIBILITA CLICAR EM QUALQUER PARTE DA IMAGEM LOGIN E SENHA
     */
    private void backgroundUsuarioJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundUsuarioJLabelMouseClicked
        usuarioJTextFieldMouseClicked(evt);
    }//GEN-LAST:event_backgroundUsuarioJLabelMouseClicked

    private void backgroundSenhaJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundSenhaJLabelMouseClicked
        senhaJPasswordFieldMouseClicked(evt);
    }//GEN-LAST:event_backgroundSenhaJLabelMouseClicked

    private void fecharJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharJButtonActionPerformed
        dispose();
    }//GEN-LAST:event_fecharJButtonActionPerformed

    private void senhaJPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaJPasswordFieldFocusGained
       

    }//GEN-LAST:event_senhaJPasswordFieldFocusGained

    private void usuarioJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioJTextFieldFocusGained
       
 
    }//GEN-LAST:event_usuarioJTextFieldFocusGained

    private void usuarioJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioJTextFieldFocusLost
        
    }//GEN-LAST:event_usuarioJTextFieldFocusLost

    private void senhaJPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaJPasswordFieldFocusLost
       
    }//GEN-LAST:event_senhaJPasswordFieldFocusLost

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JPanel backgroundJPanel;
    private javax.swing.JLabel backgroundPainelLoginJLabel;
    private javax.swing.JLabel backgroundSenhaJLabel;
    private javax.swing.JLabel backgroundUsuarioJLabel;
    private javax.swing.JButton entrarJButton;
    private javax.swing.JButton fecharJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton recuperarSenhaJButton;
    private javax.swing.JLabel recuperarSenhaJLabel;
    private javax.swing.JLabel senhaJLabel;
    private javax.swing.JPasswordField senhaJPasswordField;
    private javax.swing.JTextField usuarioJTextField;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JPasswordField getSenhaJPasswordField() {
        return senhaJPasswordField;
    }

    public void setSenhaJPasswordField(javax.swing.JPasswordField senhaJPasswordField) {
        this.senhaJPasswordField = senhaJPasswordField;
    }

    public javax.swing.JTextField getUsuarioJTextField() {
        return usuarioJTextField;
    }

    public void setUsuarioJTextField(javax.swing.JTextField usuarioJTextField) {
        this.usuarioJTextField = usuarioJTextField;
    }


}
