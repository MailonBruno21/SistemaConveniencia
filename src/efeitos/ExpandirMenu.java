package efeitos;

import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pedri
 */
public class ExpandirMenu {

    JPanel painelLocal;
    JPanel painelCompara;
    int qtdItens;

    public ExpandirMenu(JPanel painel, int qtdItens, JPanel painelCompara) {
        this.painelLocal = painel;
        this.painelCompara = painelCompara;
        this.qtdItens = qtdItens;

    }

    public void DimencionarItem() {
        setSizePainel(painelLocal, qtdItens);
    }

    private boolean ComparaPainel() {
        return painelCompara.isVisible();
    }

    private int setSizePainel(JPanel painel, int qtdItens) {
        if (ComparaPainel() == false) {
            int coordenadaY = 27 + qtdItens * 50;
            painel.setSize(410, coordenadaY);
            return coordenadaY;
        } else {
            int coordenadaY = 27;
            painel.setSize(410, coordenadaY);
            return coordenadaY;
        }

    }

    public void RealocaMenu(JPanel painel, int coordenadaY) {
        painel.setLocation(0, coordenadaY);
    }

    public boolean ControllerBarraScroll(JPanel scrollPane, int y) {
        if (ComparaPainel() == false) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ExpandirMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            Dimension size = new Dimension(410, y);
            scrollPane.setPreferredSize(size);
            return true;
        } else {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ExpandirMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            Dimension size = new Dimension(410, 27);
            scrollPane.setPreferredSize(size);
            return false;
        }

    }
    
    public void SetaIndicacao(JLabel jLabel){
        
        if (ComparaPainel() == false) {
            jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaAberto.png")));
        } else {
            jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SetaFechado.png")));
            
        }
    }

}
