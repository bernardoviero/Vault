package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaLogs extends javax.swing.JFrame {

    public JButton getjButton1() {
        return jButton_save;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton_save = jButton1;
    }

    public TelaLogs() {
        initComponents();
    }

    public JLabel getRecords() {
        return Records;
    }

    public void setRecords(JLabel Records) {
        this.Records = Records;
    }

    public JButton getjButton_openRecord() {
        return jButton_openRecord;
    }

    public void setjButton_openRecord(JButton jButton_openRecord) {
        this.jButton_openRecord = jButton_openRecord;
    }

    public JButton getjButton_returnMenu() {
        return jButton_returnMenu;
    }

    public void setjButton_returnMenu(JButton jButton_returnMenu) {
        this.jButton_returnMenu = jButton_returnMenu;
    }

    public JButton getjButton_save() {
        return jButton_save;
    }

    public void setjButton_save(JButton jButton_save) {
        this.jButton_save = jButton_save;
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
        Records = new javax.swing.JLabel();
        jButton_save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_viewRecords = new javax.swing.JTextArea();
        jButton_returnMenu = new javax.swing.JButton();
        jButton_openRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Records.setFont(new java.awt.Font("MS PGothic", 0, 36)); // NOI18N
        Records.setForeground(new java.awt.Color(255, 255, 255));
        Records.setText("Records");

        jButton_save.setBackground(new java.awt.Color(0, 153, 204));
        jButton_save.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salve-.png"))); // NOI18N
        jButton_save.setText("  Save");
        jButton_save.setToolTipText("");
        jButton_save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_save.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_save.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jTextArea_viewRecords.setEditable(false);
        jTextArea_viewRecords.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea_viewRecords.setColumns(20);
        jTextArea_viewRecords.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea_viewRecords.setRows(5);
        jTextArea_viewRecords.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea_viewRecords);

        jButton_returnMenu.setBackground(new java.awt.Color(0, 153, 204));
        jButton_returnMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_returnMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_returnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back (2).png"))); // NOI18N
        jButton_returnMenu.setText("  Return");
        jButton_returnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton_openRecord.setBackground(new java.awt.Color(0, 153, 204));
        jButton_openRecord.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton_openRecord.setForeground(new java.awt.Color(255, 255, 255));
        jButton_openRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-folder-with-document.png"))); // NOI18N
        jButton_openRecord.setText("  Open record");
        jButton_openRecord.setToolTipText("");
        jButton_openRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_openRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_openRecord.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_openRecord.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_openRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_openRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_openRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton_returnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Records)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_returnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Records, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_openRecord)
                    .addComponent(jButton_save))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_openRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_openRecordActionPerformed

    }//GEN-LAST:event_jButton_openRecordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Records;
    private javax.swing.JButton jButton_openRecord;
    private javax.swing.JButton jButton_returnMenu;
    private javax.swing.JButton jButton_save;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_viewRecords;
    // End of variables declaration//GEN-END:variables
}
