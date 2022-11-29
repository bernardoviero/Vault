package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start extends javax.swing.JFrame {
    
    public Start() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        KeyLogger = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        jButton_start = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        KeyLogger.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        KeyLogger.setForeground(new java.awt.Color(255, 255, 255));
        KeyLogger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KeyLogger.setText("KEYLOGGER");

        developer.setBackground(new java.awt.Color(255, 255, 255));
        developer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        developer.setForeground(new java.awt.Color(255, 255, 255));
        developer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        developer.setText("Developer by Bernardo Viero");
        developer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton_start.setBackground(new java.awt.Color(0, 153, 204));
        jButton_start.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton_start.setForeground(new java.awt.Color(255, 255, 255));
        jButton_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botao-play (1).png"))); // NOI18N
        jButton_start.setText("Start");
        jButton_start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_startActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 76, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(KeyLogger)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(developer, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(KeyLogger)
                .addGap(81, 81, 81)
                .addComponent(jButton_start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(developer)
                .addGap(29, 29, 29))
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

    private void jButton_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_startActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KeyLogger;
    private javax.swing.JLabel developer;
    private javax.swing.JButton jButton_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
