package gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Mesa extends javax.swing.JFrame {

    List<JLabel> listaCartas;
    private int fichas;
    List<Carta> baralho;

    public void setFichas(int fichas) {
        this.fichas = fichas;
        jLabelFichas.setText(String.valueOf(fichas));
    }

    public void setNomeJogador(String nomeJogador) {
        jLabelJogador.setText(nomeJogador);
    }

    public void novoJogo() {
        jMenuItemIniciarActionPerformed(null);
        
    }

    public Mesa() {
        setTitle("Black Jack");

        initComponents();
        setLocationRelativeTo(null);
        listaCartas = new ArrayList<>();
        listaCartas.add(jLabelCartaJogador1);
        listaCartas.add(jLabelCartaJogador2);
        listaCartas.add(jLabelCartaJogador3);
        listaCartas.add(jLabelCartaJogador4);
        listaCartas.add(jLabelCartaJogador5);
        listaCartas.add(jLabelCartaJogador6);
        listaCartas.add(jLabelCartaJogador7);
        listaCartas.add(jLabelCartaJogador8);
        listaCartas.add(jLabelCartaJogador9);
        listaCartas.add(jLabelCartaJogador10);
        listaCartas.add(jLabelCartaJogador11);
        listaCartas.add(jLabelCartaJogador12);
        listaCartas.add(jLabelCartaJogador13);
        listaCartas.add(jLabelCartaJogador14);
        listaCartas.add(jLabelCartaJogador15);
        listaCartas.add(jLabelCartaJogador16);
        listaCartas.add(jLabelCartaJogador17);
        listaCartas.add(jLabelCartaJogador18);
        listaCartas.add(jLabelCartaJogador19);
        listaCartas.add(jLabelCartaJogador20);
        listaCartas.add(jLabelCartaJogador21);
        listaCartas.add(jLabelCartaJogador22);
        baralho = getBaralho();

    }

    private List<Carta> getBaralho() {

        if (baralho == null) {
            baralho = new ArrayList<>();
            for (int i = 1; i <= 13; i++) {
                for (int j = 1; j <= 4; j++) {
                    String numero = i == 1 ? "A" : (i <= 10 ? String.valueOf(i) : (i == 11 ? "J" : (i == 12 ? "Q" : "K")));
                    String naipe = j == Carta.COPAS ? "H" : (j == Carta.ESPADAS ? "S" : (j == Carta.OURO ? "D" : "C"));
                    baralho.add(new Carta(i, j, new ImageIcon(getClass().getResource("/imagens/" + numero + naipe + ".png"))));
                }
            }
        }
        
        return baralho;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMesa = new javax.swing.JPanel();
        jLabelCartaJogador1 = new javax.swing.JLabel();
        jLabelApostasRotulo = new javax.swing.JLabel();
        jLabelApostas = new javax.swing.JLabel();
        jLabelCartaJogador2 = new javax.swing.JLabel();
        jLabelCartaJogador3 = new javax.swing.JLabel();
        jLabelCartaJogador4 = new javax.swing.JLabel();
        jLabelCartaJogador5 = new javax.swing.JLabel();
        jLabelCartaJogador6 = new javax.swing.JLabel();
        jLabelCartaJogador7 = new javax.swing.JLabel();
        jLabelCartaJogador8 = new javax.swing.JLabel();
        jLabelMonte = new javax.swing.JLabel();
        jLabelCartaJogador10 = new javax.swing.JLabel();
        jLabelCartaJogador11 = new javax.swing.JLabel();
        jLabelCartaJogador9 = new javax.swing.JLabel();
        jLabelCartaJogador12 = new javax.swing.JLabel();
        jLabelCartaJogador13 = new javax.swing.JLabel();
        jLabelCartaJogador14 = new javax.swing.JLabel();
        jLabelCartaJogador15 = new javax.swing.JLabel();
        jLabelCartaJogador16 = new javax.swing.JLabel();
        jLabelCartaJogador17 = new javax.swing.JLabel();
        jLabelCartaJogador18 = new javax.swing.JLabel();
        jLabelCartaJogador19 = new javax.swing.JLabel();
        jLabelCartaJogador20 = new javax.swing.JLabel();
        jLabelCartaJogador21 = new javax.swing.JLabel();
        jLabelCartaJogador22 = new javax.swing.JLabel();
        jLabelSomaRotulo = new javax.swing.JLabel();
        jLabelSoma = new javax.swing.JLabel();
        jLabelSomaCroupierRotulo = new javax.swing.JLabel();
        jLabelSomaCroupier = new javax.swing.JLabel();
        jLabelCroupier = new javax.swing.JLabel();
        jLabelJogador = new javax.swing.JLabel();
        jLabelFichasRotulo = new javax.swing.JLabel();
        jLabelFichas = new javax.swing.JLabel();
        jButtonHit = new javax.swing.JButton();
        jButtonStand = new javax.swing.JButton();
        jButtonSurrender = new javax.swing.JButton();
        jButtonDouble = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuNovoJogo = new javax.swing.JMenu();
        jMenuItemIniciar = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMesa.setBackground(new java.awt.Color(0, 140, 30));
        jPanelMesa.setMaximumSize(new java.awt.Dimension(964, 404));
        jPanelMesa.setMinimumSize(new java.awt.Dimension(964, 404));

        jLabelCartaJogador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelApostasRotulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelApostasRotulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApostasRotulo.setText("Apostas: ");

        jLabelApostas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelApostas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApostas.setText("$0");

        jLabelCartaJogador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelMonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gray_back.png"))); // NOI18N

        jLabelCartaJogador10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelCartaJogador22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trans.png"))); // NOI18N

        jLabelSomaRotulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSomaRotulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSomaRotulo.setText("Soma:");

        jLabelSoma.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSoma.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoma.setText("0");

        jLabelSomaCroupierRotulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSomaCroupierRotulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSomaCroupierRotulo.setText("Soma Croupier:");

        jLabelSomaCroupier.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSomaCroupier.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSomaCroupier.setText("0");

        javax.swing.GroupLayout jPanelMesaLayout = new javax.swing.GroupLayout(jPanelMesa);
        jPanelMesa.setLayout(jPanelMesaLayout);
        jPanelMesaLayout.setHorizontalGroup(
            jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMesaLayout.createSequentialGroup()
                        .addComponent(jLabelApostasRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelApostas)
                        .addGap(155, 155, 155)
                        .addComponent(jLabelSomaRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSoma)
                        .addGap(57, 57, 57)
                        .addComponent(jLabelSomaCroupierRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSomaCroupier)
                        .addGap(223, 223, 223)
                        .addComponent(jLabelMonte))
                    .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMesaLayout.createSequentialGroup()
                            .addComponent(jLabelCartaJogador12)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador13)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador14)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador15)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador16)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador17)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador18)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador19)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador20)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador21)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador22))
                        .addGroup(jPanelMesaLayout.createSequentialGroup()
                            .addComponent(jLabelCartaJogador1)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador2)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador3)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador4)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador5)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador6)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador7)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador8)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador9)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador10)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCartaJogador11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMesaLayout.setVerticalGroup(
            jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCartaJogador12)
                    .addComponent(jLabelCartaJogador13)
                    .addComponent(jLabelCartaJogador14)
                    .addComponent(jLabelCartaJogador15)
                    .addComponent(jLabelCartaJogador16)
                    .addComponent(jLabelCartaJogador17)
                    .addComponent(jLabelCartaJogador18)
                    .addComponent(jLabelCartaJogador19)
                    .addComponent(jLabelCartaJogador21)
                    .addComponent(jLabelCartaJogador22)
                    .addComponent(jLabelCartaJogador20))
                .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMesaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApostasRotulo)
                            .addComponent(jLabelApostas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCartaJogador1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCartaJogador2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelMesaLayout.createSequentialGroup()
                        .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMesaLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabelMonte))
                            .addGroup(jPanelMesaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSomaRotulo)
                                    .addComponent(jLabelSoma)
                                    .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSomaCroupierRotulo)
                                        .addComponent(jLabelSomaCroupier)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanelMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCartaJogador3)
                            .addComponent(jLabelCartaJogador4)
                            .addComponent(jLabelCartaJogador5)
                            .addComponent(jLabelCartaJogador6)
                            .addComponent(jLabelCartaJogador7)
                            .addComponent(jLabelCartaJogador8)
                            .addComponent(jLabelCartaJogador10)
                            .addComponent(jLabelCartaJogador11)
                            .addComponent(jLabelCartaJogador9))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabelCroupier.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelCroupier.setText("Croupier");

        jLabelJogador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelJogador.setText("Jogador");

        jLabelFichasRotulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ficha.jpg"))); // NOI18N
        jLabelFichasRotulo.setText("Fichas:");

        jLabelFichas.setText("$0");

        jButtonHit.setText("Hit");

        jButtonStand.setText("Stand");

        jButtonSurrender.setText("Surrender");

        jButtonDouble.setText("Double");

        jMenuNovoJogo.setText("Novo Jogo");
        jMenuNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoJogoActionPerformed(evt);
            }
        });

        jMenuItemIniciar.setText("Iniciar");
        jMenuItemIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarActionPerformed(evt);
            }
        });
        jMenuNovoJogo.add(jMenuItemIniciar);

        jMenuBar.add(jMenuNovoJogo);

        jMenuSair.setText("Sair");

        jMenuItemFechar.setText("Fechar");
        jMenuSair.add(jMenuItemFechar);

        jMenuBar.add(jMenuSair);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jLabelJogador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelFichasRotulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFichas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonHit)
                        .addGap(55, 55, 55)
                        .addComponent(jButtonStand))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSurrender)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonDouble)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(jLabelCroupier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCroupier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelJogador)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFichasRotulo)
                            .addComponent(jLabelFichas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonHit)
                            .addComponent(jButtonStand))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSurrender)
                            .addComponent(jButtonDouble))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoJogoActionPerformed

    }//GEN-LAST:event_jMenuNovoJogoActionPerformed

    private void jMenuItemIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarActionPerformed
        boolean deuCerto = false;
        setNomeJogador(JOptionPane.showInputDialog(null, "Digite seu nome"));
        while (!deuCerto) {
            try {
                setFichas(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de fichas")));
                deuCerto = true;
            } catch (NumberFormatException erro) {
                deuCerto = false;
            }
        }
        Random rand = new Random();
        Carta carta1 = baralho.get(rand.nextInt(52));
        jLabelCartaJogador1.setIcon(carta1.getIcone());
      
    }//GEN-LAST:event_jMenuItemIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDouble;
    private javax.swing.JButton jButtonHit;
    private javax.swing.JButton jButtonStand;
    private javax.swing.JButton jButtonSurrender;
    private javax.swing.JLabel jLabelApostas;
    private javax.swing.JLabel jLabelApostasRotulo;
    private javax.swing.JLabel jLabelCartaJogador1;
    private javax.swing.JLabel jLabelCartaJogador10;
    private javax.swing.JLabel jLabelCartaJogador11;
    private javax.swing.JLabel jLabelCartaJogador12;
    private javax.swing.JLabel jLabelCartaJogador13;
    private javax.swing.JLabel jLabelCartaJogador14;
    private javax.swing.JLabel jLabelCartaJogador15;
    private javax.swing.JLabel jLabelCartaJogador16;
    private javax.swing.JLabel jLabelCartaJogador17;
    private javax.swing.JLabel jLabelCartaJogador18;
    private javax.swing.JLabel jLabelCartaJogador19;
    private javax.swing.JLabel jLabelCartaJogador2;
    private javax.swing.JLabel jLabelCartaJogador20;
    private javax.swing.JLabel jLabelCartaJogador21;
    private javax.swing.JLabel jLabelCartaJogador22;
    private javax.swing.JLabel jLabelCartaJogador3;
    private javax.swing.JLabel jLabelCartaJogador4;
    private javax.swing.JLabel jLabelCartaJogador5;
    private javax.swing.JLabel jLabelCartaJogador6;
    private javax.swing.JLabel jLabelCartaJogador7;
    private javax.swing.JLabel jLabelCartaJogador8;
    private javax.swing.JLabel jLabelCartaJogador9;
    private javax.swing.JLabel jLabelCroupier;
    private javax.swing.JLabel jLabelFichas;
    private javax.swing.JLabel jLabelFichasRotulo;
    private javax.swing.JLabel jLabelJogador;
    private javax.swing.JLabel jLabelMonte;
    private javax.swing.JLabel jLabelSoma;
    private javax.swing.JLabel jLabelSomaCroupier;
    private javax.swing.JLabel jLabelSomaCroupierRotulo;
    private javax.swing.JLabel jLabelSomaRotulo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemFechar;
    private javax.swing.JMenuItem jMenuItemIniciar;
    private javax.swing.JMenu jMenuNovoJogo;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelMesa;
    // End of variables declaration//GEN-END:variables
}
