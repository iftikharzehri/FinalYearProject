/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import LMS.ConnectionProvider;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ifti
 */
public class Status extends javax.swing.JFrame {

    /**
     * Creates new form States
     */
    public Status() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        issuedTblScroll = new javax.swing.JScrollPane();
        issueTbl = new javax.swing.JTable();
        returnedTblScroll = new javax.swing.JScrollPane();
        returnedTbl = new javax.swing.JTable();
        issuedRefreshBtn = new javax.swing.JButton();
        returnedrefreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Status");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Issued Books");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Returned Books");

        jButton1.setBackground(new java.awt.Color(250, 148, 148));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/home/ifti/NetBeansProjects/LMS/src/Image/cross.png")); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        issuedTblScroll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                issuedTblScrollKeyPressed(evt);
            }
        });

        issueTbl.setBackground(new java.awt.Color(0, 204, 204));
        issuedTblScroll.setViewportView(issueTbl);

        returnedTbl.setBackground(new java.awt.Color(0, 204, 204));
        returnedTblScroll.setViewportView(returnedTbl);

        issuedRefreshBtn.setIcon(new javax.swing.ImageIcon("/home/ifti/NetBeansProjects/LibraryManagementSystem/src/Image/refresh1.png")); // NOI18N
        issuedRefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuedRefreshBtnActionPerformed(evt);
            }
        });

        returnedrefreshBtn.setIcon(new javax.swing.ImageIcon("/home/ifti/NetBeansProjects/LibraryManagementSystem/src/Image/refresh1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(returnedTblScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                    .addComponent(issuedTblScroll))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(issuedRefreshBtn)
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(returnedrefreshBtn)
                        .addGap(343, 343, 343)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(issuedRefreshBtn))
                .addGap(18, 18, 18)
                .addComponent(issuedTblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(returnedrefreshBtn))
                .addGap(18, 18, 18)
                .addComponent(returnedTblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void issuedTblScrollKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_issuedTblScrollKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_issuedTblScrollKeyPressed

    private void issuedRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuedRefreshBtnActionPerformed

        try {

            Connection con = (Connection) ConnectionProvider.getCon();
            Statement st = (Statement) con.createStatement();
            String sql = " ";

            ResultSet rs = null;
            st.execute();
            ResultSetMetaData rsmd = null;
            rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) issueTbl.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i + 1);

            }
            model.setColumnIdentifiers(colName);
            String id, first, last, age;
            while (rs.next()) {
                id = rs.getString(1);
                first = rs.getString(2);
                last = rs.getString(3);
                age = rs.getString(4);
                String[] row = {"id", "first", "last", "age"};
                model.addRow(row);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_issuedRefreshBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable issueTbl;
    private javax.swing.JButton issuedRefreshBtn;
    private javax.swing.JScrollPane issuedTblScroll;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable returnedTbl;
    private javax.swing.JScrollPane returnedTblScroll;
    private javax.swing.JButton returnedrefreshBtn;
    // End of variables declaration//GEN-END:variables
}
