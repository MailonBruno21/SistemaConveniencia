package efeitos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EfeitoMenu {

    private int movimentoX;

    public EfeitoMenu() {

    }

    /**
     *
     * @param jLabel
     * @param jPanel
     * @throws java.lang.InterruptedException
     */
    public void EfeitoIcone(JLabel jLabel, JPanel jPanel) throws InterruptedException {

        AdaptaMovimentoXResolucao(1280);

        if (jPanel.getX() != movimentoX) {

            Thread.sleep(1);

            jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BackgroundEfeitoItens.png")));
            jPanel.setLocation(getMovimentoX(), jPanel.getY());

        } else {

            Thread.sleep(1);

            jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BackgroundItensMenu.png")));
            jPanel.setLocation(0, jPanel.getY());
        }
    }

    private void AdaptaMovimentoXResolucao(int resolucao) {
        setMovimentoX((resolucao * 8) / 1280);
    }

    private int getMovimentoX() {
        return movimentoX;
    }

    private void setMovimentoX(int movimentoX) {
        this.movimentoX = movimentoX;
    }

}