package view;

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
        jButton_start = new javax.swing.JButton();
        jButton_acessLogs = new javax.swing.JButton();
        developer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        KeyLogger.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        KeyLogger.setForeground(new java.awt.Color(255, 255, 255));
        KeyLogger.setText("Key Logger");

        jButton_start.setBackground(new java.awt.Color(0, 51, 255));
        jButton_start.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_start.setForeground(new java.awt.Color(255, 255, 255));
        jButton_start.setText("Start");
        jButton_start.setToolTipText("");
        jButton_start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_startActionPerformed(evt);
            }
        });

        jButton_acessLogs.setBackground(new java.awt.Color(0, 51, 255));
        jButton_acessLogs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_acessLogs.setForeground(new java.awt.Color(255, 255, 255));
        jButton_acessLogs.setText("Acess Logs");
        jButton_acessLogs.setToolTipText("");
        jButton_acessLogs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_acessLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_acessLogsActionPerformed(evt);
            }
        });

        developer.setBackground(new java.awt.Color(255, 255, 255));
        developer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        developer.setForeground(new java.awt.Color(255, 255, 255));
        developer.setText("Developer by Bernardo Viero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KeyLogger)
                    .addComponent(imgLogo))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_acessLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(developer))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imgLogo)
                .addGap(18, 18, 18)
                .addComponent(KeyLogger)
                .addGap(30, 30, 30)
                .addComponent(jButton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton_acessLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
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

    private void jButton_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_startActionPerformed
      
    }//GEN-LAST:event_jButton_startActionPerformed

    private void jButton_acessLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_acessLogsActionPerformed
    }//GEN-LAST:event_jButton_acessLogsActionPerformed

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
    private javax.swing.JButton jButton_acessLogs;
    private javax.swing.JButton jButton_start;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
