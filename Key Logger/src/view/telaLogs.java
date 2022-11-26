package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class telaLogs extends javax.swing.JFrame {

    public JButton getjButton1() {
        return jButton_save;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton_save = jButton1;
    }
    
    public telaLogs() {
        initComponents();
    }

    public JLabel getRecords() {
        return Records;
    }

    public void setRecords(JLabel Records) {
        this.Records = Records;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenu getjMenu_file() {
        return jMenu_file;
    }

    public void setjMenu_file(JMenu jMenu_file) {
        this.jMenu_file = jMenu_file;
    }

    public JMenu getjMenu_menu() {
        return jMenu_menu;
    }

    public void setjMenu_menu(JMenu jMenu_menu) {
        this.jMenu_menu = jMenu_menu;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextArea_viewRecords() {
        return jTextArea_viewRecords;
    }

    public void setjTextArea_viewRecords(JTextArea jTextArea_viewRecords) {
        this.jTextArea_viewRecords = jTextArea_viewRecords;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_viewRecords = new javax.swing.JTextArea();
        Records = new javax.swing.JLabel();
        jButton_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_menu = new javax.swing.JMenu();
        jMenu_file = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jTextArea_viewRecords.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_viewRecords.setColumns(20);
        jTextArea_viewRecords.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea_viewRecords.setRows(5);
        jTextArea_viewRecords.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_viewRecords);

        Records.setFont(new java.awt.Font("MS PGothic", 0, 36)); // NOI18N
        Records.setForeground(new java.awt.Color(255, 255, 255));
        Records.setText("Records");

        jButton_save.setBackground(new java.awt.Color(0, 51, 204));
        jButton_save.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salve-.png"))); // NOI18N
        jButton_save.setText("Save");
        jButton_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_save.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton_save.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/digitando (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Records)
                                .addGap(265, 265, 265)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Records, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_save)
                .addGap(103, 103, 103))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 102));

        jMenu_menu.setBackground(new java.awt.Color(255, 255, 255));
        jMenu_menu.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_menu.setText("Menu");
        jMenuBar1.add(jMenu_menu);

        jMenu_file.setBackground(new java.awt.Color(255, 255, 255));
        jMenu_file.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_file.setText("Open records");
        jMenu_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_fileActionPerformed(evt);
            }
        });
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_fileActionPerformed
   
    }//GEN-LAST:event_jMenu_fileActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Records;
    private javax.swing.JButton jButton_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_file;
    private javax.swing.JMenu jMenu_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_viewRecords;
    // End of variables declaration//GEN-END:variables
}
