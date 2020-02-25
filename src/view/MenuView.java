package view;

import extencaoBiblioteca.CustomScrolBarUI;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {

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

        menuJPanel = new javax.swing.JPanel();
        menuItemJPanel = new javax.swing.JPanel();
        painelMenuItemJPanel = new javax.swing.JPanel();
        scrollMenuItemJScrollPane = new javax.swing.JScrollPane();
        painelScrollMenuItemJScrollPane = new javax.swing.JPanel();
        painelVendasJPanel = new javax.swing.JPanel();
        painelExpansivoVendasJPanel = new javax.swing.JPanel();
        vendasJLabel = new javax.swing.JLabel();
        indicadorVendasJPanel = new javax.swing.JPanel();
        indicadorVendasJLabel = new javax.swing.JLabel();
        painelBalcaoJPanel = new javax.swing.JPanel();
        textoBalcaoJLabel = new javax.swing.JLabel();
        iconeBalcao = new javax.swing.JLabel();
        backgroundBalcaoJLabel = new javax.swing.JLabel();
        painelComandaJPanel = new javax.swing.JPanel();
        textoComandaJLabel = new javax.swing.JLabel();
        iconeComanda = new javax.swing.JLabel();
        backgroundComandaJLabel = new javax.swing.JLabel();
        painelMapaComandaJPanel = new javax.swing.JPanel();
        textoMapaComandaJLabel = new javax.swing.JLabel();
        backgroundMapaComandaJLabel = new javax.swing.JLabel();
        painelCaixaJPanel = new javax.swing.JPanel();
        painelExpansivoCaixaItemJPanel = new javax.swing.JPanel();
        caixaItemJLabel = new javax.swing.JLabel();
        indicadorCaixaItemJPanel = new javax.swing.JPanel();
        indicadorCaixaItemJLabel = new javax.swing.JLabel();
        painelCaixaAbrirFecharJPanel = new javax.swing.JPanel();
        iconeCaixaAbrirFecharJLabel = new javax.swing.JLabel();
        backgroundCaixaJLabel = new javax.swing.JLabel();
        painelRelatorioCaixaJPanel = new javax.swing.JPanel();
        backgroundRelatorioCaixaJLabel = new javax.swing.JLabel();
        painelReceberContasJPanel = new javax.swing.JPanel();
        backgroundReceberContasJLabel = new javax.swing.JLabel();
        menuItemJlabel = new javax.swing.JLabel();
        menuJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuJFrame");
        setMaximumSize(new java.awt.Dimension(1980, 1080));
        setName("MenuJFrame"); // NOI18N
        setUndecorated(true);

        menuJPanel.setMaximumSize(getMaximumSize());
        menuJPanel.setMinimumSize(getMinimumSize());
        menuJPanel.setName(""); // NOI18N
        menuJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuItemJPanel.setAlignmentX(0.0F);
        menuItemJPanel.setAlignmentY(0.0F);
        menuItemJPanel.setMaximumSize(new java.awt.Dimension(422, 668));
        menuItemJPanel.setName(""); // NOI18N
        menuItemJPanel.setOpaque(false);
        menuItemJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMenuItemJPanel.setOpaque(false);
        painelMenuItemJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollMenuItemJScrollPane.setBackground(new Color(0,0,0,0));

        scrollMenuItemJScrollPane.setViewportBorder(null);

        scrollMenuItemJScrollPane.getVerticalScrollBar().setUI(new CustomScrolBarUI());
        scrollMenuItemJScrollPane.setOpaque(false);
        scrollMenuItemJScrollPane.getViewport().setOpaque(false);
        scrollMenuItemJScrollPane.setBorder(null);
        scrollMenuItemJScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollMenuItemJScrollPane.setAlignmentX(0.0F);
        scrollMenuItemJScrollPane.setAlignmentY(0.0F);
        scrollMenuItemJScrollPane.setMaximumSize(painelMenuItemJPanel.getMaximumSize());
        scrollMenuItemJScrollPane.setMinimumSize(painelMenuItemJPanel.getMinimumSize());
        scrollMenuItemJScrollPane.setPreferredSize(painelMenuItemJPanel.getPreferredSize());

        painelScrollMenuItemJScrollPane.setOpaque(false);
        painelScrollMenuItemJScrollPane.setLayout(null);

        painelVendasJPanel.setOpaque(false);
        painelVendasJPanel.setLayout(null);

        painelExpansivoVendasJPanel.setMinimumSize(new java.awt.Dimension(380, 20));
        painelExpansivoVendasJPanel.setOpaque(false);
        painelExpansivoVendasJPanel.setPreferredSize(new java.awt.Dimension(380, 20));
        painelExpansivoVendasJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelExpansivoVendasJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelExpansivoVendasJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelExpansivoVendasJPanelMouseExited(evt);
            }
        });
        painelExpansivoVendasJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vendasJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        vendasJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ItemVendas.png"))); // NOI18N
        painelExpansivoVendasJPanel.add(vendasJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 20));

        indicadorVendasJPanel.setOpaque(false);
        indicadorVendasJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indicadorVendasJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaFechado.png"))); // NOI18N
        indicadorVendasJPanel.add(indicadorVendasJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 15, 15));

        painelExpansivoVendasJPanel.add(indicadorVendasJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1, 15, 15));

        painelVendasJPanel.add(painelExpansivoVendasJPanel);
        painelExpansivoVendasJPanel.setBounds(0, 0, 382, 20);

        painelBalcaoJPanel.setAlignmentX(0.0F);
        painelBalcaoJPanel.setAlignmentY(0.0F);
        painelBalcaoJPanel.setOpaque(false);
        painelBalcaoJPanel.setVisible(false);
        painelBalcaoJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoBalcaoJLabel.setFont(new java.awt.Font("Futura Bk BT", 0, 24)); // NOI18N
        textoBalcaoJLabel.setText("Balcão");
        textoBalcaoJLabel.setAlignmentY(0.0F);
        painelBalcaoJPanel.add(textoBalcaoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 10, 261, 26));

        iconeBalcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconeBalcao.png"))); // NOI18N
        painelBalcaoJPanel.add(iconeBalcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 0, 40, 40));

        backgroundBalcaoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuBalcao.png"))); // NOI18N
        painelBalcaoJPanel.add(backgroundBalcaoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 380, 40));

        painelVendasJPanel.add(painelBalcaoJPanel);
        painelBalcaoJPanel.setBounds(0, 23, 382, 40);

        painelComandaJPanel.setBackground(new java.awt.Color(102, 255, 153));
        painelComandaJPanel.setOpaque(false);
        painelComandaJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelComandaJPanel.setVisible(false);

        textoComandaJLabel.setFont(new java.awt.Font("Futura Bk BT", 0, 24)); // NOI18N
        textoComandaJLabel.setText("Comanda");
        textoComandaJLabel.setToolTipText("");
        textoComandaJLabel.setAlignmentY(0.0F);
        painelComandaJPanel.add(textoComandaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 7, 261, 26));
        painelComandaJPanel.add(iconeComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 0, 40, 40));

        backgroundComandaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuBalcao.png"))); // NOI18N
        painelComandaJPanel.add(backgroundComandaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        painelVendasJPanel.add(painelComandaJPanel);
        painelComandaJPanel.setBounds(0, 69, 382, 40);

        painelMapaComandaJPanel.setBackground(new java.awt.Color(153, 255, 153));
        painelMapaComandaJPanel.setOpaque(false);
        painelMapaComandaJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelMapaComandaJPanel.setVisible(false);

        textoMapaComandaJLabel.setFont(new java.awt.Font("Futura Bk BT", 0, 24)); // NOI18N
        textoMapaComandaJLabel.setText("Mapa de Comandas");
        textoMapaComandaJLabel.setAlignmentY(0.0F);
        painelMapaComandaJPanel.add(textoMapaComandaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 7, 261, 26));

        backgroundMapaComandaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuBalcao.png"))); // NOI18N
        backgroundMapaComandaJLabel.setAlignmentY(0.0F);
        painelMapaComandaJPanel.add(backgroundMapaComandaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        painelVendasJPanel.add(painelMapaComandaJPanel);
        painelMapaComandaJPanel.setBounds(0, 112, 382, 40);

        painelScrollMenuItemJScrollPane.add(painelVendasJPanel);
        painelVendasJPanel.setBounds(0, 0, 382, 160);

        painelCaixaJPanel.setMinimumSize(new java.awt.Dimension(380, 160));
        painelCaixaJPanel.setOpaque(false);
        painelCaixaJPanel.setPreferredSize(new java.awt.Dimension(380, 155));
        painelCaixaJPanel.setLayout(null);

        painelExpansivoCaixaItemJPanel.setOpaque(false);
        painelExpansivoCaixaItemJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelExpansivoCaixaItemJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelExpansivoCaixaItemJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelExpansivoCaixaItemJPanelMouseExited(evt);
            }
        });
        painelExpansivoCaixaItemJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caixaItemJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        caixaItemJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ItemVendas.png"))); // NOI18N
        painelExpansivoCaixaItemJPanel.add(caixaItemJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 20));

        indicadorCaixaItemJPanel.setOpaque(false);
        indicadorCaixaItemJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        indicadorCaixaItemJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaFechado.png"))); // NOI18N
        indicadorCaixaItemJPanel.add(indicadorCaixaItemJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 15, 15));

        painelExpansivoCaixaItemJPanel.add(indicadorCaixaItemJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 1, 15, 15));

        painelCaixaJPanel.add(painelExpansivoCaixaItemJPanel);
        painelExpansivoCaixaItemJPanel.setBounds(0, 0, 380, 20);

        painelCaixaAbrirFecharJPanel.setOpaque(false);
        painelCaixaAbrirFecharJPanel.setVisible(false);
        painelCaixaAbrirFecharJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeCaixaAbrirFecharJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconeBalcao.png"))); // NOI18N
        painelCaixaAbrirFecharJPanel.add(iconeCaixaAbrirFecharJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 3, 40, 40));

        backgroundCaixaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuBalcao.png"))); // NOI18N
        painelCaixaAbrirFecharJPanel.add(backgroundCaixaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 380, 40));

        painelCaixaJPanel.add(painelCaixaAbrirFecharJPanel);
        painelCaixaAbrirFecharJPanel.setBounds(0, 23, 380, 40);

        painelRelatorioCaixaJPanel.setBackground(new java.awt.Color(102, 255, 153));
        painelRelatorioCaixaJPanel.setOpaque(false);
        painelRelatorioCaixaJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelRelatorioCaixaJPanel.setVisible(false);

        backgroundRelatorioCaixaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuBalcao.png"))); // NOI18N
        painelRelatorioCaixaJPanel.add(backgroundRelatorioCaixaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        painelCaixaJPanel.add(painelRelatorioCaixaJPanel);
        painelRelatorioCaixaJPanel.setBounds(0, 66, 380, 40);

        painelReceberContasJPanel.setBackground(new java.awt.Color(153, 255, 153));
        painelReceberContasJPanel.setOpaque(false);
        painelReceberContasJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelReceberContasJPanel.setVisible(false);

        backgroundReceberContasJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MenuBalcao.png"))); // NOI18N
        painelReceberContasJPanel.add(backgroundReceberContasJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        painelCaixaJPanel.add(painelReceberContasJPanel);
        painelReceberContasJPanel.setBounds(0, 109, 380, 40);

        painelScrollMenuItemJScrollPane.add(painelCaixaJPanel);
        painelCaixaJPanel.setBounds(0, 165, 382, 155);
        painelCaixaJPanel.setBounds(0, 40, 382, 155);

        scrollMenuItemJScrollPane.setViewportView(painelScrollMenuItemJScrollPane);

        painelMenuItemJPanel.add(scrollMenuItemJScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 382, 425));

        menuItemJPanel.add(painelMenuItemJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 230, 382, 425));

        menuItemJlabel.setBackground(new java.awt.Color(102, 255, 102));
        menuItemJlabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemJlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BackgroundMenuItem.png"))); // NOI18N
        menuItemJlabel.setToolTipText("");
        menuItemJlabel.setAlignmentY(0.0F);
        menuItemJlabel.setMinimumSize(new java.awt.Dimension(0, 0));
        menuItemJPanel.add(menuItemJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 422, 668));

        menuJPanel.add(menuItemJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 26, -1, -1));

        menuJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BackgroundMenu.png"))); // NOI18N
        menuJLabel.setToolTipText("");
        menuJLabel.setMaximumSize(getMaximumSize());
        menuJLabel.setMinimumSize(getMinimumSize());
        menuJPanel.add(menuJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //EXPANDE O TOPICO VENDAS
    private void painelExpansivoVendasJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelExpansivoVendasJPanelMouseClicked

        if (painelBalcaoJPanel.isVisible() == false) {
               
            

            painelVendasJPanel.setSize(380, (painelBalcaoJPanel.getHeight() + painelExpansivoVendasJPanel.getHeight() + painelComandaJPanel.getHeight() + painelMapaComandaJPanel.getHeight()+ 15));
            
            painelCaixaJPanel.setBounds(0, painelVendasJPanel.getHeight()+10, 382, 155);
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
            }
            indicadorVendasJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaAberto.png"))); // NOI18N

            painelBalcaoJPanel.setVisible(true);
            painelComandaJPanel.setVisible(true);
            painelMapaComandaJPanel.setVisible(true);

        } else {
            
            

            painelBalcaoJPanel.setVisible(false);
            painelComandaJPanel.setVisible(false);
            painelMapaComandaJPanel.setVisible(false);
            
            
            
            indicadorVendasJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaFechado.png"))); // NOI18N

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            painelVendasJPanel.setSize(380, painelExpansivoVendasJPanel.getHeight());
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            painelCaixaJPanel.setBounds(0, painelVendasJPanel.getHeight()+10, 382, 155);
        }
    }//GEN-LAST:event_painelExpansivoVendasJPanelMouseClicked
    


    //DESTACA EM NEGRITO QUANDO MOUSE PASSA POR CIMA VENDAS
    private void painelExpansivoVendasJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelExpansivoVendasJPanelMouseEntered
        vendasJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ItemVendasNegrito.png"))); // NOI18N

    }//GEN-LAST:event_painelExpansivoVendasJPanelMouseEntered

    private void painelExpansivoVendasJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelExpansivoVendasJPanelMouseExited
        vendasJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ItemVendas.png"))); // NOI18N
    }//GEN-LAST:event_painelExpansivoVendasJPanelMouseExited
 

