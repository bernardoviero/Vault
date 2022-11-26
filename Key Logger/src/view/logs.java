package view;

public class logs extends javax.swing.JFrame {
    
    public logs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_viewRecords = new javax.swing.JTextArea();
        Records = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_menu = new javax.swing.JMenu();
        jMenu_file = new javax.swing.JMenu();
        jMenuItem_openRecord = new javax.swing.JMenuItem();
        jMenuItem_saveRecord = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jTextArea_viewRecords.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_viewRecords.setColumns(20);
        jTextArea_viewRecords.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea_viewRecords.setRows(5);
        jTextArea_viewRecords.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_viewRecords);

        Records.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        Records.setForeground(new java.awt.Color(255, 255, 255));
        Records.setText("Records");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Records, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Records)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 102));

        jMenu_menu.setBackground(new java.awt.Color(255, 255, 255));
        jMenu_menu.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_menu.setText("Menu");
        jMenuBar1.add(jMenu_menu);

        jMenu_file.setBackground(new java.awt.Color(255, 255, 255));
        jMenu_file.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_file.setText("File");
        jMenu_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_fileActionPerformed(evt);
            }
        });

        jMenuItem_openRecord.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem_openRecord.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem_openRecord.setText("Abrir registro");
        jMenu_file.add(jMenuItem_openRecord);

        jMenuItem_saveRecord.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem_saveRecord.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem_saveRecord.setText("Salvar Registro");
        jMenu_file.add(jMenuItem_saveRecord);

        jMenuBar1.add(jMenu_file);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_fileActionPerformed
   
    }//GEN-LAST:event_jMenu_fileActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Records;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_openRecord;
    private javax.swing.JMenuItem jMenuItem_saveRecord;
    private javax.swing.JMenu jMenu_file;
    private javax.swing.JMenu jMenu_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_viewRecords;
    // End of variables declaration//GEN-END:variables
}
