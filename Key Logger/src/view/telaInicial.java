package view;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class telaInicial extends javax.swing.JFrame {
    
    public telaInicial() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        KeyLogger = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        jButton_start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        KeyLogger.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        KeyLogger.setForeground(new java.awt.Color(255, 255, 255));
        KeyLogger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KeyLogger.setText("Key Logger");

        developer.setBackground(new java.awt.Color(255, 255, 255));
        developer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        developer.setForeground(new java.awt.Color(255, 255, 255));
        developer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        developer.setText("Developer by Bernardo Viero");
        developer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_start.setBackground(new java.awt.Color(0, 51, 204));
        jButton_start.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jButton_start.setForeground(new java.awt.Color(255, 255, 255));
        jButton_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botao-play (1).png"))); // NOI18N
        jButton_start.setText("Start");
        jButton_start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KeyLogger)
                    .addComponent(developer, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(imgLogo)
                .addGap(28, 28, 28)
                .addComponent(KeyLogger)
                .addGap(56, 56, 56)
                .addComponent(jButton_start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(developer)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getKeyLogger() {
        return KeyLogger;
    }

    public void setKeyLogger(JLabel KeyLogger) {
        this.KeyLogger = KeyLogger;
    }

    public JLabel getDeveloper() {
        return developer;
    }

    public void setDeveloper(JLabel developer) {
        this.developer = developer;
    }

    public JLabel getImgLogo() {
        return imgLogo;
    }

    public void setImgLogo(JLabel imgLogo) {
        this.imgLogo = imgLogo;
    }

    public JButton getjButton_start() {
        return jButton_start;
    }

    public void setjButton_start(JButton jButton_start) {
        this.jButton_start = jButton_start;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KeyLogger;
    private javax.swing.JLabel developer;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JButton jButton_start;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