//EXPANDE O TOPICO CAIXA
    private void painelExpansivoCaixaItemJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelExpansivoCaixaItemJPanelMouseClicked
        if (painelCaixaAbrirFecharJPanel.isVisible() == false) {
            
            painelCaixaJPanel.setSize(380, (painelCaixaAbrirFecharJPanel.getHeight() + painelExpansivoCaixaItemJPanel.getHeight() + painelRelatorioCaixaJPanel.getHeight() + painelReceberContasJPanel.getHeight()+15));

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
            }
            indicadorCaixaItemJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaAberto.png"))); // NOI18N

            painelCaixaAbrirFecharJPanel.setVisible(true);
            painelRelatorioCaixaJPanel.setVisible(true);
            painelReceberContasJPanel.setVisible(true);

        } else {

            painelCaixaAbrirFecharJPanel.setVisible(false);
            painelRelatorioCaixaJPanel.setVisible(false);
            painelReceberContasJPanel.setVisible(false);
            
            indicadorCaixaItemJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaFechado.png"))); // NOI18N

            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            indicadorCaixaItemJLabel.setSize(380, painelExpansivoCaixaItemJPanel.getHeight());
        }
    }//GEN-LAST:event_painelExpansivoCaixaItemJPanelMouseClicked


//DESTACA EM NEGRITO QUANDO MOUSE PASSA POR CIMA CAIXA
    private void painelExpansivoCaixaItemJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelExpansivoCaixaItemJPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_painelExpansivoCaixaItemJPanelMouseEntered

    private void painelExpansivoCaixaItemJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelExpansivoCaixaItemJPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_painelExpansivoCaixaItemJPanelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundBalcaoJLabel;
    private javax.swing.JLabel backgroundCaixaJLabel;
    private javax.swing.JLabel backgroundComandaJLabel;
    private javax.swing.JLabel backgroundMapaComandaJLabel;
    private javax.swing.JLabel backgroundReceberContasJLabel;
    private javax.swing.JLabel backgroundRelatorioCaixaJLabel;
    private javax.swing.JLabel caixaItemJLabel;
    private javax.swing.JLabel iconeBalcao;
    private javax.swing.JLabel iconeCaixaAbrirFecharJLabel;
    private javax.swing.JLabel iconeComanda;
    private javax.swing.JLabel indicadorCaixaItemJLabel;
    private javax.swing.JPanel indicadorCaixaItemJPanel;
    private javax.swing.JLabel indicadorVendasJLabel;
    private javax.swing.JPanel indicadorVendasJPanel;
    private javax.swing.JPanel menuItemJPanel;
    private javax.swing.JLabel menuItemJlabel;
    private javax.swing.JLabel menuJLabel;
    private javax.swing.JPanel menuJPanel;
    private javax.swing.JPanel painelBalcaoJPanel;
    private javax.swing.JPanel painelCaixaAbrirFecharJPanel;
    private javax.swing.JPanel painelCaixaJPanel;
    private javax.swing.JPanel painelComandaJPanel;
    private javax.swing.JPanel painelExpansivoCaixaItemJPanel;
    private javax.swing.JPanel painelExpansivoVendasJPanel;
    private javax.swing.JPanel painelMapaComandaJPanel;
    private javax.swing.JPanel painelMenuItemJPanel;
    private javax.swing.JPanel painelReceberContasJPanel;
    private javax.swing.JPanel painelRelatorioCaixaJPanel;
    private javax.swing.JPanel painelScrollMenuItemJScrollPane;
    private javax.swing.JPanel painelVendasJPanel;
    private javax.swing.JScrollPane scrollMenuItemJScrollPane;
    private javax.swing.JLabel textoBalcaoJLabel;
    private javax.swing.JLabel textoComandaJLabel;
    private javax.swing.JLabel textoMapaComandaJLabel;
    private javax.swing.JLabel vendasJLabel;
    // End of variables declaration//GEN-END:variables
}
