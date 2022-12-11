package View;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Password extends javax.swing.JFrame {

    public Password() {
        initComponents();
    }

    public JButton getjButton_editar() {
        return jButton_editar;
    }

    public JButton getjButton_listar() {
        return jButton_listar;
    }

    public void setjButton_listar(JButton jButton_listar) {
        this.jButton_listar = jButton_listar;
    }

    public void setjButton_editar(JButton jButton_editar) {
        this.jButton_editar = jButton_editar;
    }

    public JButton getjButton_excluir() {
        return jButton_excluir;
    }

    public void setjButton_excluir(JButton jButton_excluir) {
        this.jButton_excluir = jButton_excluir;
    }

    public JButton getjButton_inserir() {
        return jButton_inserir;
    }

    public void setjButton_inserir(JButton jButton_inserir) {
        this.jButton_inserir = jButton_inserir;
    }

    public JButton getjButton_sair() {
        return jButton_sair;
    }

    public void setjButton_sair(JButton jButton_sair) {
        this.jButton_sair = jButton_sair;
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

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_excluir = new javax.swing.JButton();
        jButton_editar = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();
        jButton_inserir = new javax.swing.JButton();
        jButton_listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jTable1.setBackground(new java.awt.Color(255, 255, 102));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Plataforma", "Email", "Usuario", "Senha"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jButton_excluir.setBackground(new java.awt.Color(255, 255, 153));
        jButton_excluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_excluir.setForeground(new java.awt.Color(0, 0, 0));
        jButton_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/trash-can.png"))); // NOI18N
        jButton_excluir.setText(" EXCLUIR");

        jButton_editar.setBackground(new java.awt.Color(255, 255, 153));
        jButton_editar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_editar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit.png"))); // NOI18N
        jButton_editar.setText(" EDITAR");

        jButton_sair.setBackground(new java.awt.Color(255, 255, 153));
        jButton_sair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_sair.setForeground(new java.awt.Color(0, 0, 0));
        jButton_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/saida-de-emergencia (2).png"))); // NOI18N
        jButton_sair.setText("SAIR");

        jButton_inserir.setBackground(new java.awt.Color(255, 255, 153));
        jButton_inserir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_inserir.setForeground(new java.awt.Color(0, 0, 0));
        jButton_inserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inserir (1).png"))); // NOI18N
        jButton_inserir.setText(" INSERIR");
        jButton_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inserirActionPerformed(evt);
            }
        });

        jButton_listar.setBackground(new java.awt.Color(255, 255, 153));
        jButton_listar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_listar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lista-de-desejos.png"))); // NOI18N
        jButton_listar.setText(" LISTAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jButton_listar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_editar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_inserir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_inserir)
                        .addComponent(jButton_editar)
                        .addComponent(jButton_excluir)
                        .addComponent(jButton_listar))
                    .addComponent(jButton_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_inserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_inserirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_editar;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JButton jButton_inserir;
    private javax.swing.JButton jButton_listar;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
